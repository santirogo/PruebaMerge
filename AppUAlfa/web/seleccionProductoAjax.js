/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function cli (id){
    console.log("Holaaaaaa "+id);
    nombre = $("#n"+id).text();
    tienda = $("#encabezado").text();
    $.ajax({
            url: 'AgregarCarritoServlet',
            type: 'POST',
            data: {nombre:nombre,tienda:tienda},
            dataType: 'json',
            success: function(data){
                $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
            }
        });
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
                        "<div class='col-md-4'><b id='n"+i+"'>"+data.arreglo[i].nombre+"</b>\n\
                        <b id='p"+i+"'>Precio: $"+data.arreglo[i].precio+"</b><br>\n\
                        <img src='"+data.arreglo[i].ruta+"' alt='foto' width='100' height='100'>\n\
                        <button class='btn' onclick='cli("+i+")' id="+i+">Añadir</button><br><br></div>"
                );
            }
            
        }
    });
    
//    $('.boton').click(function() {
//        var id = this.id;
//        console.log(id)
//        console.log("id: "+this.id);
//        a = "#n"+this.id; 
//        console.log("a: "+a);
//        nombre = $("#n"+this.id).text();
//        precio = $("#p"+this.id).text();
//        
//        console.log("n:"+nombre);
//        console.log("p:"+precio);
//        $.ajax({
//            url: 'MainMenuServlet',
//            type: 'POST',
//            data: {nombre:nombre, precio:precio},
//            dataType: 'json',
//            success: function(data){
//                $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
//            }
//        });
//    });
});
