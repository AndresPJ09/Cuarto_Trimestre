
function save() {

  var selectedOptions = $("#multiple-select-field").val();

  // Mapear los valores seleccionados a un array de objetos
  var viewData = selectedOptions.map(function (option) {
    return { "id": parseInt(option) };
  });

  // Convertir el array de objetos a una cadena separada por comas
  var viewDataString = viewData.map(function (obj) {
    return JSON.stringify(obj);
  }).join(',');

  // Parsear la cadena resultante de nuevo a un array de objetos JSON
  var viewDataArray = JSON.parse('[' + viewDataString + ']');

  console.log(selectedPersonId);

  // Las correcciones y ajustes se aplicarán aquí
  var selectedPersonId = parseInt($("#selected_person_id").val());
  if (isNaN(selectedPersonId) || selectedPersonId === null) {
    console.error("ID de persona no válido");
    return;
  }

  try {
    var data = {
      "username": $("#username").val(),
      "password": $("#password").val(),
      "person": {
        "id": selectedPersonId
      },
      "role": viewDataArray,
      "state": parseInt($("#estado").val())
    };

    var jsonData = JSON.stringify(data);
    Swal.showLoading();
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/user",
      method: 'POST',
      contentType: 'application/json',
      data: jsonData,
      success: function (data) {
        Swal.fire('Guardado', 'Registro exitoso', 'success');
        loadData();
        clearData();
      },
      error: function (error) {
        alert(`la persona: ${$("#person_id").val()}, ya cuenta con una cuenta de usuario `);
        //console.log($("#person_id").val());
      },
    });
  } catch (error) {
    console.error("Error obteniendo el cliente:", error);
  }
}


function loadRole() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/role",
    method: "GET",
    dataType: "json",
    success: function (response) {
      var html = "";
      if (response.status && Array.isArray(response.data)) {
        response.data.forEach(function (item) {
          // Construir el HTML para cada objeto
          html += `<option value="${item.id}">${item.name}</option>`;
        });
        $("#multiple-select-field").html(html);
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


function clearData() {
  $("#id").val("");
  $("#username").val("");
  $("#password").val("");
  $("#person_id").val("");
  $("#role_id").val("");
  $("#estado").val("");
  var btnAgregar = $('button[name="btnAgregar"]');
  btnAgregar.text("Agregar");
  btnAgregar.attr("onclick", "save()");
}


function loadData() {
  console.log("ejecutando loadData");
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/user",
    method: "GET",
    dataType: "json",
    success: function (response) {
      console.log(response.data);
      var html = "";
      var data = response.data;
      data.forEach(function (item) {
        // Construir el HTML para cada objeto
        if (!item.deletedAt) { // Verificar si el campo deletedAt es nulo (no eliminado lógicamente)

          html +=
            `<tr>
                    <td>${item.username}</td>
                    <td>` + item.password + `</td>
                    <td>` + item.person.firstName + ' ' + item.person.lastName +`</td>
                    <td><ul>` + item.role.reduce((accumulator, currentValue) => accumulator + (`<li>${currentValue.name}</li>`), '',) + `</ul></td>
                    <td>` + (item.state == true ? "Activo" : "Inactivo") + `</td>
                    <td> <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" onclick="findById(${item.id})"> <img src="../assets/icon/pencil-square.svg" > </button>
                    <button type="button" class="btn btn-secundary" style="background-color: red;" onclick="deleteById(${item.id})"> <img src="../assets/icon/trash3.svg" > </button></td>
                </tr>`;
        };
      });

      $("#resultData").html(html);

    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    },
  });
}

function loadPerson() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/person",
    method: "GET",
    dataType: "json",
    success: function (response) {
      if (response.status && Array.isArray(response.data)) {
        var personies = response.data.map(function (person) {
          return {
            label: person.firstName + ' ' + person.lastName,
            value: person.id
          };
        });

        // Inicializar el autocompletado en el campo de entrada de texto
        $("#person_id").autocomplete({
          source: personies,
          select: function (event, ui) {
            // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
            $("#selected_person_id").val(ui.item.value);
            // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
            $("#person_id").val(ui.item.label);
            console.log("ID de persona seleccionada: " + ui.item.value);
            return false; // Evita la propagación del evento y el formulario de envío
          }
        });
      } else {
        console.error("Error: No se pudo obtener la lista de personas.");
      }
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    }
  });
}


function update() {
  // Construir el objeto data
  var selectedOptions = $("#multiple-select-field").val();

  // Mapear los valores seleccionados a un array de objetos
  var viewData = selectedOptions.map(function (option) {
    return { "id": parseInt(option) };
  });

  // Convertir el array de objetos a una cadena separada por comas
  var viewDataString = viewData.map(function (obj) {
    return JSON.stringify(obj);
  }).join(',');

  // Parsear la cadena resultante de nuevo a un array de objetos JSON
  var viewDataArray = JSON.parse('[' + viewDataString + ']');

  // Las correcciones y ajustes se aplicarán aquí
  var selectedPersonId = parseInt($("#selected_person_id").val());
  if (isNaN(selectedPersonId) || selectedPersonId === null) {
    console.error("ID de persona no válido");
    return;
  }

  try {
    var data = {
      "username": $("#username").val(),
      "password": $("#password").val(),
      "person": {
        "id": selectedPersonId
      },
      "role": viewDataArray,
      "state": parseInt($("#estado").val())
    };

    var id = $("#id").val();
    var jsonData = JSON.stringify(data);
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/user/" + id,
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
    url: "http://localhost:9000/serviceSecurity/v1/api/user/" + id,
    method: "GET",
    dataType: "json",
    success: function (response) {
      var data = response.data;
      $("#id").val(data.id);
      $("#username").val(data.username);
      $('#password').val(data.password);
      $("#selected_person_id").val(data.person.id);
      $("#person_id").val(data.person.firstName + " " + data.person.lastName);
      // Extraer los valores de 'id' de cada objeto en data.view
      var selectedValues = data.role.map(function (item) {
        return item.id;
      });

      // Deseleccionar todas las opciones primero
      $('#multiple-select-field option').prop('selected', false);

      // Seleccionar las opciones correspondientes
      selectedValues.forEach(function (value) {
        $('#multiple-select-field option[value="' + value + '"]').prop('selected', true);
      });

      // Trigger evento change para actualizar visualización
      $('#multiple-select-field').trigger('change');
      $("#estado").val(data.state == true ? 1 : 0);

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
    url: "http://localhost:9000/serviceSecurity/v1/api/user/" + id,
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
