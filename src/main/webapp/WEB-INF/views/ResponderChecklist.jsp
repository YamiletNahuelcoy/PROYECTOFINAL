<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa Asesorías</title>
<link rel="stylesheet" href='<c:out value="${pageContext.request.contextPath}"/>/resources/css/Estilos.css'>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src='<c:out value="${pageContext.request.contextPath}"/>/resources/js/script.js'></script>

</head>
<body>
	<header id="seccion">
		<h2>RESPONDER CHECKLIST</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="resources/iconos/icono-menu.png" alt=""
				class="icon-menu"></label>

			<nav class="menu">
				<ul>
				<li><a href="<%=request.getContextPath()%>/">Inicio</a></li>
				<li><a href="<%=request.getContextPath()%>/listaCapacitaciones">Listado de Capacitaciones</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitaciones</a></li>	
				<li><a href="<%=request.getContextPath()%>/listaClientes">Lista de Clientes</a></li>
				<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>	
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>				
				</ul>
			</nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
		<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesachecklist'>
		 	<table class="tablaadm-t tablaadm-e">
                <tr class="negrita">
                    <td>Id Chequeo</td>
                    <td>Nombre</td>
                    <td>Seleccione chequeo</td>
                </tr>
				
                
                <tr>
                    <td>1</td>
                    <td>Servicios higiénicos</td>
                    <td><input type="checkbox" name="checkbox" value="Servicios higiénicos" id="chek1" /></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Sala de vestir</td>
                    <td><input type="checkbox" name="checkbox" value="Sala de vestir" id="chek2" /></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>Comedores</td>
                    <td><input type="checkbox" name="checkbox" value="Comedores" id="chek3" /></td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>Escaleras</td>
                    <td><input type="checkbox" name="checkbox" value="Escaleras" id="chek4" /></td>
                </tr>
                <tr>
                    <td>5</td>
                    <td>Señalización</td>
                    <td><input type="checkbox" name="checkbox" value="Señalización" id="chek5" /></td>
                </tr>
                <tr>
                    <td>6</td>
                    <td>Instalaciones eléctricas</td>
                    <td><input type="checkbox" name="checkbox" value="Instalaciones eléctricas" id="chek6" /></td>
                </tr>
                <tr>
                    <td>7</td>
                    <td>Extintores</td>
                    <td><input type="checkbox" name="checkbox" value="Extintores" id="chek7" /></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input onclick="Listachequeo()" type="button" class="boton" value="Chequeo" name="cheq" id="chek8" >

                        <div id="chek9" class="lista"></div>
                    </td>
                </tr>
            </table>
		</form>
	</fieldset>
	<footer id="pie">
	
		Derechos Reservados G1 &copy; 2020
	</footer>

</body>
</html>