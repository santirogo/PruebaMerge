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
        <title>Registro</title>
    </head>
    <body>
        <form>

            Correo: <input type="text" id="correo"><br>
            Celular: <input type="text" id="celular"><br>
            Nombre: <input type="text" id="nombre"><br>
            Contraseña: <input type="password" id="password"><br>
            Confirmar contraseña: <input type="password" id="password2"><br>

            <input type="button" id="boton" value="Registrarme">
            
            <h1 id="conf1"></h1>
            <div id="oculto">
            Ingresa el código que enviamos a tu correo: <input type='text' id ='codigo'>
            <input type='button' id ='confirmar' value ='confirmar'></div><br>
            <div id="oculto2">
                <a href="http://localhost:8080/AppuMart/loginVendedor.jsp"><button>¡Registrarme!</button></a>
            </div>
            
            
            <div id="div"></div>
            
        </form>
    </body>
</html>
