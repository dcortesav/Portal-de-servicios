$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarEmpleador();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarEmpleador();
    });


});

function autenticarEmpleador() {

    let id_empleador = $("#id_empleador").val();
    let contrasena = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletEmpleadorLogin",
        data: $.param({
            id_empleador: id_empleador,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let id_empleador = parsedResult['id_empleador'];
                document.location.href = "home.html?id_empleador=" + id_empleador;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarEmpleador() {

    let id_empleador = $("#input-id_empleador").val();
    let email = $("#input-email").val();
    let contrasena = $("#input-contrasena").val();
    let contrasenaConfirmacion = $("#input-contrasena-repeat").val();
    let nombre = $("#input-nombre").val();
    let apellido = $("#input-apellido").val();
    let saldo = $("#input-saldo").val();
    let premium = $("#input-premium").prop("checked");

    if (contrasena == contrasenaConfirmacion) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletEmpleadorRegister",
            data: $.param({
                id_empleador: id_empleador,
                email: email,
                contrasena: contrasena,
                nombre: nombre,
                apellido: apellido,
                saldo: saldo,
                premium: premium
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let id_empleador = parsedResult['id_empleador'];
                    document.location.href = "home.html?id_empleador=" + id_empleador;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}