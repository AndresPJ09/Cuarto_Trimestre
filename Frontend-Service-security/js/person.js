function save() {
  try {
    var selectedCityId = parseInt($("#selected_city_id").val());
    if (isNaN(selectedCityId) || selectedCityId === null) {
      console.error("ID de ciudad no válido");
      return;
    }

    console.log(personData);
    var personData = {
      "firstName": $("#firstName").val(),
      "lastName": $("#lastName").val(),
      "documentType": $("#Document_Type").val(),
      "document": $("#document").val(),
      "city": {
        "id": selectedCityId
      },
      "email": $("#email").val(),
      "phone": $("#phone").val(),
      "dateOfBirth": $("#dateOfBirth").val(),
      "gender": $("#gender").val(),
      "address": $("#address").val() + ' No ' + $("#numeral").val() + ' - ' + $("#numeral2").val() + ' - ' + $("#description").val(),
      'state': parseInt($('#state').val())
    };

    console.log(personData);

    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/person",
      method: "POST",
      dataType: "json",
      contentType: "application/json",
      data: JSON.stringify(personData),
      success: function (data) {
        var id = data.id
        console.log(data.data);

        alert("Registro agregado con éxito");
        clearData();
        loadData();
      },
      error: function (error) {
        alert(`La persona: ${$("#person_id").val()} ya cuenta con una cuenta de persona`);
      },
    });
  } catch (error) {
    console.error("Error obteniendo el cliente:", error);
  }

}


function loadCity() {
  console.log("Ejecutando loadCity");
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/city",
    method: "GET",
    dataType: "json",
    success: function (response) {
      if (response.status && Array.isArray(response.data)) {
        var cities = response.data.map(function (city) {
          return {
            label: city.name,
            value: city.id // Agrega el ID como valor
          };
        });

        // Inicializar el autocompletado en el campo de entrada de texto
        $("#city_id").autocomplete({
          source: function (request, response) {
            var results = $.ui.autocomplete.filter(cities, request.term);
            if (!results.length) {
              results = [{ label: 'No se encontraron resultados', value: null }];
            }
            response(results);
          },
          select: function (event, ui) {
            // Al seleccionar un elemento del autocompletado, guarda el ID en un campo oculto
            $("#selected_city_id").val(ui.item.value);
            // Actualiza el valor del campo de entrada con el nombre de la persona seleccionada
            $("#city_id").val(ui.item.label);
            console.log("ID de ciudad seleccionada: " + ui.item.value);
            return false; // Evita la propagación del evento y el formulario de envío
          }
        });
      } else {
        console.error("Error: No se pudo obtener la lista de ciudades.");
      }
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    },
  });
}


function loadTypeDocument() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/enum/tipodocumento",
    method: "GET",
    dataType: "json",
    success: function (response) {
      console.log(response);
      var html = '<option value="">Select Document Type</option>'; // Default option
      response.forEach(function (item) {
        // Construir el HTML para cada objeto
        html += `<option value="${item}">${item}</option>`;
      });
      $("#Document_Type").html(html);

    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    },
  });
}


function loadGender() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/enum/gender",
    method: "GET",
    dataType: "json",
    success: function (response) {
      console.log(response);
      var html = "";
      response.forEach(function (item) {
        // Construir el HTML para cada objeto
        html += `<option value="${item}">${item}</option>`;
      });
      $("#gender").html(html);
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    },
  });
}


function loadAddress() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/enum/address",
    method: "GET",
    dataType: "json",
    success: function (response) {
      console.log(response);
      var html = "";
      response.forEach(function (item) {
        // Construir el HTML para cada objeto
        html += `<option value="${item}">${item}</option>`;
      });
      $("#address").html(html);
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error("Error en la solicitud:", error);
    },
  });
}


function clearData() {
  $("#id").val("");
  $("#firstName").val("");
  $("#lastName").val("");
  $("#Document_Type").val("");
  $("#city_id").val("");
  $("#document").val("");
  $("#email").val("");
  $("#phone").val("");
  $("#dateOfBirth").val("");
  $("#gender").val("");
  $("#address").val("");
  $("#state").val("");
}


function loadData() {
  console.log("ejecutando loadData");
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/person",
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
                  <td>${item.firstName}</td>
                  <td>` + item.lastName + `</td>
                  <td>` + item.documentType + `</td>
                  <td>` + item.document + `</td>
                  <td>` + item.city.name + `</td>
                  <td>` + item.email + `</td>
                  <td>` + item.phone + `</td>
                  <td>` + item.dateOfBirth + `</td>
                  <td>` + item.gender + `</td>
                  <td>` + item.address + `</td>
                  <td>` + (item.state == true ? "Activo" : "Inactivo") + `</td>
                  <td> <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" onclick="findById(${item.id})"> <img src="../assets/icon/pencil-square.svg" > </button>
                  <button type="button" class="btn btn-secundary" onclick="deleteById(${item.id})"> <img src="../assets/icon/trash3.svg" > </button></td>
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


function deleteById(id) {
  // Mostrar una alerta de confirmación antes de proceder
  if (confirm("¿Estás seguro de que quieres eliminar este registro?")) {
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/person/" + id,
      method: "delete",
      headers: {
        "Content-Type": "application/json",
      },
    }).done(function (result) {
      alert("Registro eliminado con éxito");
      loadData(); // Asegúrate de que esta función actualiza correctamente los datos en tu vista
    }).fail(function (error) {
      alert("Error al eliminar el registro: " + error.statusText); // Manejo de error
    });
  } else {
    // Si el usuario cancela, simplemente retornamos sin hacer nada
    console.log("Operación cancelada por el usuario.");
  }
}

function update() {
  // Construir el objeto data
  try {

    var selectedCityId = parseInt($("#selected_city_id").val());
    if (isNaN(selectedCityId) || selectedCityId === null) {
      console.error("ID de ciudad no válido");
      return;
    }

    var data = {
      "firstName": $("#firstName").val(),
      "lastName": $("#lastName").val(),
      "documentType": $("#Document_Type").val(),
      "document": $("#document").val(),
      "city": {
        "id": selectedCityId
      },
      "email": $("#email").val(),
      "phone": $("#phone").val(),
      "dateOfBirth": $("#dateOfBirth").val(),
      "gender": $("#gender").val(),
      "address": $("#address").val() + ' No ' + $("#numeral").val() + ' - ' + $("#numeral2").val() + ' - ' + $("#description").val(),
      'state': parseInt($('#state').val())
    };

    var id = $("#id").val();
    var jsonData = JSON.stringify(data);
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/person/personCustomer/" + id,
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
    alert("Error en actualizar person.");
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
    url: "http://localhost:9000/serviceSecurity/v1/api/person/" + id,
    method: "GET",
    dataType: "json",
    success: function (response) {
      var data = response.data;
      $("#id").val(data.id);
      $("#firstName").val(data.firstName);
      $("#lastName").val(data.lastName);
      $('#Document_Type').val(data.documentType);
      $('#document').val(data.document);
      $("#selected_city_id").val(data.city.id);
      $("#city_id").val(data.city.name);
      $('#email').val(data.email);
      $('#phone').val(data.phone);
      $('#dateOfBirth').val(data.dateOfBirth);
      $('#gender').val(data.gender);
      $('#address').val(data.address);
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


function clearData() {
  $("#id").val("");
  $("#firstName").val("");
  $("#lastName").val("");
  $("#Document_Type").val("");
  $("#document").val("");
  $("#city_id").val("");
  $("#email").val("");
  $("#phone").val("");
  $("#dateOfBirth").val("");
  $("#gender").val("");
  $("#address").val("");
  $("#state").val("");
}


