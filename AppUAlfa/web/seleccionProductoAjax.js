/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function (){
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
