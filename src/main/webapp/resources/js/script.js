charset="utf-8"
$(document).ready(function() {
	//VALIDACIÓN FORMULARIO DE CLIENTES
$.validator.addMethod("valueNotEquals", function(value, element, arg) {
		return arg !== value;
	}, "Value must not equal arg.")

	$('#commentForm').validate({
		rules: {
			txtrutcliente: {
				required: true,
				maxlength: 9
			},
			txtnomcliente: "required",
			txtapecliente: "required",
			txttelcliente: {
				required: true,
				maxlength: 9
			},
			txtafpcliente: "required",
			sissalud: {
				valueNotEquals: "default"
			},
			txtdirecccliente: "required",
			txtcomcliente: "required",
			txtedadcliente: {
				required: true,
				maxlength: 2
			},
		},
		messages: {
			txtrutcliente: {
				required: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},
			txtnomcliente: "Este es un campo obligatorio.",
			txtapecliente: "Este es un campo obligatorio.",
			txttelcliente: {
				required: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},
			txtafpcliente: "Este es un campo obligatorio.",
			sissalud: {
				valueNotEquals: "Seleccione una opción"
			},
			txtdirecccliente: "Este es un campo obligatorio.",
			txtcomcliente: "Este es un campo obligatorio.",
			txtedadcliente: {
				required: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},
		}
	});
});

$(document).ready(function() {
	//PÁGINA DE REPORTES CON GRÁFICOS

	var datos = {
		labels: ["La Granja", "La Florida", "Puente Alto", "Santiago", "Renca", "Maipú", "Recoleta"],
		datasets: [{
			label: "Cantidad",
			backgroundColor: "rgb(0, 255, 0, 0.5)",
			data: [30, 20, 32, 22, 17, 26, 19]
		},

		]
	};

	var canvas = document.getElementById('myChart').getContext("2d");
	window.bar = new Chart(canvas, {
		type: "bar",
		data: datos,
		options: {
			elements: {
				rectangle: {
					boderWidth: 1,
					boderColor: "rgb(0,255,0)",
					borderSkipped: "bottom"
				}
			},
			responsive: true,
			title: {
				display: true,
				text: "Cantidad de Clientes por Comuna"
			}
		}
	});

	var datos = {
		labels: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre"
		],
		datasets: [{
			label: "Cantidad de accidentes",
			backgroundColor: "rgba(0, 255, 255)",
			data: [12, 20, 32, 22, 14, 15, 20, 15, 9, 5, 14, 21]
		},

		{
			label: "Cantidad de Visitas",
			backgroundColor: "rgba(204, 0, 15)",
			data: [10, 5, 22, 14, 17, 26, 19, 21, 31, 20, 12, 9]
		},

		]
	};

	var canvas = document.getElementById('myChartII').getContext("2d");
	window.bar = new Chart(canvas, {
		type: "line",
		data: datos,
		options: {
			elements: {
				line: {
					borderWidth: 8,
					fill: false,
					boderColor: "rgb(255,0,0)",
					borderSkipped: "bottom"
				},
				point: {
					radius: 6,
					borderWidth: 4,
					backgroundColor: 'white',
					hoverRadius: 8,
					hoverBorderWidth: 4,
				},

				responsive: true,
				title: {
					display: true,
					text: "Segundo Gráfico líneas  y puntos"


				}
			}
		}
	});


	var datos = {
		labels: ["% Cumplidos", "% NO Cumplidos", "% Cumplidos con Observaciones"],
		datasets: [{
			label: "Porcentajes Chequeos",
			backgroundColor: [
				"rgb(102, 255, 51 , 0.5)",
				"rgb(0, 153, 153 , 0.5)",
				"rgb(0, 0, 255 , 0.5)"],
			data: [30, 20, 32]
		},

		]
	};

	var canvas = document.getElementById('myChartIII').getContext("2d");
	window.bar = new Chart(canvas, {
		type: "pie",
		data: datos,
		options: {
			elements: {
				rectangle: {
					boderWidth: 1,
					boderColor: "rgb(0,255,0)",
					borderSkipped: "bottom"
				}
			},
			responsive: true,
			title: {
				display: true,
				text: "Cantidad de Clientes por Comuna"
			}
		}
	});
});

