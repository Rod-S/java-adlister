<%--
  Created by IntelliJ IDEA.
  User: rodsanati
  Date: 1/22/21
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads Page</title>
</head>
<body>
<h1>Here are all our ads</h1>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>ad title: ${ad.title}</h2>
        <p>ad description: ${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
