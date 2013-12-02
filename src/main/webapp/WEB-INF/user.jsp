<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="sprint2.*"%>
 
<jsp:useBean id="adminDao" type="sprint2.AdminDao" scope="request" />
 
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
	width: 46em;  
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
  
  		<h1>Select Lecturer's name</h1>
        <form method="POST" action="user.html"></p>
           <p>Lecturer Name:  <select name="lecName" id="lecName">
            <option>Dr. Liew Pak San</option>
            <option>Dr. Steven Goh</option>
            <option>Dr. Alvis Fong</option>
            <option>Dr. Keoh Sye Loong</option>
          </select> 
          <input type="submit" value="Select" /></p>
        </form> 
        </form>
        
        <% if("Dr. Liew Pak San".equals(request.getParameter("lecName"))) { %>
        <hr><ol> 
        Lecturer Name, Date, Time, Freq, Duration, Capacity, Compulsory, Location<br>
        <br>
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("lecName"))) { %>
            <li> <%= list %> </li>
        <% } %>
        </ol><hr>
		<% } %>
		
 		<% if("Dr. Steven Goh".equals(request.getParameter("lecName"))) { %>
        <hr><ol> 
        Lecturer Name, Date, Time, Freq, Duration, Capacity, Compulsory, Location<br>
        <br>
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("lecName"))) { %>
            <li> <%= list %> </li>
        <% } %>
        </ol><hr>
		<% } %>
 		
 		<% if("Dr. Alvis Fong".equals(request.getParameter("lecName"))) { %>
        <hr><ol> 
        Lecturer Name, Date, Time, Freq, Duration, Capacity, Compulsory, Location<br>
        <br>
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("lecName"))) { %>
            <li> <%= list %> </li>
        <% } %>
        </ol><hr>
		<% } %>
 		
 		<% if("Dr. Keoh Sye Loong".equals(request.getParameter("lecName"))) { %>
        <hr><ol> 
        Lecturer Name, Date, Time, Freq, Duration, Capacity, Compulsory, Location<br>
        <br>
        <% for (Admin list : adminDao.getLecTiming(request.getParameter("lecName"))) { %>
            <li> <%= list %> </li>
        <% } %>
        </ol><hr>
		<% } %>
 		
 		<hr><ol> 
        <p>Copyright @ Fantastic 4, Team 6.</p>
        <input type="submit" value="Logout" />
    <!-- end #mainContent --></div>
	<br class="clearfloat" />
<!-- end #container --></div>
</body>
</html>