$(document).ready(function() {
	//CAMBIO DE CLASES PARA  listadoasesorias.html
	var $lis1 = $('#lista1');

	$('#btnact1').click(function() {
		$lis1.toggleClass('actdis');
	}
	);
	var $lis2 = $('#lista2');

	$('#btnact2').click(function() {
		$lis2.toggleClass('actdis');
	}
	);
	var $lis3 = $('#lista3');

	$('#btnact3').click(function() {
		$lis3.toggleClass('actdis');
	}
	);

	var $td = $('td');

	$('#btnestilo1').on('click', function() {
		$td.addClass('estilo1').removeClass('estilo2 estilo3');
	}
	);
	$('#btnestilo2').on('click', function() {
		$td.addClass('estilo2').removeClass('estilo1 estilo3');
	}
	);
	$('#btnestilo3').on('click', function() {
		$td.addClass('estilo3').removeClass('estilo1 estilo2');
	}
	);

});

//SEGÚN TIPO DE USUARIO
function cargartipo(){
	var tipo = document.getElementById("tipo");
	var a = "";
	
	if(a.equals('Cliente')){
     response.sendRedirect(request.getContextPath() + "/Editarcliente");
	}else if(a.equals('Profesional')){
		response.sendRedirect(request.getContextPath() + "/EditarProfesional");
	}else if(a.equals('Administrativo')){
		response.sendRedirect(request.getContextPath() + "/EditarAdministrativo");
	}
}


//funciones para listadopago.html
//RANGO PARA SELECCIÓN DE AÑOS
function RangoMesAnio(desde, hasta) {
	for (i = 0; i < hasta; i++)
		document.write("<option>" + parseInt(desde + i) + "</option>");
}

//FUNCIÓN PARA SELECCIONAR FECHAR ACTUAL
function fechaActual() {
	var fecha = new Date();
	var month = fecha.getUTCMonth() + 1;
	var day = fecha.getUTCDate();
	var year = fecha.getUTCFullYear();
	document.getElementById("fecha").value = day + "/" + month + "/" + year;
	document.getElementById("fecha").readOnly = true;
};

//VALIDACIÓN INGRESO DE DATOS
function ingresaDatos() {
	if (monto.value >= 0 && monto.value <= 999999999 && monto.value != "") {
		document.getElementById('monto').className = 'validado';
		validacion1 = 1;
	} else {
		document.getElementById('monto').className = 'error';
	}
	if (mes.value >= 0 && mes.value <= 12 && mes.value != "") {
		document.getElementById('mes').className = 'validado';
		validacion2 = 1;
	} else {
		document.getElementById('mes').className = 'error';
	}
	if (anio.value >= 0 && anio.value <= 2050 && anio.value != "") {
		document.getElementById('anio').className = 'validado';
		validacion3 = 1;
	} else {
		document.getElementById('anio').className = 'error';

	}
	if (rutcliente.value >= 0 && rutcliente.value <= 999999999 && rutcliente.value != "") {
		document.getElementById('rutcliente').className = 'validado';
		validacion4 = 1;
	} else {
		document.getElementById('rutcliente').className = 'error';
	}
	if (validacion1==1 && validacion2 == 1 && validacion3 == 1 && validacion4 == 1) {
		alert("Los datos se han ingresado correctamente");
	}
};

