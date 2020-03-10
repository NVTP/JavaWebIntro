<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="th.ac.sau.controllers.UserController" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Detail</title>
</head>

<body>

<%

String name = request.getParameter("name");
String age = request.getParameter("age");

int a = Integer.parseInt(age);

UserController user = new UserController();

out.println(user.getDetail(name, a));
%>

</body>

</html>