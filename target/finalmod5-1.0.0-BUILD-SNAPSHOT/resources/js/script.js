charset="utf-8"

$(document).ready(function() {
	//VALIDACIÓN FORMULARIO DE CLIENTES
$.validator.addMethod("valueNotEquals", function(value, arg) {
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


//funciones para CREAR PAGO
//RANGO PARA SELECCIÓN DE AÑOS
function RangoMesAnio(desde, hasta) {
	for (i = 0; i < hasta; i++)
		document.write("<option>" + parseInt(desde + i) + "</option>");
		RangoMesAnio(2010, 41);
}

//FUNCIÓN PARA SELECCIONAR FECHAR ACTUAL
function fechaActual() {
	var fechaactual = new Date();
	var month = fecha.getUTCMonth() + 1;
	var day = fecha.getUTCDate();
	var year = fecha.getUTCFullYear();
	document.getElementById("fecha").value = day + "/" + month + "/" + year;
	document.getElementById("fecha").readOnly = true;
};

//VALIDACIÓN INGRESO DE DATOS
function ingresaDatosPago() {
	
	if (idpago.value != ""){
		document.getElementById('idpago').className = 'validado';		
		validacion1 = 1;
		
	} else {
		document.getElementById('idpago').className = 'error';
		
	}		
		if (txtfecha.value != ""){
		document.getElementById('txtfecha').className = 'validado';		
		validacion2 = 1;
	} else {
		document.getElementById('txtfecha').className = 'error';
				
	}
		if (txtmonto.value >= 0 && txtmonto.value <= 999999999 && txtmonto.value != "") {
		document.getElementById('txtmonto').className = 'validado';		
		validacion3 = 1;
	} else {
		document.getElementById('txtmonto').className = 'error';
		
	}
	if (txtmes.value != "") {
		document.getElementById('txtmes').className = 'validado';
		validacion4 = 1;
	} else {
		document.getElementById('txtmes').className = 'error';
		
	}
	if (txtanio.value != "") {
		document.getElementById('txtanio').className = 'validado';
		validacion5 = 1;
	} else {
		document.getElementById('txtanio').className = 'error';
	
	}
	if (rutcliente.value >= 0 && rutcliente.value <= 999999999 && rutcliente.value != "") {
		document.getElementById('rutcliente').className = 'validado';
		validacion6 = 1;
	} else {
		document.getElementById('rutcliente').className = 'error';
		
	}
	if (validacion1==1 && validacion2 == 1 && validacion3 == 1 && validacion4 == 1 && validacion5 == 1 && validacion6 == 1) {
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


//SEGÚN LA SELECCIÓN MUESTRA EL LISTADO RESPONDER CHECK LIST

function Listachequeo() {

	c1 = document.getElementById("chek");
	var text = "";
	
	if (c1.checked == true) {
		var text = "<li>document.getElementById('cheqnombre') </li>";
		
		document.getElementById('chek9').innerHTML = 'Chequeos Seleccionados<ul>' + text;
		

	} else
		alert("Por favor seleccionar al menos un chequeo")
}


//VALIDAR listadovisitas.html
function chequeo() {
	var mensaje = confirm("¿Desea validar y modificar los chequeos de esta visita?");
	if (mensaje ) {
	
	 location.href="Checklist";
	}
	else {
		alert("¡Haz denegado el mensaje!");
	}
}


//aplica datatables
$(document).ready(function() {
	$('#tableid').DataTable({
		responsive: true
	});
});


//Año del crear pago
 $(document).ready(function(){
             // cargamos los años
            for(var i=2010;i<2051;i++)
            {
                $("select[name=txtanio]").append(new Option(i,i));
            }
            
 });

