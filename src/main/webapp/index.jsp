<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Testing SQL</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
</head>
<body>
<h2>Please login</h2>
<c:if test="${requestScope.isLogged != null && requestScope.isLogged.equals('false')}">
    <p><em>Login FAILED</em>. Please try again</p>
</c:if>
<form action="/login" method="post">
    <label for="login">Login:</label>
    <input type="text" name="login" id="login">
    <br>
    <label for="password">Password:</label>
    <input type="password" name="password" id="password">
    <br>
    <input type="submit">
</form>
</body>
</html>
