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
	<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesaPagos'  >
			<table class="cel- tablas-t tablas-e" >
			
			<tr><td>ID Pago</td><td><input type="number" name="idpago" id="idpago" required="required"/></td></tr>
			<tr><td>Fecha de Pago</td><td><input type="date" pattern="dd/mm/yyyy" name="txtfecha" id="txtfecha" required="required"/></td></tr>
			<tr><td>Monto de Pago</td><td><input type="number" name="txtmonto" id="txtmonto" required="required"/></td></tr>
			<tr><td>Mes de Pago</td><td><select required aria-required="true" name="txtmes" id="txtmes" >
						<option value= ""  > Seleccione
						<option value="Enero">Enero
						<option value="Febrero">Febrero
						<option value="Marzo">Marzo
						<option value="Abril">Abril
						<option value="Mayo">Mayo
						<option value="Junio">Junio
						<option value="Julio">Julio
						<option value="Agosto">Agosto
						<option value="Septiembre">Septiembre
						<option value="Octubre">Octubre
						<option value="Noviembre">Noviembre
						<option value="Diciembre">Diciembre
						</select></td></tr>		
						
				<tr><td>Año de Pago</td><td><select required aria-required="true" name="txtanio"  id="txtanio">
				<option value="" >Seleccione </select></td></tr> 	    					
			           
			<tr><td>Rut del cliente</td><td><input type="text" name="rutcliente" id="rutcliente" required="required" /></td></tr>
						
			<tr><td colspan="6"><input onclick="ingresaDatosPago()" type="submit" name="btnguardar" id="btnguardar" value="Guardar Pago"  /><br/></td></tr>
			
			</table>
		</form>
	</fieldset>
	<footer id="pie">
		
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>
</html>