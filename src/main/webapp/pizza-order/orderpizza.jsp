<%--
  Created by IntelliJ IDEA.
  User: rodsanati
  Date: 1/21/21
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Izza Pizza!</title>
</head>
<body>
<c:choose>
    <c:when test="${!req.getAttribute('formsFilled') && req.getAttribute('crust') ==null}">
    <h1>Izza Pizza!</h1>
    <form method="POST" action="/orderpizza">
        <label for="crust">Choose Crust Type:</label>
        <select name="crust" id="crust">
            <option value="thin">Thin Crust</option>
            <option value="reg">Regular Crust</option>
            <option value="stuffed">Stuffed Crust</option>
        </select>
    <label for="sauce">Choose Sauce Type:</label>
    <select name="sauce" id="sauce">
        <option value="marinara">Marinara Sauce</option>
        <option value="bbq">BBQ Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
    </select>
        <br>
    <fieldset>
        <legend>Choose your toppings:</legend>
        <div>
            <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
            <label for="pepperoni">pepperoni</label>
        </div>
        <div>
            <input type="checkbox" id="mushrooms" name="toppings" value="mushrooms">
            <label for="mushrooms">mushrooms</label>
        </div>
        <div>
            <input type="checkbox" id="green-peppers" name="toppings" value="green-peppers">
            <label for="green-peppers">green peppers</label>
        </div>
    </fieldset>
        <br>
        <label for="address">Delivery Address</label>
        <input type="text" id="address" name="address">
        <button type="submit">Submit</button>
    </form>
                <h1>Izza Pizza!</h1>
                <h2>Here's your order:</h2>
                <p>Pizza crust: ${crust}</p>
                <p>Pizza sauce: ${sauce}</p>
                <p>Pizza toppings:
                <c:forEach var="topping" items="${toppings}">
                    ${topping}
                </c:forEach>
                </p>
                <p>Pizza address: ${address}</p>
    </c:when>
<%--    <c:otherwise>--%>
<%--        <h1>Eatza Pizza!</h1>--%>
<%--        <h2>Here's your order:</h2>--%>
<%--        <p>Pizza crust: ${crust}</p>--%>
<%--        <p>Pizza sauce: ${sauce}</p>--%>
<%--        <p>Pizza toppings: ${toppings}</p>--%>
<%--        <p>Pizza address: ${address}</p>--%>
<%--    </c:otherwise>--%>
</c:choose>
</body>
</html>
