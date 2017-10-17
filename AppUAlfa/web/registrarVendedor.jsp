<%-- 
    Document   : registrarUsuario
    Created on : 03-sep-2017, 15:21:05
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="registrarVendedorAjax.js"></script>
        <link href="styles.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <title>Registrate</title>
    </head>
    <body style="background-image: url('index_bg.jpg');">
        <img src="index_bg.jpg" id="background">
        <center>
            <form>

                <p>Correo: </p><input type="text" id="correo"><br>
                <p>Celular: </p><input type="text" id="celular"><br>
                <p>Nombre: </p><input type="text" id="nombre"><br>
                <p>Contraseña: </p><input type="password" id="password"><br>
                <p>Confirmar contraseña: </p><input type="password" id="password2"><br><br>

            <input type="button" id="boton" value="Registrarme">
            
            <h1 id="conf1"></h1>
            <div id="oculto">
            Ingresa el código que enviamos a tu correo: <input type='text' id ='codigo'>
            <input type='button' id ='confirmar' value ='confirmar'></div><br>
            <div id="oculto2">
                <a><button onclick='redirigir();' >¡Registrarme!</button></a>
            </div>
            
            
            <div id="div"></div>
            
        </form>
    </body>
</html>
