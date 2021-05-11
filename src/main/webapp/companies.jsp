<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Companies</title>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Full name</th>
    <th>Address</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="bus" items="${requestScope.companies}">
    <tr>
      <td></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
