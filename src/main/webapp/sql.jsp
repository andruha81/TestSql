<html>
<head>
    <title>Testing SQL</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
</head>

<body>
<form>
    <button type="submit" formaction="/table/create">Create table</button>
    <button type="submit" formaction="/table/drop">Delete table</button>
    <button type="submit" formaction="/table/truncate">Truncate table</button>
    <br>
    <fieldset>
        <legend>Company</legend>
        <button type="submit" formaction="/newCompany.jsp">Add company</button>
        <button type="submit" formaction="/company/show">Show companies</button>
    </fieldset>
    <br>
    <fieldset>
        <legend>Bus</legend>
        <button type="submit" formaction="/newBus.jsp">Add bus</button>
        <button type="submit" formaction="/bus/show">Show buses</button>
    </fieldset>
</form>
</body>
</html>