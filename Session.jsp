<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import = "java.io.*,java.util.*, jakarta.servlet.*" %>
   
  <%

Date createTime = new Date(session.getCreationTime());

Date lastAccessTime = new Date(session.getLastAccessedTime());
String title = "Welcome Back to my website";
Integer visitCount = new Integer(0);
String visitCountKey = new String("visitCount");
String userIDKey = new String("userID");
String userID = new String("ABCD");

if (session.isNew()) {
 title = "Welcome to my website";
 session.setAttribute(userIDKey, userID);
 session.setAttribute(visitCountKey, visitCount);
}
visitCount = (Integer) session.getAttribute(visitCountKey);
visitCount = visitCount + 1;
userID = (String) session.getAttribute(userIDKey);
session.setAttribute(visitCountKey, visitCount);
%>
<!DOCTYPE html>
<html>
<head>
<title>Session Tracking</title>
</head>
<body>
 <h1>Session Tracking</h1>
 <table border="1">
  <tr bgcolor="#949494">
   <th>Session info</th>
   <th>Value</th>
  </tr>
  <tr>
   <td>id</td>
   <td>
    <%
     out.print(session.getId());
    %>
   </td>
  </tr>
  <tr>
   <td>Creation Time</td>
   <td>
    <%
     out.print(createTime);
    %>
   </td>
  </tr>
  <tr>
   <td>Time of Last Access</td>
   <td>
    <%
     out.print(lastAccessTime);
    %>
   </td>
  </tr>
  <tr>
   <td>User ID</td>
   <td>
    <%
     out.print(userID);
    %>
   </td>
  </tr>
  <tr>
   <td>Number of visits</td>
   <td>
    <%
     out.print(visitCount);
    %>
   </td>
  </tr>
 </table>
</body>
</html>