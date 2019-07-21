
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/search-by-id" method="post">
    Enter student ID: <input type="text" name="studentId" />
    <input type="submit" value="Search" />
</form><br /><br /><br />

<form action="${pageContext.request.contextPath}/search-by-name" method="post">
    Enter student name: <input type="text" name="studentName" />
    <input type="submit" value="Search" />
</form>
</body>
</html>
