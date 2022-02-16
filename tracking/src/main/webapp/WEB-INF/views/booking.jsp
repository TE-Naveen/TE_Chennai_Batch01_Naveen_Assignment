<%@page import="java.util.List"%>
<%@page import="com.te.tracking.bean.Tickets"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%Object tickets=request.getAttribute("data"); %>
    <%Integer count=Integer.parseInt(tickets.toString()); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SeatCount</title>
<style type="text/css">
<%@include file="booking.css"%>
</style>
</head>
<body>

	<form class="book" action="./book">
		<h1>Seat Available is <%=count%></h1>
		<input type="number" name="no" placeholder="enter the number of seat">
		<button type="submit">book</button>
	</form>
	
</body>
</html>