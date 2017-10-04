$(document).ready(function(){
    $('#login').click(function(){

        var opcion = $('#opcion').val();
        $.ajax({
            url:'MainMenuServlet',
            type:'post',
            data:{opcion:opcion},
            dataType: 'json',
            success: function(data) {
                document.getElementById("ack").innerHTML = "Precio Total: "+data.PrecioTotal+ " - ";
                document.getElementById("ackk").innerHTML = "Cantidad Total: "+data.CantiTotal+ " - ";
            },
            error: function(){
                $('#ack').val("ERROR FATAL");
            }
        });
    });
});
