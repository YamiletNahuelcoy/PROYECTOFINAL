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
		<h2>RESPONDER CHECKLIST</h2>
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
		<form id="formchek" name="formchek" method="post" action='<c:out value="${pageContext.request.contextPath}" />/procesachecklist'>
		 	<table class="tablaadm-t tablaadm-e">
                <tr class="negrita">
                    <td>Id Chequeo</td>
                    <td>Nombre</td>
                    <td>Seleccione chequeo</td>
                </tr>
				<c:forEach items="${verchecklist}" var="ch">
				<tr>
					<td><c:out value="${ch.getIdchequeo()}" /></td>
					<td id="cheqnombre"><c:out value="${ch.getCheqnombre()}" /></td>
					 <td><input type="checkbox" name="checkbox" value="chek" id="chek" /></td>																		
				</tr>
			</c:forEach>
                <tr>
                    <td colspan="3">
                        <input onclick="Listachequeo()" type="button" class="boton" value="Chequeo" name="cheq" id="Chequeo" >

                        <div id="chek9" class="lista"></div>
                    </td>
                </tr>
            </table>
		</form>
	</fieldset>
	<footer id="pie">
	
		Derechos Reservados G1 &copy; 2020
	</footer>

</body>
</html>