//FORMULARIO DE INGRESO DATOS DEL CLIENTE
$(document).ready(function() {

	$.validator.addMethod("valueNotEquals", function(value, element, arg) {
		return arg !== value;
	}, "Value must not equal arg.")

	$('#commentForm').validate({
		rules: {
			run: {
				required: true,
				maxlength: 9
			},
			nombre: "required",
			apellido: "required",
			telefono: {
				required: true,
				maxlength: 9
			},
			afp: "required",
			sissalud: {
				valueNotEquals: "default"
			},
			direc: "required",
			comuna: "required",
			edad: {
				required: true,
				maxlength: 2
			},
		},
		messages: {
			run: {
				required: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},
			nombre: "Este es un campo obligatorio.",
			apellido: "Este es un campo obligatorio.",
			telefono: {
				required: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},
			afp: "Este es un campo obligatorio.",
			sissalud: {
				valueNotEquals: "Seleccione una opción"
			},
			direc: "Este es un campo obligatorio.",
			comuna: "Este es un campo obligatorio.",
			edad: {
				required: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},
		}
	});


});
//FUNCIÓN PARA VALIDAR RUT
function validaRut(campo) {
	if (campo.length == 0) { return false; }
	if (campo.length < 8) { return false; }

	campo = campo.replace('-', '')
	campo = campo.replace(/\./g, '')
	var suma = 0;
	var caracteres = "1234567890kK";
	var contador = 0;
	for (var i = 0; i < campo.length; i++) {
		u = campo.substring(i, i + 1);
		if (caracteres.indexOf(u) != -1)
			contador++;
	}
	if (contador == 0) { return false }

	var rut = campo.substring(0, campo.length - 1)
	var drut = campo.substring(campo.length - 1)
	var dvr = '0';
	var mul = 2;

	for (i = rut.length - 1; i >= 0; i--) {
		suma = suma + rut.charAt(i) * mul
		if (mul == 7) mul = 2
		else mul++
	}
	res = suma % 11
	if (res == 1) dvr = 'k'
	else if (res == 0) dvr = '0'
	else {
		dvi = 11 - res
		dvr = dvi + ""
	}
	if (dvr != drut.toLowerCase()) { return false; }
	else { return true; }
}

//VALIDACIONES PARA PÁGINA login.html
$(document).ready(function() {

	$.validator.addMethod("nombreUser", function(value, element, arg) {
		return this.optional(element) || validaNombreuser(value);
	}, "Value must not equal arg.")
	$('#loginForm').validate({
		rules: {
			txtnombre: {
				required: true,
				nombreUser: true
			},
			txtpass: {
				required: true,
				maxlength: 20
			},
		},
		messages: {
			txtnombre: {
				required: "Este es un campo obligatorio.",
				nombreUser: "Debe ingresar un usuario válido."
			},
			txtpass: {
				required: "Este es un campo obligatorio.",
				maxlength: "Su contraseña es demasiado larga."
			},

		}
	});

});


//SEGÚN LA SELECCIÓN MUESTRA EL LISTADO listarchecklist.html


function Listachequeo() {

	c1 = document.getElementById("chek1");
	c2 = document.getElementById("chek2");
	c3 = document.getElementById("chek3");
	c4 = document.getElementById("chek4");
	c5 = document.getElementById("chek5");
	c6 = document.getElementById("chek6");
	c7 = document.getElementById("chek7");
	var text1 = "";
	var text2 = "";
	var text3 = "";
	var text4 = "";
	var text5 = "";
	var text6 = "";
	var text7 = "";
	if (c1.checked || c2.checked || c3.checked || c4.checked || c5.checked || c6.checked || c7.checked) {

		if (c1.checked) {
			var text1 = "<li>Servicios higiénicos</li>";
		}
		if (c2.checked) {
			var text2 = "<li>Sala de vestir</li>";
		}
		if (c3.checked) {
			var text3 = "<li>Comedores</li>";
		}
		if (c4.checked) {
			var text4 = "<li>Señalización</li>";
		}
		if (c5.checked) {
			var text5 = "<li>Señalización</li>";
		}
		if (c6.checked) {
			var text6 = "<li>Instalaciones eléctricas</li>";
		}
		if (c7.checked) {
			var text7 = "<li>Extintores</li>";
		}
		document.getElementById('chek9').innerHTML = 'Chequeos Seleccionados<ul>' + text1 + text2 + text3 +
			text4 + text5 + text6 + text7;

	} else
		alert("Por favor seleccionar al menos un chequeo")
}


//VALIDAR listadovisitas.html
function chequeo() {
	var mensaje = confirm('¿Desea validar y modificar los chequeos de esta visita?');
	if (mensaje) {

		location.href = "responderchecklist.html";
	}
	else {
		alert("¡Haz denegado el mensaje!");
	}
}


