<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CTF</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<p>Hello, Spring flag{He1l8lo_hac6ke7r!}</p>
<a href = ${pageContext.request.contextPath}/add>Add user</a>
<spring:form method="post" action="search">
    <input type = "text" name="username"/>
    <input type = "submit" value = "Search"/>
</spring:form>
</body>
</html>
