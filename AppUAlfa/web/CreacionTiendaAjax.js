$(document).ready(function () {
    $('#login').click(function () {

        var nombre = $('#nombre').val();
        var productos = $('#Prod').val();
        var fondo = $('#Fond').val();
        var celular = $('#celular').val();
        $.ajax({ 
            url: 'http://localhost:8080/AppuMart/CrearTiendaServlet',
            type: 'post',
            data: {nombre: nombre, celular: celular, productos: productos, fondo: fondo},
            dataType: 'json',
            success: function (data) {
                
                if (data.confirmacion === "ACK") {
                    console.log("DATOS CORRECTOS");
                    document.getElementById("ack").innerHTML = "DATOS CORRECTOS";
                } else {
                    console.log("DATOS INCORRECTOS");
                    document.getElementById("ack").innerHTML = "NO SE CONFIGURO NADA";
                }
            },

            error: function () {
                $('#ack').val("ERROR");
            }
        });
    });
});