//VALIDACIONES listadoaccidentes.html
$(document).ready(function() {

	$.validator.addMethod("valueNotEquals", function(value, element, arg) {
		return arg !== value;
	}, "Value must not equal arg.")


	$('#accForm').validate({
		rules: {

			ID_Accidente: {
				required: true,
				digits: true,
				max: 10000,
				min: 1
			},

			fecha: "required",
			hora: "required",

			lugar: {
				required: true,
				minlength: 1,
				maxlength: 150
			},

			origen: {
				required: true,
				minlength: 1,
				maxlength: 100
			},


			cliente: {
				valueNotEquals: "default"
			},


			consecuencias: {
				minlength: 1,
				maxlength: 100
			},


		},

		messages: {
			ID_Accidente: {
				required: "Este es un campo obligatorio.",
				minlength: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},

			fecha: {
				required: "Este es un campo obligatorio."
			},

			hora: {
				required: "Este es un campo obligatorio."
			},

			lugar: {
				required: "Este es un campo obligatorio.",
				minlength: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},

			origen: {
				required: "Este es un campo obligatorio.",
				minlength: "Este es un campo obligatorio.",
				maxlength: "Excede numero máximo de caracteres."
			},


			cliente: "Este es un campo obligatorio.",

			consecuencias: {
				maxlength: "Excede numero máximo de caracteres."
			},

		}

	});


});

//VALIDACIONES PÁGINA administrarasistentes.html
$(document).ready(function() {
	$.validator.addMethod("valueNotEquals", function(value, element, arg) {
		return arg !== value;
	}, "Value must not equal arg.")

	$('#formNuevoAsist').validate({
		rules: {
			ident: {
				required: true,
				number: true,
				max: 10000
			},
			nombre: {
				required: true,
				maxlength: 100
			},

			edad: {
				required: true,
				number: true,
				max: 150

			},
			email: {
				required: true,
				email: true
			},
			telefono: {
				required: true,
				minlength: 12

			},
			cap: {
				valueNotEquals: "default"
			}
		},

		messages: {
			ident: {
				required: "Este es un campo obligatorio.",
				max: "Identificador mayor a 0 y menor a 10000."
			},
			nombre: {
				required: "Este es un campo obligatorio.",
				maxlength: "Nombre debe ser mayor a 0 y menor a 100 caracteres"
			},

			edad: {
				required: "Este es un campo obligatorio.",
				max: "Ingresar un número mayor a 0 y menor a 150"
			},
			email: {
				required: "Este es un campo obligatorio.",
				email: "El formato del correo es este: abdsdfc@abc.cl"
			},

			telefono: {
				required: "Este es un campo obligatorio.",
				minlength: "Ingrese número de teléfono válido",
			},
			cap: {
				valueNotEquals: "Seleccione una opción"
			},

		}
	});


});


//aplica datatables
$(document).ready(function() {
	$('#tableid').DataTable({
		responsive: true
	});
});

function hola(){
alert("Bienvenidos!!!!!!");
}


//validar formulario de crear pago//

var f = new Date();
document.write(f.getDate() + "/" + (f.getMonth()+1) + "/" + f.getFullYear());

function validacion() {

var anoPago = document.getElementById("anopago");
var rutCli = document.getElementById("rutcli");
var montoPago = document.getElementById("montopago");
var mesPago = document.getElementById("mespago");

var anopagoNum = parseInt(anoPago.value);   
var montopagoNum = parseInt(montoPago.value);  


if (anoPago.value == "" || anoPago.value == null || rutCli.value =="" || rutCli.value ==null ||
        montoPago.value == "" || montoPago.value == null || mesPago.value == "" ||  mesPago.value == null){
            alert("campos vacios");
            return false;
        }
else if (2010 > anopagoNum || anopagoNum > 2050){
            alert( "[ERROR]ingrese un año valido entre 2010 y 2050");
            return false;
         }
else if (montopagoNum < 0 || montopagoNum > 99999999){
            alert("[ERROR]ingrese un monto entre 0 y 99999999");
            return false;      
        } 
else if (mesPago.value != "enero" && mesPago.value != "febrero"  && mesPago.value != "marzo"  && mesPago.value != "abril"  && mesPago.value != "mayo"  && mesPago.value != "junio"  && mesPago.value != "julio"  && mesPago.value != "agosto"  && mesPago.value != "septiembre"  && mesPago.value != "octubre"  && mesPago.value != "noviembre"  && mesPago.value != "diciembre" ) { 
             alert("[ERROR]mes invalido");
             return false; 
        } 

            alert("datos ingresados");
         return true;  
          
}   



