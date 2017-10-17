<%-- 
    Document   : contruccion
    Created on : 7/09/2017, 02:46:49 PM
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
        <% HttpSession mySession = request.getSession();
            String correo = (String) mySession.getAttribute("correo");
//            String correo = "diego@correo.usa.edu.co";
            System.out.println("SESIÓN: "+correo);
        %>
        
        
        <h1>Lo sentimos, estamos en construcción</h1>
        <img src="https://s-media-cache-ak0.pinimg.com/originals/ec/d5/e0/ecd5e08a55d54584284ac68d05f8271d.jpg" alt="Lo Sentimos">
    </body>
</html>
