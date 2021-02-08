<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa de Asesorías</title>
	<link rel="stylesheet" href='<c:out value="${pageContext.request.contextPath}"/>/resources/css/Estilos.css'>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src='<c:out value="${pageContext.request.contextPath}"/>/resources/js/script.js'></script>
</head>
<body>
	<header id="seccion">
		<h2>CREAR CAPACITACION</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="resources/iconos/icono-menu.png" alt=""
				class="icon-menu"></label>

			<nav class="menu">
				<ul>
				<li><a href='<%=request.getContextPath()%>/'>Inicio</a></li>
				<li><a href='<%=request.getContextPath()%>/listaCapacitaciones'>Listado de Capacitaciones</a></li>
				<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>					
				</ul>
			</nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
	<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesacapacitacion'>
			<table class="cel- tablas-t tablas-e" >
			
			<tr><td>ID Capacitación</td><td><input type="text" name="txtid" id="txtid" /></td></tr>
			<tr><td>Fecha de capacitación</td><td><input type="date" pattern="dd/mm/yyyy" name="txtfecha" id="txtfecha" /></td></tr>
			<tr><td>Hora de capacitación</td><td><input type="text" name="txthora" id="txthora" /></td></tr>
			<tr><td>Lugar</td><td><input type="text" name="txtlugar" id="txtlugar" /></td></tr>
			<tr><td>Duración</td><td><input type="text" name="txtduracion" id="txtduracion" /></td></tr>
			<tr><td>Rut del cliente</td><td><input type="text" name="rutcliente" id="rutcliente" /></td></tr>
			<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Capacitación" /><br/></td></tr>
			
			</table>
		</form>
	</fieldset>
	<footer id="pie">
		
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>
</html>