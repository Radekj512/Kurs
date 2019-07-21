<%--
  Created by IntelliJ IDEA.
  User: roszk
  Date: 21.07.2019
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Get form</h1>
<form action="process-example-form" method="get">
    First Name: <input type="text" name="fn" /><br />
    Last Name: <input type="text" name="ln" /><br />
    Gender: <select name="gen">
    <option value="m">Male</option>
    <option value="f">Female</option>
</select>
    <input type="submit" value="Send by Get">
</form>

<br /><br />
<h1>Post form</h1>
<form action="process-example-form" method="post">
    First Name: <input type="text" name="fn" /><br />
    Last Name: <input type="text" name="ln" /><br />
    Gender: <select name="gen">
    <option value="m">Male</option>
    <option value="f">Female</option>
</select>
    <input type="submit" value="Send by Post">
</form>
</body>
</html>
