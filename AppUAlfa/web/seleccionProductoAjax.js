/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
    $("#boton0").click(function (){
        nombre = $("#nombre0").val();
        precio = $("#precio0").val();
        
        $.ajax({
            url: 'AgregarProductoServlet',
            type: 'POST',
            data: {nombre:nombre, precio:precio},
            dataType: 'json',
            success: function(data){
                $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
            }
        });
    });
    $("#boton1").click(function (){
        nombre = $("#nombre1").val();
        precio = $("#precio1").val();
        
        $.ajax({
            url: 'AgregarProductoServlet',
            type: 'POST',
            data: {nombre:nombre, precio:precio},
            dataType: 'json',
            success: function(data){
                $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
            }
        });
    });
    $("#boton2").click(function (){
        nombre = $("#nombre2").val();
        precio = $("#precio2").val();
        
        $.ajax({
            url: 'AgregarProductoServlet',
            type: 'POST',
            data: {nombre:nombre, precio:precio},
            dataType: 'json',
            success: function(data){
                $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
            }
        });
    });
});
