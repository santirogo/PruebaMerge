function mostrar() {
    document.getElementById('oculto').style.display = 'block';
}

function ocultar() {
    document.getElementById('oculto').style.display = 'none';
}
function mostrarBoton() {
    document.getElementById('oculto2').style.display = 'block';
}

function ocultarBoton() {
    document.getElementById('oculto2').style.display = 'none';
}

$(document).ready(function () {
    ocultar();
    ocultarBoton();
    $('#boton').click(function () {

        var correo = $('#correo').val();
        var celular = $('#celular').val();
        var nombre = $('#nombre').val();
        var pass = $('#password').val();
        var password = $('#password2').val();


        if (pass === password) {
            $.ajax({
                url: 'RegistrarVendedorServlet',
                type: 'post',
                data: {correo: correo, celular: celular, nombre: nombre, password: password},
                dataType: 'json',
                success: function (data) {
                    if (data.existe === "no" && data.sergista === "si") {
                        console.log("no existe");
                        //document.getElementById("conf1").innerHTML = "DATOS CORRECTOS";

                        mostrar();


                    } else if (data.sergista === "no") {
                        console.log("No es de la sergio");
                        document.getElementById("conf1").innerHTML = "Debe ser un correo de la Sergio Arboleda";
                    } else {
                        document.getElementById("conf1").innerHTML = "Ya hay un usuario con este correo";

                    }
                },
                error: function () {
                    $('#conf1').val("ERROR FATAL");
                }
            });
        } else {
            document.getElementById("conf1").innerHTML = "Las contraseñas no coinciden";

        }
    });
    $('#confirmar').click(function () {

        console.log("Entreeee al segundo botoooooooooon");
        var codigo = $('#codigo').val();

        $.ajax({
            url: 'RegistrarVendedorServlet',
            type: 'get',
            data: {codigo: codigo},
            dataType: 'json',
            success: function (data) {
                if (data.registro === "ok") {

                    mostrarBoton();

                } else {
                    $("#div").append("<h1>El codigo es incorrecto</h1>")

                }
            },
            error: function () {
                $('#conf1').val("ERROR FATAL");
            }
        });

    });
});


