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
		<h2>LISTADO USUARIOS</h2>
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
		<caption>LISTADO DE USUARIOS SIN EDITAR</caption>
			<tr class="negrita">
				<td>ID Usuario</td>
				<td>RUN</td>
				<td>Nombre</td>
				<td>Apellidos</td>
				<td>Tipo de Usuario</td>
				<td></td>
			</tr>
			<c:forEach items="${listauser}" var="lus">
			<tr>
				<td><c:out value="${lus.getIdUsuario()}" /></td>
				<td><c:out value="${lus.getUserrun()}" /></td>
				<td><c:out value="${lus.getUsernombre()}" /></td>
				<td><c:out value="${lus.getUserapellidos()}" /></td>
				<td id="tipo"><c:out value="${lus.getUserTipo()}"  /></td>
				
				<c:if test="${lus.getUserTipo()=='Cliente' }">
				<td><a href='<c:out value="${pageContext.request.contextPath}" />/editarCliente/<c:out value="${lus.getIdUsuario()}" />'>Editar</a>			
				</c:if>	
						<c:if test="${lus.getUserTipo()=='Administrativo' }">
				<td><a href='<c:out value="${pageContext.request.contextPath}" />/editarAdministrativo/<c:out value="${lus.getIdUsuario()}" />'>Editar</a>			
				</c:if>	
				<c:if test="${lus.getUserTipo()=='Profesional' }">
				<td><a href='<c:out value="${pageContext.request.contextPath}" />/editarProfesional/<c:out value="${lus.getIdUsuario()}" />'>Editar</a>			
				</c:if>		
			</tr>
			
			</c:forEach>		
				</table>
		<table class="cel- tablaadm-t tablaadm-e">
		<caption>LISTADO DE USUARIOS SEGÚN TIPO</caption>
			<tr class="negrita">
				<td>ID Usuario</td>
				<td>RUN</td>
				<td>Nombre</td>
				<td>Apellidos</td>
				<td>Teléfono</td>
				<td>Correo Electrónico</td>
				<td>Tipo de Usuario</td>
				<td></td>
			</tr>
										
			<c:forEach items="${listacli}" var="lc">
			<tr>
				<td><c:out value="${lc.getUsuario_idusuario()}" /></td>
				<td><c:out value="${lc.getRutCliente()}" /></td>
				<td><c:out value="${lc.getClienombres()}" /></td>
				<td><c:out value="${lc.getCliapellidos()}" /></td>
				<td><c:out value="${lc.getClitelefono()}" /></td>
				<td></td>
				<td>Cliente</td>										
				<td><a href='<c:out value="${pageContext.request.contextPath}" />/editarCliente/<c:out value="${lc.getUsuario_idusuario()}" />'>Editar</a>
				
			</tr>			
			</c:forEach>	
				
			<c:forEach items="${listaadm}" var="la">
			<tr>
				<td><c:out value="${la.getUsuario_idusuario()}" /></td>
				<td><c:out value="${la.getAdminRun()}" /></td>
				<td><c:out value="${la.getAdmiNombres()}" /></td>
				<td><c:out value="${la.getAdminApellidos()}" /></td>
				<td></td>	
				<td><c:out value="${la.getAdminCorreo()}" /></td>
				<td>Administrativo</td>
				<td><a href='<c:out value="${pageContext.request.contextPath}" />/editarAdministrativo/<c:out value="${la.getUsuario_idusuario()}" />'>Editar</a>
			</tr>			
			</c:forEach>	
					
			<c:forEach items="${listaprof}" var="lp">
			<tr>
				<td><c:out value="${lp.getUsuario_idusuario()}" /></td>
				<td><c:out value="${lp.getProfRun()}" /></td>
				<td><c:out value="${lp.getProfNombres()}" /></td>
				<td><c:out value="${lp.getProfApellidos()}" /></td>
				<td><c:out value="${lp.getProfTelefono()}" /></td>	
				<td></td>
				<td>Profesional</td>	
				<td><a href='<c:out value="${pageContext.request.contextPath}" />/editarProfesional/<c:out value="${lp.getUsuario_idusuario()}" />'>Editar</a>
			</tr>			
			</c:forEach>	
	</table>

	</fieldset>
	<footer id="pie">
		<!-- <blockquote>
			<a href="CrearUsuario">Crear un nuevo usuario</a>
		</blockquote> -->
		Derechos Reservados G1 &copy; 2020
	</footer>

</body>
</html>