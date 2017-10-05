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
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.js" type="text/javascript"></script>
        <script type="text/javascript" src="seleccionProductoAjax.js"></script>
        <link href="styles.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Bienvenido a la tienda</title>
        <style>
            b{
                color: #ffffff !important;
            }
            
            h2, h4{
                font-family: 'Leckerli One', cursive;
            }
        </style>
    </head>
    <body style="background-image: url('dulces_bg.jpg');">
            <button class="carritoButt" data-toggle="modal" data-target="#myModal"><img src="carrito_wh.png" class="carritoIcon"></button><br>
            <h2 style="text-align: center; color: #ffffff;">NUESTRAS TIENDAS!!!</h2>
            
            <!-- Modal -->
            <div class="container">
                <div class="modal fade" id="myModal" role="dialog">
                  <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Carrito de compras</h4>
                      </div>
                      <div class="modal-body">
                        <p>LISTADO DE PRODUCTOS AÑADIDOS: </p>
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Check-out</button>
                      </div>
                    </div>
                  </div>
                </div>
            </div>
            
            <form>
                <div id="encabezado"></div><br><br>
                <div id="prueba"></div><br>
                <div id="respuesta"></div>
            </form>
    </body>
</html>
