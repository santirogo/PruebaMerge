$(document).ready(function(){
    $('#login').click(function(){
        
        var nombre = $('#nombre').val();
        var productos = $('#Prod').val();
        var fondo = $('#Fond').val();
        $.ajax({
            url:'http://localhost:32056/AppuMart/CrearTiendaServlet',
            type:'post',
            data:{categoria:categoria,celular:celular,prodcutos:Prod,fondo:Fond},
            dataType: 'json',
            success: function(data) {
                $("#ack").append("<b>Se Configuro La Tienda </b>"+data.nombre);
            },

            error: function(){
                $('#ack').val("ERROR");
            }
        });
    });
});
