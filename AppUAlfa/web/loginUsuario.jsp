<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Usuario</title>
    </head>
    <body>
        
        <form action="LoginUsuarioServlet" method="POST">
            
            Correo:<input type="text" id="correo"/><br>
            Contraseña:<input type="text" id="password"/><br>
            <input type="submit" value="Entrar"/>
            
        </form>
        
    </body>
</html>
