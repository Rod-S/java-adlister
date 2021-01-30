<%--
  Created by IntelliJ IDEA.
  User: rodsanati
  Date: 1/28/21
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>
<h1>Register Now</h1>
<form action="/register" method="POST">
    <label for="email">Email address</label>
    <input type="text" name="email" id="email">

    <label for="username">Username</label>
    <input type="text" name="username" id="username">

    <label for="password">Password</label>
    <input type="password" name="password" id="password">

    <input type="submit" value="Submit">
</form>
</body>
</html>
