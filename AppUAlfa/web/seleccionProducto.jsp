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
                <%ArrayList productos = (ArrayList) request.getAttribute("productos");
                  
                    for (int i = 0; i < productos.size(); i=i+2) {%>
                        <b id="n<%=(i/2)+1%>"><%productos.get(i);%></b>      <b id="p<%=(i/2)+1%>">Precio: $<%productos.get(i+1);%></b><br>
                        <button onclick=clickaction(this) id="<%=(i/2)+1%>">Añadir</button><br><br>
                  <%}%>
                
                
                
                
<!--                <b id="nPrimero">Primer producto</b>      <b id="pPrimero">Precio: $2000</b><br>
                <button onclick=clickaction(this) id="Primero">Añadir</button><br><br>
                
                <b id="nSegundo">Segundo producto</b>      <b id="pSegundo">Precio: $6000</b><br>
                <button onclick=clickaction(this) id="Segundo">Añadir</button><br><br>
                
                <b id="nTercero">Tercer producto</b>      <b id="pTercero">Precio: $10000</b><br>
                <button onclick=clickaction(this) id="Tercero">Añadir</button><br><br>-->
                <%//}
            %>
        </form>

    </body>
</html>
