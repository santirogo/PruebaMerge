<%-- 
    Document   : agregarProducto
    Created on : 23/08/2017, 11:51:07 PM
    Author     : ayoro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Producto</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js" type="text/javascript"></script>
        <script type="text/javascript" src="agregarProductoAjax.js"></script>
    </head>
    <body>
        <form>
            Nombre: <input type="text" id="nombre">
            Categoria: <input type="text" id="categoria"><br>
            Precio: <input type="text" id="precio">
            Cantidad: <input type="text" id="cantidad"><br>
            <input type="button" id="boton">
        </form>
    </body>
</html>
