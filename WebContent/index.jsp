<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="th.ac.sau.controllers.HelloWorldController" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>

<body>
<%
HelloWorldController controller = new HelloWorldController();
String hello = controller.howAreYou("Captan Tui");

out.println("<br /><center>"+hello+"</center>");
%>
</body>

</html>