charset="utf-8"



//VALIDACIÓNES FORMULARIO CREAR CAPACITACIONES
function ingresaDatoscap() {
	
	if (txtid.value != ""){
		document.getElementById('txtid').className = 'validado';		
		validacion1 = 1;
		
	} else {
		document.getElementById('txtid').className = 'error';
		
	}		
		if (txtfecha.value != ""){
		document.getElementById('txtfecha').className = 'validado';		
		validacion2 = 1;
	} else {
		document.getElementById('txtfecha').className = 'error';
				
	}
	
	if (txthora.value != "") {
		document.getElementById('txthora').className = 'validado';
		validacion4 = 1;
	} else {
		document.getElementById('txthora').className = 'error';
	
	}
	
	if (txtlugar.value != "") {
		document.getElementById('txtlugar').className = 'validado';
		validacion4 = 1;
	} else {
		document.getElementById('txtlugar').className = 'error';
	
	}
	if (txtduracion.value != "") {
		document.getElementById('txtduracion').className = 'validado';
		validacion5 = 1;
	} else {
		document.getElementById('txtduracion').className = 'error';
	
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
	


//VALIDACIÓN INGRESO DE DATOS PÁGINA CREAR PAGOS
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
		
	};
	
	


//SEGÚN LA SELECCIÓN MUESTRA EL LISTADO RESPONDER CHECK LIST
function verificarCheckbox(){

				var checkboxes = document.getElementById("formchek").checkbox;
                var cont = 0;
                var lista = "";
                
                    for (var x=0 ; x < checkboxes.length; x++) {
                        if (checkboxes[x].checked) {
                            cont = cont + 1;
                            lista  =  lista +  "<li>" + checkboxes[x].value + "</li>"; 
                        }
                    }
                
                    if (cont == 0) {
                        alert("No a seleccionado ningun chequeo");
                    }
                    else {
                        lista = "<ul>" + lista + "</ul>";
                        document.getElementById("mensaje").innerHTML = lista;
                    }
                }


//VALIDAR PÁGINA LISTADO DE VISITAS
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
 
 
 //VALIDACIÓN FORMULARIO CREAR USUARIOS
 function ingresaDatosUser() {
	
	if (txtid.value != ""){
		document.getElementById('txtid').className = 'validado';		
		validacion1 = 1;
		
	} else {
		document.getElementById('txtid').className = 'error';
				
	}		
		if (txtrut.value != ""){
		document.getElementById('txtrut').className = 'validado';		
		validacion2 = 1;
	} else {
		document.getElementById('txtrut').className = 'error';
				
	}
		if (txtnombre.value  != "") {
		document.getElementById('txtnombre').className = 'validado';		
		validacion3 = 1;
	} else {
		document.getElementById('txtnombre').className = 'error';
		
	}
	if (txtapellidos.value != "") {
		document.getElementById('txtapellidos').className = 'validado';
		validacion4 = 1;
	} else {
		document.getElementById('txtapellidos').className = 'error';
		
	}
	if (txtfnac.value != "") {
		document.getElementById('txtfnac').className = 'validado';
		validacion5 = 1;
	} else {
		document.getElementById('txtfnac').className = 'error';
	
	}
	if (txttipouser.value != "") {
		document.getElementById('txttipouser').className = 'validado';
		validacion6 = 1;
	} else {
		document.getElementById('txttipouser').className = 'error';
		
	}
	if (txtlogin.value != "") {
		document.getElementById('txtlogin').className = 'validado';
		validacion7 = 1;
	} else {
		document.getElementById('txtlogin').className = 'error';
		
	}
	if (password.value != "") {
		document.getElementById('password').className = 'validado';
		validacion8 = 1;
	} else {
		document.getElementById('password').className = 'error';
		
	}
		
	};
	
	


	
