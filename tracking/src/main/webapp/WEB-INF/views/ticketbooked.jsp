<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%Integer data=(Integer)request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ticket</title>
<style type="text/css">
<%@include file="ticketbooked.css" %>
</style>
</head>
<body>
<div class="ticket">
<%if(data!=null) {%>
 <h1 style="color: green">Ticket Booked <%= data%> Happy journey</h1>
 <%}%> 
 <a href="./logout"><button>logout</button></a>
 <a href="./cancel"><button id="cancel">cancel</button></a>
 
 </div>
</body>
</html>