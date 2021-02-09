<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<title>Login</title>
	<link rel="stylesheet" href='<c:out value="${pageContext.request.contextPath}"/>/resources/css/Estilos.css'>
	<script src='<c:out value="${pageContext.request.contextPath}"/>/resources/js/script.js'></script>
</head>
<body>
	<h3>Login</h3>
	<%
	String error = (String) request.getAttribute("error");
	if (error != null && error.equals("true")) {
		out.println("<h4 style=\"color:red\">Credenciales inválidas. Por favor vuelva a intentar!!</h4>");
	}
	%>
	<form name='loginForm' action="<c:url value='login' />" method='POST'>

		<table>
			<tr>
				<td>Usuario:</td>
				<td><input type='text' name='username' id='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' id='password' /></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="Ingresar" /></td>
				<td><input name="reset" type="reset" /> <input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" /></td>

			</tr>
		</table>

	</form>
</body>
</html>
