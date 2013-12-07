<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="sprint2.*"%>
 <%@page import="java.util.HashSet" %>
 
<jsp:useBean id="adminDao" type="sprint2.AdminDao" scope="request" />

<jsp:useBean id="setUserProperty" class="sprint2.User" scope="session"/>
<jsp:setProperty name="setUserProperty" property="*"/>

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>Team6: PSD Sprint 2</title>
		      <style type="text/css"> 
<!-- 
body  {
	font: 100% Verdana, Arial, Helvetica, sans-serif;
	background: #666666;
	margin: 0; 
	padding: 0;
	text-align: center; 
	color: #000000;
}


.twoColElsLt #container { 
	width: 70em;  
	background: #FFFFFF;
	margin: 0 auto; 
	border: 1px solid #000000;
	text-align: left; 
} 


.twoColElsLt #sidebar1 {
	float: left; 
	width: 12em;
	background: #EBEBEB; 
	padding: 15px 0; 
}
.twoColElsLt #sidebar1 h3, .twoColElsLt #sidebar1 p {
	margin-left: 10px; 
	margin-right: 10px;
}


.twoColElsLt #mainContent {
 	margin: 0 1.5em 0 13em; 
} 


.fltrt {
	float: right;
	margin-left: 8px;
}
.fltlft {
	float: left;
	margin-right: 8px;
}
.clearfloat { 
	clear:both;
    height:0;
    font-size: 1px;
    line-height: 0px;
}
--> 
</style>

<meta charset="utf-8">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  </script>
  
  
    </head>
 
   <body class="twoColElsLt">

<div id="container">
  <div id="sidebar1">
    <h3></h3>
  
  <!-- end #sidebar1 --></div>
  <div id="mainContent">
  
  		<%
  		
  		
  		User users = new User();
  		HashSet<String> courses = new HashSet<String>();
        for (Admin list : adminDao.getAllGuests()) {
        	courses.add(list.getCourseName());
        } 
        
  		%>
  
  		<h1>Welcome ${username}, View course timetable</h1>
        <form method="POST" action="user.html"></p>
         <input type="hidden" name="getUserName" id="getUserName" value="${username}" />
           <p>Sign up for Courses:  <select name="courseName" id="courseName">
           <%
	        for(String v : courses){
	        	%><option><%out.println(v);%></option><%
			}
           %>
            
          </select> 
          <input type="submit" value="Sign Up!" /></p>
        </form> 
        </form>
        <a href="date.html">View Timetable</a>
        <hr>
        <% 	
       	//out.println(request.getParameter("getUserName"));
        for(User u : users.getAllUser()){
        	//out.println(u.getStuUser());
        	if(u.getStuUser().equals(request.getParameter("getUserName"))){
        		u.setStuCourse(request.getParameter("courseName"));
        		out.println("You have Signed up for: " + request.getParameter("courseName"));
        		//courses.remove(request.getParameter("courseName"));
        		//out.println(courses);
        	}
        }
        
        if("PSD3".equals(request.getParameter("courseName"))) { %>
        <table border="1">
        <th>Lecturer</th><th>C. Name</th><th>Date</th><th>Time</th><th>Duration</th><th>Freq</th><th>Capacity</th><th>Compulsory</th><th>Location</th><br>
        <br>
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("courseName"))) { %>
            <%= list %>
        <% } %>
		<% } %>
		
 		<% if("ALG3".equals(request.getParameter("courseName"))) { %>
 		<table border="1">
        <th>Lecturer</th><th>C. Name</th><th>Date</th><th>Time</th><th>Duration</th><th>Freq</th><th>Capacity</th><th>Compulsory</th><th>Location</th><br>
        <br>
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("courseName"))) { %>
            <%= list %>
        <% } %>
		<% } %>
 		
 		<% if("AP3".equals(request.getParameter("courseName"))) { %>
 		 <table border="1">
        <th>Lecturer</th><th>C. Name</th><th>Date</th><th>Time</th><th>Duration</th><th>Freq</th><th>Capacity</th><th>Compulsory</th><th>Location</th><br>
        <br>
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("courseName"))) { %>
            <%= list %>
        <% } %>
		<% } %>
 		
 		<% if("IS3".equals(request.getParameter("courseName"))) { %> <table border="1">
        <th>Lecturer</th><th>C. Name</th><th>Date</th><th>Time</th><th>Duration</th><th>Freq</th><th>Capacity</th><th>Compulsory</th><th>Location</th><br>
        <br>	
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("courseName"))) { %>
            <%= list %>
        <% } %>
		<% } %>
		
		<% if("PL3".equals(request.getParameter("courseName"))) { %> <table border="1">
        <th>Lecturer</th><th>C. Name</th><th>Date</th><th>Time</th><th>Duration</th><th>Freq</th><th>Capacity</th><th>Compulsory</th><th>Location</th><br>
        <br>	
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("courseName"))) { %>
            <%= list %>
        <% } %>
		<% } %>
		
 		</table>
 		
 		<hr>
        <p>Copyright @ Fantastic 4, Team 6.</p>
        <form method="POST" action="index.jsp"></p>
        <input type="submit" value="Logout" /></form>
    <!-- end #mainContent --></div>
	<br class="clearfloat" />
<!-- end #container --></div>
</body>
</html>