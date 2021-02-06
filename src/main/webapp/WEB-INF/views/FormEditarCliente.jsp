<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa Asesoría</title>
	<link rel="stylesheet" href='<c:out value="${pageContext.request.contextPath}"/>/resources/css/Estilos.css'>
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.min.js"></script>
	<script src='<c:out value="${pageContext.request.contextPath}"/>/resources/js/script.js'></script>

</head>
<body>

<header id="seccion">
		<h2>Editar Cliente</h2>
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
		<form method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesareditar'>
			<table class="tablausr-t tablausr-e">	
					<tr><td>Id Usuario</td><td><input type="text" name="txtidclieuser" id="txtidclieuser" value='<c:out value="${us.getIdUsuario()}" />' readonly="readonly" /></td></tr>		
					<tr><td >RUT</td><td><input type="text" name="txtrutcliente" id="txtrutcliente" value='<c:out value="${us.getUserrun()}" />' readonly="readonly"/></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="txtnomcliente" id="txtnomcliente" value='<c:out value="${us.getUsernombre()}" />' /></td></tr>
					<tr><td>Apellidos</td><td><input type="text" name="txtapecliente" id="txtapecliente" value='<c:out value="${us.getUserapellidos()}" />'/></td></tr>
					<tr><td>Teléfono</td><td><input type="text" name="txttelcliente" id="txttelcliente" value='<c:out value="${cl.getClitelefono()}" />'/></td></tr>
					<tr><td>AFP</td><td><input type="text" name="txtafpcliente" id="txtafpcliente" value='<c:out value="${cl.getCliafp()}" />'/></td></tr>
						
					<tr><td>Sistema de Salud</td><td><select name="sisSalud" >
						<option value= "Seleccione" value='<c:out value="${cl.getClisistemasalud()}" />'> Seleccione
						<option value="1">Fonasa
						<option value="2">Isapre</select></td></tr>
						
					<tr><td>Direccion</td><td><input type="text" name="txtdirecccliente" id="txtdirecccliente" value='<c:out value="${cl.getClidireccion()}" />'/></td></tr>
					<tr><td>Comuna</td><td><input type="text" name="txtcomcliente" id="txtcomcliente" value='<c:out value="${cl.getClicomuna()}" />'/></td></tr>
					<tr><td>Edad</td><td><input type="number" name="txtedadcliente" id="txtedadcliente" value='<c:out value="${cl.getCliEdad()}" />' /></td></tr>
						
				
				
				<tr><td colspan="6"><input type="submit" name="btnguardar" id="btnguardar" value="Guardar Usuario" /><br /></td></tr>

			</table>
		</form>
		
	</fieldset>
</body>
</html>