<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CTF</title>
</head>
<body>
<p>Hello, Spring! You flag ctf{welcome}</p>
<a href = /add>Add user</a>
<spring:form method="post" action="search">
    <input type = "text" name="username"/>
    <input type = "submit" value = "Search"/>
</spring:form>
</body>
</html>
