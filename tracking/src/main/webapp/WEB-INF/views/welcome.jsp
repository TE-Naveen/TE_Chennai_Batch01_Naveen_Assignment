<%@page import="com.te.tracking.bean.Tickets"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<% String err=(String)request.getAttribute("err"); %>
	<%Integer ticket=(Integer)request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style type="text/css">
<%@include file ="welcome.css"%>
</style>
</head>
<body>
	
	<form class="check" action="./seatcheck" method="post">
	<%if(err!=null&&!err.isEmpty()){ %>
		<h2 style="color: red;"><%=err%></h2>
		<%if(ticket!=null&&ticket>0){%>
			<h2 id="ticket"><%=ticket %></h2>
		<%}%>
	<%} %>
		<h1>welcome to SeatChecking</h1>   
            <div class="fromstates">
            <label>From States</label>
                <select name="fromState" id="fromState" onchange="populate(this.id,'fromCity')">
                <option value="states">choose states</option>
                <option value="Tamilnadu">Tamilnadu</option>
                <option value="kerala">kerala</option>
            </select>
           


		<label>From City</label>		
			<select name="fromCity" id="fromCity"></select>
		</div>

		<div class="tostates">
                <label>To states</label>
                <select name="toState" id="toState" onchange="populateto(this.id,'toCity')">
                <option value="states">choose states</option>
                <option value="Tamilnadu">Tamilnadu</option>
                <option value="kerala">kerala</option>
            </select>
    
                <label id="tcity">To City</label>
                <select name="toCity" id="toCity">
                </select>
            </div>
		
            <input type="date" name="travelDate" placeholder="enter date">
            <button type="submit">check seats</button>
        </form>

    <script>

        function populate(s1,s2){
            var s1=document.getElementById(s1);
            var s2=document.getElementById(s2);
            
            s2.innerHTML="";
           
            if(s1.value=="Tamilnadu"){
                var optionArray=['Chennai','Madurai','Ramanad','Rameswaram'];
            }else if(s1.value=='kerala'){
               var optionArray=['Kollam','Thiruvananthapuram','Kottayam'];
            }
            for(var option in optionArray){
                var newoption =document.createElement("option");
               // newoption.value=option;
                newoption.innerHTML=optionArray[option];
                s2.options.add(newoption) ;
            }
        }

          
        function populateto(s1,s2){
            var s1=document.getElementById(s1);
            var s2=document.getElementById(s2);  
            s2.innerHTML="";
   
            if(s1.value=="Tamilnadu"){
                var optionArray=['Chennai','Madurai','Ramanad','Rameswaram'];
            }else if(s1.value=='kerala'){
               var optionArray=['Kollam','Thiruvananthapuram','Kottayam'];
            }

            for(var option in optionArray){
                var to =document.createElement("option");
                to.innerHTML=optionArray[option];
                s2.options.add(to) ;
            }
        }

    </script>


</body>
</html>