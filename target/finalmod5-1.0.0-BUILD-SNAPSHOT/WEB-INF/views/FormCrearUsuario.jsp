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
		<h2>CREAR USUARIO</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="resources/iconos/icono-menu.png" alt=""
				class="icon-menu"></label>

			<nav class="menu">
				<ul>
				<li><a href="<%=request.getContextPath()%>/listaPagos">Listado de Pagos</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearPago">Crear pagos</a></li>
				<li><a href="<%=request.getContextPath()%>/listaUsuarios">Listado de Usuarios</a></li>
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>					
				</ul>
			</nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
	<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesausuario'>
			<table class="cel- tablas-t tablas-e" >
			
			<tr><td>ID Usuario</td><td><input type="text" name="txtid" id="txtid" required="required"/></td></tr>
			<tr><td>Rut</td><td><input type="text" name="txtrut" id="txtrut" required="required"/></td></tr>
			<tr><td>Nombre</td><td><input type="text" name="txtnombre" id="txtnombre" required="required"/></td></tr>
			<tr><td>Apellidos</td><td><input type="text" name="txtapellidos" id="txtapellidos" required="required"/></td></tr>
			<tr><td>Fecha de nacimiento</td><td><input type="date" pattern="dd/mm/yyyy" name="txtfnac" id="txtfnac" required="required"/></td></tr>
			<tr><td >Tipo de usuario</td>
				<td ><input type="radio" name="txttipouser" value="Cliente"id="Cliente" required="required" />Cliente 
					<input type="radio" name="txttipouser" value="Profesional" id="Profesional" />Profesional
					<input type="radio" name="txttipouser" value="Administrativo" id="Administrativo" />Administrativo	</td></tr>
			<tr><td>Login</td><td><input type="text" name="txtlogin" id="txtlogin" required="required"/></td></tr>
			<tr><td>Clave</td><td><input type='password' name='password' id="password" required="required"/></td></tr>
			<tr><td colspan="2"><input type="submit" name="btnguardar" id="btnguardar" value="Crear Usuario" onclick="ingresaDatosUser()"/><br/></td></tr>
			
			</table>
		</form>
	</fieldset>
	<footer id="pie">
		
		Derechos Reservados G1 &copy; 2020
	</footer>
</body>
</html>