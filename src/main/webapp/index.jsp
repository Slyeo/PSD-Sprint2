<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="sprint2.*"%>

 
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
  
    </head>
 
   <body class="twoColElsLt">

<div id="container">
  <div id="sidebar1">
    <h3></h3>
  
  <!-- end #sidebar1 --></div>
  <div id="mainContent">
  
  		<h1>Login Page</h1>
  		
  		<form method="post">
		Login ID: <input type="text" name="userName">
		<br />
		Password: <input type="password" name="password"/>
		<br />
		<input type="submit" value="Submit" />
		
		</form>
  		
  		<% 
  		User users = new User();
  		String users2, accessLvl;
  		for(User v: users.getAllUser()){
  		
  		users2 = v.getStuUser();
  		accessLvl = v.getStuAccess();
  		
  		if (v.getStuUser().equals(request.getParameter("userName")) && v.getStuPass().equals(request.getParameter("password")) && v.getStuAccess().equals("1") ) { %>
			<jsp:forward page="admin.html" />
		<% } 
		
		else if (v.getStuUser().equals(request.getParameter("userName")) && v.getStuPass().equals(request.getParameter("password")) && v.getStuAccess().equals("2") ) { %>
			<jsp:forward page="user.html" />
		<% } 
		
 		}
 		
 		if(request.getParameter("userName") != null && request.getParameter("password") != null ) { %>
			 <br>
			 <font color="red">Please re-enter the username and password! </font>
			 <br>
		<% } 
		%>
 
 		<hr><ol> 
        <p>Copyright @ Fantastic 4, Team 6.</p>
    <!-- end #mainContent --></div>
	<br class="clearfloat" />
<!-- end #container --></div>
</body>
</html>