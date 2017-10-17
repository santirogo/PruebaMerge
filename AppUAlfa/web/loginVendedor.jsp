<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script type="text/javascript" src="ajaxLogInVendedor.js"></script>
        <title>Login Vendedor</title>
    </head>
    <body>
        <form>
            Correo:<input type="text" id="correo"/><br>
            Contraseña:<input type="password" id="password"/><br>
            <input type="submit" id="login" value="Entrar"/>
            ¿No tienes una cuenta? <a href="http://localhost:8080/AppuMart/registrarVendedor.jsp">Registrarme</a>
        </form>
        
    </body>
</html>
