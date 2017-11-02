<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="InfoCarritoAjax.js" charset="UTF-8"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <link href="styles.css" rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Leckerli+One" rel="stylesheet">
        <title>Tú Carrito</title>
        <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAJOwdex9jqp6DZ-klv-NlBxoAmwaCyKt8&callback=initMap">
        </script>
        <style>
            #map {
             height: 400px;
             width: 400px;
            }
        </style>
    </head>
    <body>
        <img src="carrito_bg.jpg" class="background">
        <form>
            <center>
                <br><br><br>
            <input class="submit" type="text" id="opcion" value="1"/>
            <input class="btn" type="submit" id="InfoCarro" value="Consultar"/>
            <p id="ack"></p>
            <p id="ackk"></p>
            </center>
        </form>
        <div id="map"></div>
        
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB78-OGRg5rcLtUs9caqE4lQVIlw-D7zA4&callback=initMap"></script>
    </body>
</html>
   
