<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="java.util.Timer" %>
<%@ page import="static java.time.LocalDateTime.now" %><%--
  Created by IntelliJ IDEA.
  User: roszk
  Date: 21.07.2019
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello
<%= (StringUtils.isNotBlank(request.getParameter("firstName")))?StringUtils.defaultString(request.getParameter("firstName"), ""):StringUtils.defaultString("Stranger","")%>

</h1>
<p>Current time: <%=now()%></p>
</body>
</html>
