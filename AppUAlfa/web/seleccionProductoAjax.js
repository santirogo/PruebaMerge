/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function cli (id){
    console.log("Holaaaaaa "+id);
    nombre = $("#n"+id).text();
    tienda = $("#encabezado").text();
    cantidad = $("#c"+id).val();
    if(cantidad===""){
        alert("Debe escribir una cantidad");
        
    }else{
        console.log("cantidad: "+cantidad);
        $.ajax({
                url: 'AgregarCarritoServlet',
                type: 'POST',
                data: {nombre:nombre,tienda:tienda,cantidad:cantidad},
                dataType: 'json',
                success: function(data){
                    $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
                }
            });
    }
}

$(document).ready(function (){
    
    $.ajax({
        url: 'SeleccionTiendaServlet',
        type: 'POST',
        dataType: 'json',
        success: function(data){
            $("#encabezado").append("<h1>"+data.tienda+"</h1>");
            for (var i = 0; i < data.arreglo.length; i++) {
                console.log(data.arreglo[i].nombre);
                console.log(data.arreglo[i].precio);
                $("#prueba").append(
                        "<b id='n"+i+"'>"+data.arreglo[i].nombre+"</b>", 
                        "<b id='p"+i+"'>          Precio: $"+data.arreglo[i].precio+"</b><br>",
                        "<img src='"+data.arreglo[i].ruta+"' alt='foto' width='100' height='100'><br><br>",
                        "<b>Cantidad </b><input type='text' id='c"+i+"' name='pruebaaa"+i+"'>",
                        "<button class='boton' onclick='cli("+i+")' id="+i+">Añadir</button><br><br>"
                );
            }
            
        }
    });
});
