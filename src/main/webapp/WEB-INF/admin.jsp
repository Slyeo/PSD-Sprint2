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
  
  		<h1>Admin add new teaching session</h1>
        <form method="POST" action="admin.html"></p>
           <p>Lecturer Name:  <select name="lecName" id="lecName">
            <option>Dr. Liew Pak San</option>
            <option>Dr. Steven Goh</option>
            <option>Dr. Alvis Fong</option>
            <option>Dr. Keoh Sye Loong</option>
          </select></p>    
           <p>Course Name:  <select name="courseName" id="courseName">
            <option>Professional Software Development3</option>
            <option>Algorithm 3</option>
            <option>Advanced Programming 3</option>
            <option>Interactive Systems 3</option>
            <option>Programming Languages 3</option>
          </select></p>    
           <p> Lesson Date: <input type="text" id="datepicker" name="lessonDate" /></p>
           <p> Lesson Time: <input type="text" name="lessonTime" /></p>
          <p>  Lesson Duration: <select name="lessonDuration" id="lessonDuration">
            <option>30 min</option>
            <option>1 hour</option>
            <option>1 hour 30 mins</option>
            <option>2 hour</option>
            <option>2 hour 30 mins</option>
            <option>3 hour</option>
            <option>3 hour 30mins</option>
            <option>4 hour</option>
          </select></p>   
           <p>Repeat Frequency:  <select name="repeatFreq" id="repeatFreq">
            <option>Daily</option>
            <option>Weekly</option>
            <option>Monthly</option>
          </select></p>    
           <p> Max Attendance: <input type="text" name="maxAttendance" maxlength="4" /></p>
          <p>  Compulsory: 
         Yes: <input type="radio" name="compulsory" id="compulsory" value="Yes" checked>
          No:<input type="radio" name="compulsory" id="compulsory" value="No">
          </p>
           <p> Venue: <select name="venue" id="venue" />
           <option>RP, E5L3, Lecture Hall</option>
            <option>RP, E6L1, Lab</option>
            <input type="submit" value="Add" /></p>
        </form>
        
        <% if(request.getParameter("lecName") != null) { %>
        <hr><ol> 
        New session successfully added!
        </ol><hr>
		<% } %>
		
		<hr><ol> 
        <% for (Admin list : adminDao.getAllGuests()) { %>
            <li> <%= list %> </li>
        <% } %>
        </ol><hr>
 
 		<hr><ol> 
        <p>Copyright @ Fantastic 4, Team 6.</p>
    <!-- end #mainContent --></div>
	<br class="clearfloat" />
<!-- end #container --></div>
</body>
</html>