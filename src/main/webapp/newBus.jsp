<html>
<head>
    <title>New Bus</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
</head>
<body>
<form action="/bus/add" method="post">
    <label for="busModel">Bus model:</label>
    <input type="text" name="busModel" id="busModel">
    <br>
    <label for="company">Company</label>
    <input type="number" name="company" id="company">
    <br>
    <input type="submit">
</form>
</body>
</html>