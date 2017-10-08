/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function clickaction( b ){
    let id = b.id;
    console.log("id: "+id);
        a = "#n"+id; 
        console.log("a: "+a);
        nombre = $("#n"+id).text();
        precio = $("#p"+id).text();
        
        console.log("n:"+nombre);
        console.log("p:"+precio);
        $.ajax({
            url: 'MainMenuServlet',
            type: 'POST',
            data: {nombre:nombre, precio:precio},
            dataType: 'json',
            success: function(data){
                $("#respuesta").append("<b>Se agregó el producto </b>"+data.nombre+" <b>satisfactoriamente</b>");
            }
        });
    }
$(document).ready(function (){
    
    
    
});
