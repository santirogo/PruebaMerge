/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    comboBox();
    $("#boton").click(function () {
        var nombre = $("#nombre").val();
        var categoria = $("#categoria").val();
        var precio = $("#precio").val();
        var cantidad = $("#cantidad").val();
        var tienda = $('#tienda').val();

        $.ajax({
            url: 'AgregarProductoServlet',
            type: 'POST',
            data: {nombre: nombre, categoria: categoria, precio: precio, cantidad: cantidad},
            dataType: 'json',
            success: function (data) {
                if (data.confirmacion === "ACK") {
                    console.log("DATOS CORRECTOS");
                    document.getElementById("ack").innerHTML = "Se agregó el producto " + nombre + " satisfactoriamente";

                } else {
                    console.log("DATOS INCORRECTOS");
                    document.getElementById("ack").innerHTML = "Datos incorrecto";
                }
            }



        });
    });
});
function comboBox() {
    $.ajax({
        url: 'AgregarProductoServlet',
        type: 'GET',
        dataType: 'json',
        success: function (data) {

            for (var i = 0; i < data.categorias.length; i++) {
                $("#combobox").append(
                        "<option id='categoria' value=" + data.categorias[i].cat + ">" + data.categorias[i].cat + "</option>"


                        );

            }

        }



    });


}
;


