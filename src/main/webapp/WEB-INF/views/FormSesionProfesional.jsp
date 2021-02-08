<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página perfil Profesional</title>
	<link rel="stylesheet" href='<c:out value="${pageContext.request.contextPath}"/>/resources/css/Estilos.css'>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src='<c:out value="${pageContext.request.contextPath}"/>/resources/js/script.js'></script>
</head>
<body>

	<header id="seccion">
		<h2>Bienvenido Juan Pablo Ibáñez 	
		</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="resources/iconos/icono-menu.png" alt=""
				class="icon-menu" ></label>

			<nav class="menu"></nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
		<ol>
				<li><a href='<%=request.getContextPath()%>/listaCapacitaciones'>Listado de Capacitaciones</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitaciones</a></li>	
				<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>
		</ol>

	</fieldset>
<footer id="pie">
		
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>
</html>