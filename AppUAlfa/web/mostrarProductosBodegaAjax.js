$(document).ready(function () {


    $.ajax({
        url: 'ProductosBodegaServlet',
        type: 'get',
        dataType: 'json',
        success: function (data) {

            for (var i = 0; i < data.productos.length; i++) {
                
                $('#div').append(
                        "<a><img src=" + data.productos[i].imagen + " width='100' height='100'></button></a><br>",
                        "<a>" + data.productos[i].nombre + "</a><br>",
                        "<a>Vendedor: " + data.productos[i].categoria + "</a><br>",
                        "<a>Puntuación: " + data.productos[i].precio + "</a><br>",
                        "<a>Puntuación: " + data.productos[i].cantidad + "</a><br>"

                        );
            }
        },
        error: function () {
        }
    });
});