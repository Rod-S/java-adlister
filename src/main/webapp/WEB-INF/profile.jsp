<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
            <p>Welcome back, ${sessionScope.username}!</p>
    </div>
    <form method="GET" action="/logout">
        <button type="submit">LOGOUT</button>
    </form>
</body>
</html>
