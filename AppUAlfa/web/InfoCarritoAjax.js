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
