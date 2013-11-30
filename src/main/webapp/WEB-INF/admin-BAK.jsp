<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="sprint2.*"%>
 
<jsp:useBean id="adminDao" type="sprint2.AdminDao" scope="request" />
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>Team6: PSD Sprint 2</title>
    </head>
 
    <body>
        <form method="POST" action="admin.html">
            Name: <input type="text" name="name" />
            Lesson Date: <input type="text" name="lessonDate" />
            Lesson Time: <input type="text" name="lessonTime" />
            Lesson Duration: <input type="text" name="lessonDuration" />
            Repeat Frequency: <input type="text" name="repeatFreq" />
            Lecturer Name: <input type="text" name="lecName" />
            Max Attendance: <input type="text" name="maxAttendance" />
            Compulsory: <input type="text" name="compulsory" />
            Venue: <input type="text" name="venue" />
            <input type="submit" value="Add" />
        </form>
 
        <hr><ol> 
        <% for (Admin list : adminDao.getAllGuests()) { %>
            <li> <%= list %> </li>
        <% } %>
        </ol><hr>
 
        <iframe src="http://www.objectdb.com/pw.html?spring-eclipse"
            frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
     </body>
 </html>