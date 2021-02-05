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
		<h2>LISTADO VISITAS</h2>
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
		<table class="cel- tablaadm-t tablaadm-e">
			<tr class="negrita">
				<td>ID Visita</td>
				<td>Fecha</td>
				<td>Hora</td>
				<td>Lugar</td>
				<td>Comentarios</td>
				<td>Cliente</td>
				<td></td>
				<td></td>
			</tr>
										
			<c:forEach items="${listavis}" var="lvis">
			<tr>
				<td><c:out value="${lvis.getIdVisita()}" /></td>
				<td><c:out value="${lvis.getVisfecha()}" /></td>
				<td><c:out value="${lvis.getVishora()}" /></td>
				<td><c:out value="${lvis.getVislugar()}" /></td>
				<td><c:out value="${lvis.getViscomentarios()}" /></td>
				<td><c:out value="${lvis.getCliente_rutcliente()}" /></td>
				<td><a href="<%=request.getContextPath()%>/Checklist">Responder Checklist</a>
				</td>	
               
			</tr>
			
			</c:forEach>	
	</table>

	</fieldset>
	<footer id="pie">
	
		Derechos Reservados G1 &copy; 2020
	</footer>

</body>
</html>