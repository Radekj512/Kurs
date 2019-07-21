<%--
  Created by IntelliJ IDEA.
  User: roszk
  Date: 21.07.2019
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${student}" var="s">
<b>ID: </b>${s.id}<br />
<b>First name: </b>${s.firstName}<br />
<b>Last Name: </b>${s.lastName}<br />
<br />
</c:forEach>
</body>
</html>
