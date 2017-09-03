/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
    numeroAleatorio = 0;
    $("#boton").click(function (){
        correo = $("#correo").val();
        pass = $("#pass").val();
        pass2 = $("#pass2").val();
        if(pass === pass2){
            $("#error").html("");
            $.ajax({
                url: 'CorreoServlet',
                type: 'POST',
                data: {correo:correo},
                dataType: 'json',
                success: function(data){
                    if(data.confirmacion === "ok"){
                        $("#confirmacion").append("<p>Por favor digita el número de confirmación que te enviamos al correo\n\
                                 </p><input type='text' id='numero'><br> <input type='button' value='Confirmar'> id='confirmar'");
                        numeroAleatorio = data.numero;
                    }
                }
            });
        }else{
            $("#error").html("");
            $("#error").append("<p>Las contraseñas no coinciden</p>");
        }
        
    });
    $("#confirmar").click(function (){
        if(numeroAleatorio === $("#numero").val()){
            correo = $("#correo").val();
            nombre = $("#nombre").val();
            pass = $("#pass").val();
            celular = $("#celular").val();

            $.ajax({
                url: 'RegistroUsuarioServlet',
                type: 'POST',
                data: {correo:correo, nombre:nombre, pass:pass, celular:celular},
                dataType: 'json',
                success: function(data){
                    if(data.confirmacion === "ok"){
                        alert("Se agregó correctamente :)");
                    }else{
                        alert("No se pudo agregar");
                    }
                }
            });
        }else{
            alert("El número es erróneo :(")
        }
    });
});
