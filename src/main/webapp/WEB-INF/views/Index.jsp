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
        <h2> INICIO</h2>
        <h2>Nombre de nuestra Empresa</h2>
        <div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="resources/iconos/icono-menu.png" alt=""
				class="icon-menu"></label>

       <nav class="menu">
				<ul>
				<li><a href="<%=request.getContextPath()%>/listaCapacitaciones">Listado de Capacitaciones</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitaciones</a></li>	
				<li><a href="<%=request.getContextPath()%>/listaClientes">Lista de Clientes</a></li>
				<li><a href="<%=request.getContextPath()%>/listaPagos">Pagos</a></li>			
				<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>
				<!-- EDITAR LUEGO.... AGREGUE LA LINEA DE ABAJO SOLO PARA VER LA LISTA DE VISITAS -->  
				<li><a href="<%=request.getContextPath()%>/listaVisitas">Listado de Visitas</a></li>
				<li><a href="<%=request.getContextPath()%>/listaUsuarios">Lista de Usuarios</a></li>
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesión</a></li>
							
				</ul>
			</nav>
      
        </div>
    </header>
    <fieldset class="cel- agrupar-t agrupar-e">
        <section>

                <h3>¿CUÁL ES EL OBJETIVO DEL SISTEMA DE INFORMACIÓN?</h3>

                <p class="cel- texto-t texto-e">Administrar los principales procesos que se llevan a cabo en ella día a día.</p>
        </section>

        <section>

                <h3>¿QUIÉNES DEBERÍAN USAR EL SISTEMA?</h3>

                <p class="cel- texto-t texto-e">Personal responsable de los principales procesos</p>
        </section>

        <section>

                <h3>¿QUÉ PROCESOS CONSIDERA LA PLATAFORMA ACTUALMENTE?</h3>

                <p class="cel- texto-t texto-e">Asesorías en prevención de riesgos</p>
        </section>
    </fieldset>
    <footer id="pie">
        Derechos Reservados G1 &copy; 2020
    </footer>

</body>
</html>