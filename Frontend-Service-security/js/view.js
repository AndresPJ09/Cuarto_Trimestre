function save() {

  var selectedOptions = $("#multiple-select-field").val();

  // Verificar si se han seleccionado opciones en el campo multiple-select-field
  if (selectedOptions && selectedOptions.length > 0) {
    // Mapear los valores seleccionados a un array de objetos
    var moduleData = selectedOptions.map(function (option) {
      return { "id": parseInt(option) };
    });

    // Convertir el array de objetos a una cadena separada por comas
    var moduleDataString = moduleData.map(function (obj) {
      return JSON.stringify(obj);
    }).join(',');

    // Parsear la cadena resultante de nuevo a un array de objetos JSON
    var moduleDataArray = JSON.parse('[' + moduleDataString + ']');


    try {

      var data = {
        "name": $("#nombre").val(),
        "description": $("#descripcion").val(),
        "route": $("#route").val(),
        "module": moduleDataArray,
        "state": parseInt($("#estado").val())
      };

      console.log("Data:", data); // Para verificar la estructura final de la data
    } catch (error) {
      console.error("Error al construir la data:", error);
    }
  } else {
    // Si no se han seleccionado opciones, crear la estructura de datos sin la parte "view"
    try {
      var data = {
        "name": $("#nombre").val(),
        "description": $("#descripcion").val(),
        "route": $("#route").val(),
        "state": parseInt($("#estado").val())
      };
      console.log("Data:", data); // Para verificar la estructura final de la data
    } catch (error) {
      console.error("Error al construir la data:", error);
    }
  }
  try {

    console.log("Data:", data); // Para verificar la estructura final de la data


    var jsonData = JSON.stringify(data);
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/view",
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
  $("#nombre").val("");
  $("#descripcion").val("");
  $("#route").val("");
  $("#multiple-select-field").val("");
  $("#estado").val("");
  var btnAgregar = $('button[name="btnAgregar"]');
  btnAgregar.text("Agregar");
  btnAgregar.attr("onclick", "save()");
}

function loadModule() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/module",
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


function loadData() {
  $.ajax({
    url: "http://localhost:9000/serviceSecurity/v1/api/view",
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
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.route}</td>
                    <td><ul>` + item.module.reduce((accumulator, currentValue) => accumulator + (`<li>${ currentValue.route }</li>`), '',) + `</ul></td>
                    <td>` + (item.state == true ? "Activo" : "Inactivo") + `</td>
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
  // Mostrar una alerta de confirmación antes de proceder
  if (confirm("¿Estás seguro de que quieres eliminar este registro?")) {
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/view/" + id,
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
  var selectedOptions = $("#multiple-select-field").val();

  // Verificar si se han seleccionado opciones en el campo multiple-select-field
  if (selectedOptions && selectedOptions.length > 0) {
    // Mapear los valores seleccionados a un array de objetos
    var moduleData = selectedOptions.map(function (option) {
      return { "id": parseInt(option) };
    });

    // Convertir el array de objetos a una cadena separada por comas
    var moduleDataString = moduleData.map(function (obj) {
      return JSON.stringify(obj);
    }).join(',');

    // Parsear la cadena resultante de nuevo a un array de objetos JSON
    var moduleDataArray = JSON.parse('[' + moduleDataString + ']');

    try {
      var data = {
        "name": $("#nombre").val(),
        "description": $("#descripcion").val(),
        "route": $("#route").val(),
        "module": moduleDataArray, // Colocar la cadena entre corchetes
        "state": parseInt($("#estado").val())
      };
      console.log("Data:", data); // Para verificar la estructura final de la data
    } catch (error) {
      console.error("Error al construir la data:", error);
    }
  } else {
    // Si no se han seleccionado opciones, crear la estructura de datos sin la parte "view"
    try {
      var data = {
        "name": $("#nombre").val(),
        "description": $("#descripcion").val(),
        "route": $("#route").val(),
        "state": parseInt($("#estado").val())
      };
      console.log("Data:", data); // Para verificar la estructura final de la data
    } catch (error) {
      console.error("Error al construir la data:", error);
    }
  }
  try {

    var id = $("#id").val();
    var jsonData = JSON.stringify(data);
    $.ajax({
      url: "http://localhost:9000/serviceSecurity/v1/api/view/" + id,
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
    url: "http://localhost:9000/serviceSecurity/v1/api/view/" + id,
    method: "GET",
    dataType: "json",
    success: function (response) {
      var data = response.data;
      $("#id").val(data.id);
      $("#route").val(data.route);
      $('#nombre').val(data.name);
      $('#descripcion').val(data.description);
      $("#estado").val(data.state == true ? 1 : 0);
      // Extraer los valores de 'id' de cada objeto en data.view
      var selectedValues = data.module.map(function (item) {
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
