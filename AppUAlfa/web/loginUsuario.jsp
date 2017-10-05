<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script type="text/javascript" src="ajaxLogIn.js"></script>
        <link href="styles.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <title>Login Usuario</title>
    </head>
    <body>
        <img src="index_bg.jpg" class="background">
        <p>¿Eres nuevo?</p>
        <p><a href="http://localhost:8080/AppuMart/registroUsuario.jsp">Regístrate</button></a></p>
    <center class="centritoTu">
            <p>CORREO:</p><input type="text" id="correo"/><br>
            <p>CONTRASEÑA:</p><input type="password" id="password"/><br>
            <input type="submit" id="login" class="btn" value="Entrar"/>
            <p id="ack"></p>
    </center>
            
        </form>
        
    </body>
</html>
