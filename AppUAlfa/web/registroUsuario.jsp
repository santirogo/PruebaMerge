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
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script type="text/javascript" src="registroUsuarioAjax.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            Correo: <input type="text" id="correo"><br>
            Nombre: <input type="text" id="nombre"><br>
            Password: <input type="text" id="pass"><br>
            Confirmar password: <input type="text" id="pass2"><br>
            Celular: <input type="text" id="celular"><br>
            <input type="button" value="enviar" id="boton">
            
            <div id="confirmacion" style="display:none">
                <p id="parrafo">Por favor digita el número de confirmación que te enviamos al correo</p>
                <input type="text" id="numero"><br> <input type="button" value="Confirmar" id="confirmar">
            </div>
        </form><br>
        <div id="error"></div>
    </body>
</html>
