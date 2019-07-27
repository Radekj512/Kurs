<%--
  Created by IntelliJ IDEA.
  User: roszk
  Date: 27.07.2019
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="exampleString" value="This is example text"/>
<h3>Example text contains 'text':
    ${fn:contains(exampleString, "text")}
</h3>
</body>
</html>
