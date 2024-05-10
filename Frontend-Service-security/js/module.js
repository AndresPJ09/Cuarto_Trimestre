function save() {

    var data = {
      "name": $("#name").val(),
      "route": $("#route").val(),
      "description": $("#description").val(),
      "state": parseInt($("#state").val())
    };

    var jsonData = JSON.stringify(data);
    Swal.showLoading();
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/module",
      method: 'POST',
      contentType: 'application/json',
      data: jsonData,
      success: function (data) {
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
  $("#route").val("");
  $("#name").val("");
  $("#description").val("");
  $("#state").val("");
  var btnAgregar = $('button[name="btnAgregar"]');
  btnAgregar.text("Agregar");
  btnAgregar.attr("onclick", "save()");
}

function loadData() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/module",
    method: "GET",
    dataType: "json",
    success: function (response) {
      console.log(response.data);
      var html = "";
      var data = response.data;
      data.forEach(function (item) {
        if (!item.deletedAt) {
          html +=
            `<tr>
              <td>${item.name}</td>
              <td>${item.description}</td>
              <td>${item.route}</td>
              <td>${item.state == true ? "Activo" : "Inactivo"}</td>
              <td> <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" onclick="findById(${item.id})"> <img src="../assets/icon/pencil-square.svg" > </button>
              <button type="button" class="btn btn-secundary" onclick="deleteById(${item.id})"> <img src="../assets/icon/trash3.svg" > </button></td>
            </tr>`;
        }
      });

      $("#resultData").html(html);
    },
    error: function (error) {
      console.error("Error en la solicitud:", error);
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
    url: "http://localhost:9000/serviceSecurity/v1/api/module/" + id,
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
    url: "http://localhost:9000/serviceSecurity/v1/api/module/" + id,
    method: "GET",
    dataType: "json",
    success: function (response) {
      var data = response.data;
      $("#id").val(data.id);
      $("#route").val(data.route);
      $('#name').val(data.name);
      $('#description').val(data.description);
      $("#state").val(data.state == true ? 1 : 0);

      // Cambiar botón a Actualizar
      var btnAgregar = $('button[name="btnAgregar"]');
      btnAgregar.text("Actualizar");
      btnAgregar.attr("onclick", "update()");
    },
    error: function (error) {
      console.error("Error en la solicitud:", error);
    },
  });
}

function update() {
  try {
    var data = {
      "id": $("#id").val(),
      "name": $("#name").val(),
      "route": $("#route").val(),
      "description": $("#description").val(),
      "state": parseInt($("#state").val())
    };
    console.log("Data:", data); // Para verificar la estructura final de la data

    var jsonData = JSON.stringify(data);
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/module/" + data.id,
      data: jsonData,
      method: "PUT",
      headers: {
        "Content-Type": "application/json",
      },
    }).done(function (result) {
      alert("Registro actualizado con éxito");
      loadData();
      clearData();
      // Cambiar botón a Agregar
      var btnAgregar = $('button[name="btnAgregar"]');
      btnAgregar.text("Agregar");
      btnAgregar.attr("onclick", "save()");
    });
  } catch (error) {
    alert("Error al actualizar el registro.");
    console.error("Error en la solicitud:", error);
    loadData();
    clearData();
    var btnAgregar = $('button[name="btnAgregar"]');
    btnAgregar.text("Agregar");
    btnAgregar.attr("onclick", "save()");
  }
}