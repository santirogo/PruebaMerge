<%-- 
    Document   : listarTiendas
    Created on : 02-oct-2017, 15:34:03
    Author     : Nicolas
--%>

<%@page import="vo.VendedorVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

        <script type="text/javascript" src="listarTiendasAjax.js"></script>
    </head>
    <body>
        <%HttpSession mySession = request.getSession();
            VendedorVO vo = (VendedorVO) mySession.getAttribute("vendedor");
        %>


        <%if (vo == null) {%>
        <META HTTP-EQUIV="REFRESH" CONTENT="0;URL=index.jsp">
        <%}%>

        <div id="div"></div>
        <button id="out" onclick='cerrarSesion()'>Cerrar Sesión</button>





    </body>
</html>
