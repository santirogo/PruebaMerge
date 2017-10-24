$(document).ready(function(){
    
    
    confirmar = $('#confirmar').val();
    comment =$('#comment').val();
    
        
        $.ajax({
            url:'InfoCheckOutServlet',
            type:'GET',
            data:{confirmar:confirmar, comment:comment},
            dataType: 'json',
            success: function(data) {

                var i=0;
               for ( i = 0; i < data.Productos.length; i++) {
                console.log(data.Productos[i].nombre);
                console.log(data.Productos[i].precio);
                $('#carlos').append(
                        //"<a href = 'seleccionProducto.jsp'><button class='btn' onclick='sendName(" + data.Productos[i].nombre + ")'>\n\"",
                        "<p>" + data.Productos[i].nombre + "</p>",
                        "<p>" + data.Productos[i].cantidad + "</p>",
                        "<p>" + data.Productos[i].precio + "</p><br>"
                                
                        );
               
            }
            
                $('$carlos').append(
                    
                         "<p>" + data.Productos[data.Productos.length].Total + "</p><br>"
                        );
                
            },
            error: function(){
                $('#ack').val("ERROR FATAL");
            }
        });
        
        });
