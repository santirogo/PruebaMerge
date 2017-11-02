<%-- 
    Document   : seleccionProducto
    Created on : 24/08/2017, 01:01:12 AM
    Author     : ayoro
--%>

<%@page import="vo.ProductoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js" type="text/javascript"></script>
        <script type="text/javascript" src="seleccionProductoAjax.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        
        <% HttpSession mySession = request.getSession();
            String correo = (String) mySession.getAttribute("correo");
//            String correo = "diego@correo.usa.edu.co";
        %>
        
        <% if(correo==null){%>
            <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=index.jsp">
        <%}%>
        
        <a href="http://localhost:8080/AppuMart/editarComprador.jsp"><button>Editar comprador</button></a>
        
        <form>
            <div id="encabezado"></div><br><br>
            <div id="prueba"></div><br>
            <div id="respuesta"></div>
        </form>
    </body>
</html>
