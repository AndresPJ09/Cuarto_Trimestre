function save() {

  try {

    var data = {
      "code": $("#code").val(),
      "name": $("#name").val(),
      "country": {
        "id": parseInt($('#country_id').val())
      },
      "state": parseInt($("#state").val())
    };

    var jsonData = JSON.stringify(data);
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/departament",
      method: "POST",
      dataType: "json",
      contentType: "application/json",
      data: jsonData,
      success: function (data) {
        alert("Registro agregado con éxito");
        clearData();
        loadData();
      },
      error: function (error) {
        alert(`Error no se pudo realizar el registro.`);
        //console.log($("#person_id").val());
      },
    });
  } catch (error) {
    console.error("Error obteniendo el cliente:", error);
  }
}


function clearData() {
  $("#id").val("");
  $("#code").val("");
  $("#name").val("");
  $("#country_id").val("");
  $("#state").val("");
  var btnAgregar = $('button[name="btnAgregar"]');
  btnAgregar.text("Agregar");
  btnAgregar.attr("onclick", "save()");
}


function loadData() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/departament",
    method: "GET",
    dataType: "json",
    success: function (response) {
      console.log(response.data);
      var html = "";
      var data = response.data;
      data.forEach(function (item) {
        // Construir el HTML para cada objeto
        if (!item.deletedAt) {
          html +=
            `<tr>
                    <td>${item.code}</td>
                    <td>` + item.name + `</td>
                    <td>` + item.country.name + `</td>
                    <td>` + (item.state == true ? "Activo" : "Inactivo") + `</td>
                    <td> <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" onclick="findById(${item.id})"> <img src="../assets/icon/pencil-square.svg" > </button>
                    <button type="button" class="btn btn-secundary" onclick="deleteById(${item.id})"> <img src="../assets/icon/trash3.svg" > </button></td>
                </tr>`;
        }
      });

      $("#resultData").html(html);
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    },
  });
}

function loadPais() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/country",
    method: "GET",
    dataType: "json",
    success: function (response) {
      var html = "";
      if (response.status && Array.isArray(response.data)) {
        console.log(response.data);
        response.data.forEach(function (item) {
          // Construir el HTML para cada objeto
          html += `<option value="${item.id}">${item.name}</option>`;
        });
        $("#country_id").html(html);
      } else {
        console.error("Error: No se pudo obtener la lista de roles.");
      }
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
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
      url: "http://localhost:9000/serviceSecurity/v1/api/departament/" + id,
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


function update() {
  // Construir el objeto data
  try {
    var data = {
      "code": $("#code").val(),
      "name": $("#name").val(),
      "country": {
        "id": parseInt($('#country_id').val())
      },
      "state": parseInt($("#state").val())
    };

    var id = $("#id").val();
    var jsonData = JSON.stringify(data);
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/departament/" + id,
      data: jsonData,
      method: "PUT",
      headers: {
        "Content-Type": "application/json",
      },
    }).done(function (result) {
      alert("Registro actualizado con éxito");
      loadData();
      clearData();

      //actualzar boton
      var btnAgregar = $('button[name="btnAgregar"]');
      btnAgregar.text("Agregar");
      btnAgregar.attr("onclick", "save()");
    });
  } catch (error) {
    alert("Error en actualizar user.");
    console.error("Error en la solicitud:", error);
    //actualzar boton
    loadData();
    clearData();
    var btnAgregar = $('button[name="btnAgregar"]');
    btnAgregar.text("Agregar");
    btnAgregar.attr("onclick", "save()");
  }
}

function findById(id) {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/departament/" + id,
    method: "GET",
    dataType: "json",
    success: function (response) {
      var data = response.data;
      $("#id").val(data.id);
      $("#code").val(data.code);
      $('#name').val(data.name);
      $('#country_id').val(data.country.id);
      $("#state").val(data.state == true ? 1 : 0);

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