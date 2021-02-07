<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa Asesoría</title>
	<link rel="stylesheet" href='<c:out value="${pageContext.request.contextPath}"/>/resources/css/Estilos.css'>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src='<c:out value="${pageContext.request.contextPath}"/>/resources/js/script.js'></script>
</head>
<body>
<header id="seccion">
		<h2>EDITAR ADMINISTRATIVO</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src='<c:out value="${pageContext.request.contextPath}"/>/resources/iconos/icono-menu' alt=""
				class="icon-menu" ></label>

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
		<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesaeditar'>
			<table class="tablausr-t tablausr-e">
					<tr><td>Id de Usuario</td><td><input type="number" name="txtiduseradmin" id="txtiduseradmin" value='<c:out value="${us.getIdUsuario()}" />'readonly="readonly"/></td></tr>	
					<tr><td>Id de Administrativo</td><td><input type="number" name="txtidadmin" id="txtidadmin" value='<c:out value="${ad.getIdadministrativo()}"/>'/></td></tr>				
					<tr><td >RUT</td><td><input type="text" name="txtrutadmin" id="txtrutadmin" value='<c:out value="${us.getUserrun()}" />'/></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="txtnomadmin" id="txtnomadmin" value='<c:out value="${us.getUsernombre()}" />' /></td></tr>
					<tr><td>Apellidos</td><td><input type="text" name="txtapeadmin" id="txtapeadmin" value='<c:out value="${us.getUserapellidos()}"/>'/></td></tr>
					<tr><td>Correo</td><td><input type="email" name="txtemailadmin" id="txtemailadmin" value='<c:out value="${ad.getAdminCorreo()}" />'/></td></tr>
					<tr><td>Área</td><td><input type="text" name="txtarea" id="txtarea" value='<c:out value="${ad.getAdminArea()}" />' /></td></tr>

			<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Usuario" /><br /></td></tr>

			</table>
		</form>
		
	</fieldset>
</body>
</html>