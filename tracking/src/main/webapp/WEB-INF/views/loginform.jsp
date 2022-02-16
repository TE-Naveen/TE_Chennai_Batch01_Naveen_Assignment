<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String err = (String) request.getAttribute("err");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>booking|login</title>
<style type="text/css">
<%@include file="loginform.css" %>
</style>
</head>
<body>

	<form class="login" action="./login" method="post">
		<%if (err != null && !err.isEmpty()) {%>
		<h1 style="color: red;"><%=err%></h1>
		<%}%>
		<h2>User Login</h2>
		<input type="number" name="id" placeholder="UserId" onclick=""> 
		<input type="password" name="password" placeholder="Password">
		<button type="submit">Login</button>
	</form>

</body>
</html>