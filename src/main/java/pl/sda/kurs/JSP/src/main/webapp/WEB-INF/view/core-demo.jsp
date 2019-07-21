<%--
  Created by IntelliJ IDEA.
  User: roszk
  Date: 21.07.2019
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Name without default: <c:out value="${name}"/></h3><br />
<h3>Name with default: <c:out value="${name2}" default="Tomek"/> </h3>

<c:forEach items="${countries}" var="county">
    <c:out value="${county}"/><br/>
</c:forEach>
</body>
</html>
