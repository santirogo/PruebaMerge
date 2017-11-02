$(document).ready(function(){

    var opcion = $('#opcion').val();
        
        $.ajax({
            url:'MainMenuServlet',
            type:'GET',
            data:{opcion:opcion},
            dataType: 'json',
            success: function(data) {

                console.log("holaaaaaa "+data);
                document.getElementById("ack").innerHTML = "Precio Total: "+data.Arreglo[0].Total+ " - ";
                document.getElementById("ackk").innerHTML = "CantidadTotal: "+data.Arreglo[1].Cant+ " - ";
            },
            error: function(){
                $('#ack').val("ERROR FATAL");
            }
        });
    
    
    
    $('.btn').click(function(){
        
        
        
        
    });
    
    
    
    ;
    
    
});

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