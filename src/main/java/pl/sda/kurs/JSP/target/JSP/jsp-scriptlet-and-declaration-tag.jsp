<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello</h2>
<%
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String age = request.getParameter("age");
    if (StringUtils.isNotBlank(firstName)||StringUtils.isNotBlank(lastName)){
        out.print(firstName + " " + lastName);
    }else{
        out.write("Stranger");
    }
    if (StringUtils.isNotBlank(age)&&(Integer.parseInt(age) > 18 )){
        out.write("<br /> <span style= color:green>Access granted</span>");
    }else{
        out.write("<br /><span style= color:red>Access denied</span>");
    }
%>
</body>
</html>
