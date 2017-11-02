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
        <!--<script>
              // Note: This example requires that you consent to location sharing when
              // prompted by your browser. If you see the error "The Geolocation service
              // failed.", it means you probably did not give permission for the browser to
              // locate you.

              function initMap() {
                var map = new google.maps.Map(document.getElementById('map'), {
                  center: {lat: 4.714666, lng: -74.072115},
                  streetViewControl: false,
                  mapTypeControl: false,
                  fullscreenControl: false,
                  zoom: 18
                });
                var infoWindow = new google.maps.InfoWindow({map: map});

                // Try HTML5 geolocation.
                if (navigator.geolocation) {
                  navigator.geolocation.getCurrentPosition(function(position) {
                    var pos = {
                      lat: position.coords.latitude,
                      lng: position.coords.longitude
                    };

                    infoWindow.setPosition(pos);
                    infoWindow.setContent('Tú Ubicación <3');
                    map.setCenter(pos);
                  }, function() {
                    handleLocationError(true, infoWindow, map.getCenter());
                  });
                } else {
                  // Browser doesn't support Geolocation
                  handleLocationError(false, infoWindow, map.getCenter());
                }
              }

              function handleLocationError(browserHasGeolocation, infoWindow, pos) {
                infoWindow.setPosition(pos);
                infoWindow.setContent(browserHasGeolocation ?
                                      'Error: El servicio de geolocalización falló.' :
                                      'Error: Tu explorador no soporta la geolocalización.');
              }
        </script>-->
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB78-OGRg5rcLtUs9caqE4lQVIlw-D7zA4&callback=initMap"></script>
    </body>
</html>
   
