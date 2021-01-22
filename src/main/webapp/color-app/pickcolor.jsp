<%--
  Created by IntelliJ IDEA.
  User: rodsanati
  Date: 1/21/21
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick a color!</title>
</head>
<body>
<h1> Any Color!</h1>
<form action="/viewcolor" method="POST">
    <label for="color">You picked:</label>
    <input type="text" name="color" id="color">
    <button type="submit">Submit</button>
</form>
</body>
</html>
