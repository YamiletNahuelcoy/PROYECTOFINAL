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
		<h2>FORMULARIO DE CONTACTO</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="resources/iconos/icono-menu.png" alt=""
				class="icon-menu"></label>
			<nav class="menu">
				<ul>
				<li><a href='<%=request.getContextPath()%>/'>Inicio</a></li>
				<li><a href='<%=request.getContextPath()%>/listaCapacitaciones'>Listado de Capacitaciones</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitaciones</a></li>	
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<fieldset class="cel- agrupar-t agrupar-e">
		<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/recibiendocontacto'>
			<table class="cel- tablas-t tablas-e">
				<tr>
					<td>Nombre</td>
					<td><input type="text" name="nombre" id="nombre" required="required"/></td>
				</tr>
				<tr>
					<td>Correo Electrónico</td>
					<td><input type="email" name="correo" id="correo" required="required"/></td>
				</tr>
				<tr>
					<td>Teléfono</td>
					<td><input type="text" name="telefono" id="telefono" required="required"/></td>
				</tr>
				<tr>
					<td>Mensaje</td>
					<td><textarea id="mensaje" name="mensaje" rows="4" cols="50" required="required"></textarea></td>
					
				</tr>
				<tr>
				<td><input type="hidden" name="parametro" value="sesion" required="required"></td>
                <td><input type="submit" value="Enviar"></td>
				
				</tr>
			</table>
		</form>

	</fieldset>

	<footer id="pie">
		
		Derechos Reservados G1 &copy; 2020
	</footer>

</body>
</html>