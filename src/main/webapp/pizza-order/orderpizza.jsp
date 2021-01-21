<%--
  Created by IntelliJ IDEA.
  User: rodsanati
  Date: 1/21/21
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Pizza!</title>
</head>
<body>
    <h1>Eatza Pizza!</h1>
    <form method="POST" action="/orderpizza">
        <label for="crust">Select Crust Type:</label>
        <input type="text" id="crust" name="crust">

        <label for="sauce">Select Sauce Type:</label>
        <input type="text" id="sauce" name="sauce">

        <label for="toppings">Select Toppings:</label>
        <input type="text" id="toppings" name="toppings">

        <label for="address">Delivery Address</label>
        <input type="text" id="address" name="address">
        <button type="submit">Submit</button>
    </form>
</body>
</html>
