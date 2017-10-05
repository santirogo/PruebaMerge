<%-- 
    Document   : registro
    Created on : 3/09/2017, 03:12:44 PM
    Author     : ayoro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="registroUsuarioAjax.js"></script>
        <link href="styles.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <title>Registrate</title>
        <style>
            body{
                background-repeat: no-repeat;
                background-size: cover;
                margin: 0;
                padding: 0;
            }
        </style>
    </head>
    <body style="background-image: url('index_bg.jpg');">
            <button class="carritoButt" data-toggle="modal" data-target="#myModal"><img src="carrito.png" class="carritoIcon"></button><br>
            
            <center>
                <form>
                    <p>Correo: </p><input type="text" id="correo"><br>
                    <p>Nombre: </p><input type="text" id="nombre"><br>
                    <p>Password: </p><input type="password" id="pass"><br>
                    <p>Confirmar password: </p><input type="password" id="pass2"><br>
                    <p>Celular: </p><input type="text" id="celular"><br><br>
                    <input type="button" value="Registrarse" class="btn" id="boton">

                    <div id="confirmacion" style="display:none">
                        <p id="parrafo">Por favor digita el número de confirmación que te enviamos al correo</p>
                        <input type="text" class="btn" id="numero"><br> <input class="btn" type="button" value="Confirmar" id="confirmar">
                    </div>
                </form><br>
                <div id="error"></div>
            </center>
    </body>
</html>
