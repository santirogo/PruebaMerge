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
        <link href="styles.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Bienvenido a la tienda</title>
    </head>
    <body>
        <form>
            
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-4">
                        <b id="nPrimero">Primer producto</b>      <b id="pPrimero">Precio: $2000</b><br>
                        <button class="btn" onclick=clickaction(this) id="Primero">Añadir</button><br><br>
                    </div>
                    <div class="col-sm-4">
                        <b id="nSegundo">Segundo producto</b>      <b id="pSegundo">Precio: $6000</b><br>
                        <button class="btn" onclick=clickaction(this) id="Segundo">Añadir</button><br><br>
                    </div>
                    <div class="col-sm-4">
                        <b id="nTercero">Tercer producto</b>      <b id="pTercero">Precio: $10000</b><br>
                        <button class="btn" onclick=clickaction(this) id="Tercero">Añadir</button><br><br>                        
                    </div>
                </div>
            </div>
            
        </form>
        <iframe name="window" src="InfoCarrito.jsp" width="400" height="900" marginwidth="0" scrolling="yes" frameborder="0"></iframe>
       
    </body>
</html>
