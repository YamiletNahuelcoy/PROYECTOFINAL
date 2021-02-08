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
		<h2>LISTADO DE PAGOS</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="resources/iconos/icono-menu.png" alt=""
				class="icon-menu" ></label>

			<nav class="menu">
				<ul>
				<li><a href='<%=request.getContextPath()%>/'>Inicio</a></li>
				<li><a href='<%=request.getContextPath()%>/editarAdministrativo'>Editar Administrativo</a></li>
				<li><a href="<%=request.getContextPath()%>/editarCliente">Editar Cliente</a></li>	
				<li><a href="<%=request.getContextPath()%>/editarProfesional">Editar Profesional</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearPago">Crear pagos</a></li>
				<li><a href="<%=request.getContextPath()%>/listaUsuarios">Listado de Usuarios</a></li>
				<li><a href="<%=request.getContextPath()%>/crearUsuario">Crear Nuevo Usuario</a></li>
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>						
				</ul>
			</nav>
		</div>
	</header>

	<fieldset class="cel- agrupar-t agrupar-e">
		<table class="cel- tablaadm-t tablaadm-e">
			<tr class="negrita">
				<td>Id de Pago</td>
				<td>Fecha de Pago</td>
				<td>Monto de Pago</td>
				<td>Mes de Pago</td>
				<td>Año de Pago</td>
				<td>Rut del Cliente</td>
			</tr>
			<c:forEach items="${listapag}" var="lp">
				<tr>
					<td><c:out value="${lp.getIdpago()}" /></td>
					<td><c:out value="${lp.getPagoFecha()}" /></td>
					<td><c:out value="${lp.getPagoMonto()}" /></td>
					<td><c:out value="${lp.getPagoMes()}" /></td>
					<td><c:out value="${lp.getPagoAño()}" /></td>
					<td><c:out value="${lp.getCliente_RutCliente()}" /></td>
					
			</tr>
			
			</c:forEach>

		</table>

	</fieldset>
	<footer id="pie">
		
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>

</html>