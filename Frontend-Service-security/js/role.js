function save() {

  var data = {
    "name": $("#name").val(),
    "description": $("#description").val(),
    "state": parseInt($("#state").val())
  };
  console.log("Data:", data); // Para verificar la estructura final de la data
  var jsonData = JSON.stringify(data);
  Swal.showLoading();
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/role",
    method: 'POST',
    contentType: 'application/json',
    data: jsonData,
    success: function (response) {
      Swal.fire('Guardado', 'Registro exitoso', 'success');
      loadData();
      clearData();
    },
    error: function (error) {
      Swal.fire('Error', 'Error al registrar: ' + error.responseText, 'error');
      console.error('Error al registrar', error);
    }
  });
}

function clearData() {
  $("#id").val("");
  $("#name").val("");
  $("#description").val("");
  $("#state").val("");
  var btnAgregar = $('button[name="btnAgregar"]');
  btnAgregar.text("Agregar");
  btnAgregar.attr("onclick", "save()");
}

function loadData() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/role",
    method: "GET",
    success: function (response) {
      console.log(response.data);
      var html = "";
      response.data.forEach(function (item) {
        if (!item.deletedAt) {
          html += `<tr>
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.state ? "Active" : "Inactive"}</td>
                    <td> <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" onclick="findById(${item.id})"> <img src="../assets/icon/pencil-square.svg" > </button>
                  <button type="button" class="btn btn-secundary" onclick="deleteById(${item.id})"> <img src="../assets/icon/trash3.svg" > </button></td>
              </tr>`;
        }
      });
      $("#resultData").html(html);
    },
    error: function (error) {
      console.error("Error al cargar los datos:", error);
    },
  });
}

function deleteById(id) {
  Swal.fire({
    title: '¿Estás seguro?',
    text: "No podrás revertir esta acción!",
    icon: 'warning',
    showCancelButton: true,
    confirmButtonColor: '#3085d6',
    cancelButtonColor: '#d33',
    confirmButtonText: 'Sí, eliminar!',
    cancelButtonText: 'Cancelar'
  }).then((result) => {
    if (result.isConfirmed) {
      $.ajax({
        url: `http://localhost:9000/serviceSecurity/v1/api/role/${id}`,
        method: "delete",
        headers: {
          "Content-Type": "application/json",
        }
      }).done(function (result) {
        Swal.fire({
          title: 'Eliminado!',
          text: 'El registro ha sido eliminado.',
          icon: 'success',
          timer: 1500, // Tiempo antes de cerrar automáticamente
          showConfirmButton: false, // No mostrar botón de confirmación
        });
        loadData(); // Asegúrate de que esta función actualiza correctamente los datos en tu vista
      }).fail(function (error) {
        Swal.fire({
          title: 'Error!',
          text: 'No se pudo eliminar el registro: ' + error.statusText,
          icon: 'error',
          timer: 1500,
          showConfirmButton: false,
        });
      });
    } else if (result.dismiss === Swal.DismissReason.cancel) {
      Swal.fire({
        title: 'Cancelado',
        text: 'La operación de eliminación ha sido cancelada',
        icon: 'error',
        timer: 1500,
        showConfirmButton: false,
      });
    }
  });
}

function findById(id) {
  $.ajax({
    url: `http://localhost:9000/serviceSecurity/v1/api/role/${id}`,
    method: "GET",
    success: function (response) {
      $("#id").val(response.data.id);
      $("#name").val(response.data.name);
      $("#description").val(response.data.description);
      $("#state").val(response.data.state ? 1 : 0);
      //Cambiar boton.
      var btnAgregar = $('button[name="btnAgregar"]');
      btnAgregar.text("Actualizar");
      btnAgregar.attr("onclick", "update()");
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    },
  });
}

function update() {
  try {
    var data = {
      "name": $("#name").val(),
      "description": $("#description").val(),
      "state": parseInt($("#state").val())
    };
    console.log("Data:", data);
    var id = $("#id").val();
    var jsonData = JSON.stringify(data);
    $.ajax({
      url: `http://localhost:9000/serviceSecurity/v1/api/role/${id}`,
      method: "PUT",
      contentType: "application/json",
      data: jsonData,
      success: function (result) {
        alert("Registro actualizado con éxito");
        clearData();
        loadData();
      },
      error: function (error) {
        console.error("Error en la solicitud de actualización:", error);
      },
    });
  } catch (error) {
    console.error("Error al actualizar los datos:", error);
  }
}
