function save() {
    var selectedCityId = parseInt($("#selected_city_id").val());
    if (isNaN(selectedCityId) || selectedCityId === null) {
        console.error("ID de ciudad no válido");
        return;
    }

    try {

        var data = {
            "nit": $("#nit").val(),
            "rs": $("#rs").val(),
            "address": $("#address").val() + ' No ' + $("#numeral").val() + ' - ' + $("#numeral2").val() + ' - ' + $("#description").val(),
            "phone": $("#phone").val(),
            "email": $("#email").val(),
            "web": $("#web").val(),
            "city": {
                "id": selectedCityId
            },
            "state": parseInt($("#state").val())
        };

        var jsonData = JSON.stringify(data);
        $.ajax({
            url: "http://localhost:9000/serviceSecurity/v1/api/company",
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
    $("#nit").val("");
    $("#rs").val("");
    $("#address").val("");
    $("#phone").val("");
    $("#email").val("");
    $("#web").val("");
    $("#city_id").val("");
    $("#state").val("");
    var btnAgregar = $('button[name="btnAgregar"]');
    btnAgregar.text("Agregar");
    btnAgregar.attr("onclick", "save()");
}


function loadData() {
    $.ajax({
        url: "http://localhost:9000/serviceSecurity/v1/api/company",
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
                    <td>${item.nit}</td>
                    <td>` + item.rs + `</td>
                    <td>` + item.address + `</td>
                    <td>` + item.phone + `</td>
                    <td>` + item.email + `</td>
                    <td>` + item.web + `</td>
                    <td>` + item.city.name + `</td>
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


function deleteById(id) {
    $.ajax({
        url: "http://localhost:9000/serviceSecurity/v1/api/company/" + id,
        method: "delete",
        headers: {
            "Content-Type": "application/json",
        },
    }).done(function (result) {
        alert("Registro eliminado con éxito");
        loadData();
    });
}


function update() {
    var selectedCityId = parseInt($("#selected_city_id").val());
    if (isNaN(selectedCityId) || selectedCityId === null) {
        console.error("ID de ciudad no válido");
        return;
    } 6
    // Construir el objeto data
    try {
        var data = {
            "nit": $("#nit").val(),
            "rs": $("#rs").val(),
            "address": $("#address").val() + ' No ' + $("#numeral").val() + ' - ' + $("#numeral2").val() + ' - ' + $("#description").val(),
            "phone": $("#phone").val(),
            "email": $("#email").val(),
            "web": $("#web").val(),
            "city": {
                "id": selectedCityId
            },
            "state": parseInt($("#state").val())
        };

        var id = $("#id").val();
        var jsonData = JSON.stringify(data);
        $.ajax({
            url: "http://localhost:9000/serviceSecurity/v1/api/company/" + id,
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
        url: "http://localhost:9000/serviceSecurity/v1/api/company/" + id,
        method: "GET",
        dataType: "json",
        success: function (response) {
            var data = response.data;
            $("#id").val(data.id);
            $("#nit").val(data.nit);
            $('#rs').val(data.rs);
            $('#address').val(data.address);
            $('#phone').val(data.phone);
            $('#email').val(data.email);
            $('#web').val(data.web);
            $("#selected_city_id").val(data.city.id);
            $("#city_id").val(data.city.firstName + " " + data.city.lastName);

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
