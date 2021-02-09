<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<h2>EDITAR PROFESIONAL</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="iconos/icono-menu.png" alt=""
				class="icon-menu" ></label>
			<nav class="menu">
				<ul>
				
				<li><a href="<%=request.getContextPath()%>/listaPagos">Listado de Pagos</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearPago">Crear pagos</a></li>
				<li><a href="<%=request.getContextPath()%>/listaUsuarios">Listado de Usuarios</a></li>
				<li><a href="<%=request.getContextPath()%>/crearUsuario">Crear Nuevo Usuario</a></li>
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>
							
				</ul>
			</nav>
		</div>
	</header>
	<fieldset class="cel- agrupar-t agrupar-e">
		<form method="post" action='<c:out value="${pageContext.request.contextPath}"/>/ProfesionalEditado'>
			<table class="tablausr-t tablausr-e">	
					<tr><td>Id de Usuario</td><td><input type="number" name="txtiduser" id="txtiduser" value='<c:out value="${us.getIdUsuario()}" />' readonly="readonly"  /></td></tr>
					<tr><td>Id del Profesional</td><td><input type="number" name="txtidprof" id="txtidprof" value='<c:out value="${pr.getIdProfesional()}" />'/></td></tr>				
					<tr><td >RUT</td><td><input type="text" name="txtrutprof" id="txtrutprof" value='<c:out value="${us.getUserrun()}" />' /></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="txtnomprof" id="txtnomprof" value='<c:out value="${us.getUsernombre()}" />' /></td></tr>
					<tr><td>Apellidos</td><td><input type="text" name="txtapeprof" id="txtapeprof" value='<c:out value="${us.getUserapellidos()}" />' /></td></tr>
					<tr><td>Teléfono</td><td><input type="text" name="txttelprof" id="txttelprof" value='<c:out value="${pr.getProfTelefono()}" />' /></td></tr>
					<tr><td>Titulo</td><td><input type="text" name="txttitulo" id="txttitulo" value='<c:out value="${pr.getProfTitulo()}" />'/></td></tr>
					<tr><td>Proyecto</td><td><input type="text" name="txtproyecto" id="txtproyecto" value='<c:out value="${pr.getProfProyecto()}" />'/></td></tr>
			
			
			<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Usuario" /><br /></td></tr>

			</table>
		</form>
		
	</fieldset>

</body>
</html>