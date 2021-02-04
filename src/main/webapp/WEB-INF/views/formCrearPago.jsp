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
		<h2>CREAR PAGO</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="resources/iconos/icono-menu.png" alt=""
				class="icon-menu"></label>

			<nav class="menu">
				<ul>
				<li><a href="<%=request.getContextPath()%>/">Inicio</a></li>
				<li><a href="<%=request.getContextPath()%>/listaCapacitaciones">Listado de Capacitaciones</a></li>
				<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>
				<li><a href="<%=request.getContextPath()%>/listaPagos">Lista Pagos</a></li>		
				<li><a href="<%=request.getContextPath()%>/listaUsuarios">Lista de Usuarios</a></li>
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>					
				</ul>
			</nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
	<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesaPagos'>
			<table class="cel- tablas-t tablas-e" >
			
			<tr><td>ID Pago</td><td><input type="text" name="idpago" id="idpago" /></td></tr>
			<tr><td>Fecha de Pago</td><td><input type="date" pattern="dd/mm/yyyy" name="txtfecha" id="txtfecha" /></td></tr>
			<tr><td>Monto de Pago</td><td><input type="text" name="txtmonto" id="txtmonto" /></td></tr>
			<tr><td>Mes de Pago</td><td><input type="text" name="txtmes" id="txtmes" /></td></tr>
			<tr><td>Año de Pago</td><td><input type="text" name="txtaño" id="txtaño" /></td></tr>
			<tr><td>Rut del cliente</td><td><input type="text" name="rutcliente" id="rutcliente" /></td></tr>
			<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Pago" /><br/></td></tr>
			
			</table>
		</form>
	</fieldset>
	<footer id="pie">
		
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>
</html>