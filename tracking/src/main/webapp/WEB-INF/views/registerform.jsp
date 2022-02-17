<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
	String err = (String) request.getAttribute("err");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register||user</title>
<style type="text/css">
<%@include file="registerform.css" %>
</style>
</head>
<body>
	
	<form class="Register" action="./register" method="post">
	<%	if (err != null && !err.isEmpty()) {%>
	<h2 style="color: red;"><%=err%></h2>
	<%}	%>
	
		<h2>User Register</h2>
		<input type="number" name="id" placeholder="UserId"> <input
			type="text" name="name" placeholder="Username"> <input
			type="password" name="password" placeholder="Password">
		<button type="submit">Register</button>
	</form>

</body>
</html>