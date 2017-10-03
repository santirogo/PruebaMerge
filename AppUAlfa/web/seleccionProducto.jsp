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
        <form>
                
                <%//ArrayList productos = (ArrayList) request.getAttribute("productos");
                  ArrayList productos = new ArrayList();
                  productos.add("producto1");
                  productos.add("2000");
                  productos.add("margarita.jpg");
                  productos.add("producto2");
                  productos.add("1500");
                  productos.add("margarita2.jpg");
                  
                    for (int i = 0; i < productos.size(); i=i+3) {
                        String nombre = (String) productos.get(i);
                        String precio = (String) productos.get(i+1);
                        String src = (String) productos.get(i+2);
                        %>
                        <pre style='display:inline'><b id="n<%=(i/2)+1%>"><%=nombre%></b></pre>      
                        <pre style='display:inline'><b id="p<%=(i/2)+1%>"><%="\t"%>Precio: $<%=precio%></b></pre><br>
                        <img src="<%=src%>" alt="foto" width="100" height="100">
                        <button class="boton" id="<%=(i/2)+1%>">Añadir</button><br><br>
                  <%}%>
                  <div id="prueba"></div>
                  
        </form>
        <div id="prueba"></div>
    </body>
</html>
