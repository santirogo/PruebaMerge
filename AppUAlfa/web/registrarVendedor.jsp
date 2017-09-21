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
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script type="text/javascript" src="registrarVendedorAjax.js"></script>
        <link href="styles.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <title>Registro</title>
    </head>
    <body>
    <center>
        <form>

            <p>Correo: </p><input type="text" id="correo"><br>
            <p>Celular: </p><input type="text" id="celular"><br>
            <p>Nombre: </p><input type="text" id="nombre"><br>
            <p>Contraseña: </p><input type="password" id="password"><br>
            <p>Confirmar contraseña: </p><input type="password" id="password2"><br>

            <input type="button" class="btn" id="boton" value="Registrarme">
            
            <h1 id="conf1"></h1>
            <div id="oculto">
                <p>Ingresa el código que enviamos a tu correo: </p><input type='text' class="btn" id ='codigo'>
            <input type='button' id ='confirmar' value ='confirmar'></div><br>
            <div id="oculto2">
                <a href="http://localhost:8080/AppuMart/loginVendedor.jsp"><button><p>¡Registrarme!</p></button></a>
            </div>
            
            
            <div id="div"></div>
            
        </form>
    </center>    
    </body>
</html>
