<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="ajaxLogInVendedor.js"></script>
        <link href="styles.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <title>Iniciar Sesión</title>
    </head>
    <body>
        <img src="index_bg.jpg" class="background">
        <p>¿No tienes una cuenta?</p>
        <p><a href="http://localhost:8080/AppuMart/registrarVendedor.jsp">Registrarme</a></p>
        <center class="centritoTu">
            <form>
                <p>CORREO:</p><input type="text" id="correo"/><br>
                <p>CONTRASEÑA:</p><input type="password" id="password"/><br><br>
                <input type="submit" id="login" class="btn" value="Entrar"/>
                <p id="ack"></p>
            </form>
        </center>    
    </body>
</html>
