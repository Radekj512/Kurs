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

<c:set var="yourSalary" scope="application" value="20000" />
<h3>Your salary: ${yourSalary}</h3><br/>

<c:remove var="yourSalary" scope="application"/>
<h3>Salary after remove ${yourSalary}</h3><br/><br/>
<c:set var="salary" scope="application" value="${20000}"/>
<c:set var="avgSalary" scope="application" value="${5100}"/>

<c:if test="${salary != avgSalary}">
    <h3>Your salary is different than average</h3>
</c:if>

<c:choose>
    <c:when test="${salary < avgSalary}">
        <h3>Your salary is lower than average</h3>
    </c:when>
    <c:when test="${salary == avgSalary}">
        <h3>Your salary is equal to average</h3>
    </c:when>
    <c:when test="${salary > avgSalary}">
        <h3>Your salary is higher than average</h3>
    </c:when>
</c:choose>
</body>
</html>
