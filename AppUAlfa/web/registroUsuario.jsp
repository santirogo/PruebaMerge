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
            <div id="confirmacion">

            </div>
        </form><br>
        <div id="error"></div>
    </body>
</html>
