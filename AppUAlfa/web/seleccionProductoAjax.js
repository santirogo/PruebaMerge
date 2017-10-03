/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function (){
    
    $.ajax({
        url: 'SeleccionTiendaServlet',
        type: 'get',
        dataType: 'json',
        success: function(data){
            console.log(JSON.stringify(data));
            var str = JSON.stringify(data);
            var precio = str.substr(10,10);
            console.log(precio);
//            var r = arr.substr(3,6);
//            console.log(r);
//            var i,x="";
//            for (i in arr) {
//                x += arr[i].nombre;
//                x += arr[i].precio;
//            }
//            $("#prueba").append(""+x);
        }
    });
    
    $('.boton').click(function() {
        var id = this.id;
        console.log(id)
        console.log("id: "+this.id);
        a = "#n"+this.id; 
        console.log("a: "+a);
        nombre = $("#n"+this.id).text();
        precio = $("#p"+this.id).text();
        
        console.log("n:"+nombre);
        console.log("p:"+precio);
//        $.ajax({
//            url: 'MainMenuServlet',
//            type: 'POST',
//            data: {nombre:nombre, precio:precio},
//            dataType: 'json',
//            success: function(data){
//                $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
//            }
//        });
    });
});
