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
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            
            <%
                ArrayList<ProductoVO> productos = (ArrayList<ProductoVO>) request.getAttribute("productos");
                for (int i = 0; i < productos.size(); i++) {%>
                <b><%=productos.get(i).getNombre()%>         <%=productos.get(i).getPrecio()%></b>
                <input type="button" id="boton" value="añadir" name="<%=productos.get(i).getNombre()%>">
                <%}
            %>
        </form>

    </body>
</html>
