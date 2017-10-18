
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script type="text/javascript" src="InfoCarritoAjax.js"></script>
        <link href="StyleLogin.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <title>Tú Carrito</title>
        <style>
            @font-face
            {
                font-family: 'carrito.ttf';
                src: url('Pictures/carrito.ttf');
            }

            *{
                font-family: 'carrito.ttf';
            }
            .carro{
                top:0;
                left:0;
                position:fixed;
                z-index: -1;  
                filter:brightness(1);

            }


        </style>

    </head>
    <body>
        <!--<img src="carrito_bg.jpg" class="background">-->
        <form>
            <center>
                <br><br><br>
                <input class="submit" type="text" id="opcion" value="1"  style="visibility:hidden"/><br>

                <p id="ack"></p>
                <p id="ackk"></p>
                <br><br>
                <input class="btn" type="submit" id="InfoCarro" value="Actualizar"/>
            </center>
        </form>
        <!--<img src="Pictures/CarroFull.png" class="carro">-->
    </body>
</html>

