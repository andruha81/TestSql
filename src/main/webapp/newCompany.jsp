<html>
<head>
    <title>New company</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
</head>
<body>
<form action="/company/add" method="post">
    <label for="companyName">Company name:</label>
    <input type="text" name="companyName" id="companyName">
    <br>
    <label for="companyFullName">Company full name:</label>
    <input type="text" name="companyFullName" id="companyFullName">
    <br>
    <label for="companyAddress">Company address:</label>
    <input type="text" name="companyAddress" id="companyAddress">
    <br>
    <input type="submit">
</form>
</body>
</html>