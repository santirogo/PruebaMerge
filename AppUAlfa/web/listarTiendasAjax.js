/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {


    $.ajax({
        url: 'ListarTiendasServlet',
        type: 'get',
        dataType: 'json',
        success: function (data) {

            for (var i = 0; i < data.tiendas.length; i++) {
                console.log(data.tiendas[i].idfondo);
                console.log(data.tiendas[i].nombre);
                $('#div').append(
                        "<a href = 'seleccionProducto.jsp'><button class='btn' onclick='sendName(" + data.tiendas[i].id + ")'>\n\
                         <img src=" + data.tiendas[i].idfondo + " width='100' height='100'></button></a><br>",
                        "<a>" + data.tiendas[i].nombre + "</a><br>",
                        "<a>Vendedor: " + data.tiendas[i].vendedor + "</a><br>",
                        "<a>Puntuación: " + data.tiendas[i].puntuacion + "</a><br>"

                        );
            }
        },
        error: function () {
        }
    });
});
function sendName(idTienda) {



    console.log("Entreeee a la funcioooooon con id:  " + idTienda);

    $.ajax({
        url: 'SeleccionTiendaServlet',
        type: 'get',
        data: {nombre: idTienda},
        dataType: 'json',
        success: function (data) {
            console.log("Nombresito de tienda enviado");
            window.location.href = "seleccionProducto.jsp";

        },
        error: function () {
            console.log("Error en el ajax");
        }
    });



}
