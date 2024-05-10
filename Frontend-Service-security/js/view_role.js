











function loadView() {
    $.ajax({
      url: "http://localhost:9000/serviceSecurityy/v1/api/view",
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