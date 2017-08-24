/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function (){
    $("#boton").click(function (){
        nombre = $("#nombre").val();
        categoria = $("#categoria").val();
        precio = $("#precio").val();
        cantidad = $("#cantidad").val();
        
        $.ajax({
            url: 'AgregarProductoServlet',
            type: 'POST',
            data: {nombre:nombre, categoria:categoria, precio:precio, cantidad:cantidad},
            dataType: 'json',
            success: function(data){
                $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
            }
        });
    });
});

