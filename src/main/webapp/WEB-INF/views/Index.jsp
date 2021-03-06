<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa de Asesor�as</title>
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

       <nav class="menuCSS3">
       <ul>
			<li><a href="">PERFIL CLIENTE</a>			
				<ul>
				<li><a href='<%=request.getContextPath()%>/listaCapacitaciones'>Listado de Capacitaciones</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitaciones</a></li>	
				<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>
				</ul>
			</li>
			<li><a href="">PERFIL ADMINISTRATIVO</a>
				<ul>
				<li><a href="<%=request.getContextPath()%>/listaPagos">Listado de Pagos</a></li>
				<li><a href="<%=request.getContextPath()%>/CrearPago">Crear pagos</a></li>
				<li><a href="<%=request.getContextPath()%>/listaUsuarios">Listado de Usuarios</a></li>
				<li><a href="<%=request.getContextPath()%>/crearUsuario">Crear Nuevo Usuario</a></li>
				</ul>

			</li>
		<li><a href="">PERFIL PROFESIONAL</a>
				<ul>
				<li><a href="<%=request.getContextPath()%>/listaVisitas">Listado de Visitas</a></li>
				</ul>

			</li>		
		
				<li><a href="<%=request.getContextPath()%>/logout">Cerrar Sesi�n</a></li>
				</ul>
			</nav>
      
        </div>
    </header>
    <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
    <fieldset class="cel- agrupar-t agrupar-e" style="margin-top: 100px">
        <section>

                <h3>�CU�L ES EL OBJETIVO DEL SISTEMA DE INFORMACI�N?</h3>

                <p class="cel- texto-t texto-e">Administrar los principales procesos que se llevan a cabo en ella d�a a d�a.</p>
        </section>

        <section>

                <h3>�QUI�NES DEBER�AN USAR EL SISTEMA?</h3>

                <p class="cel- texto-t texto-e">Personal responsable de los principales procesos</p>
        </section>

        <section>

                <h3>�QU� PROCESOS CONSIDERA LA PLATAFORMA ACTUALMENTE?</h3>

                <p class="cel- texto-t texto-e">Asesor�as en prevenci�n de riesgos</p>
        </section>
    </fieldset>
    <footer id="pie">
        Derechos Reservados G1 &copy; 2020
    </footer>

</body>
</html>