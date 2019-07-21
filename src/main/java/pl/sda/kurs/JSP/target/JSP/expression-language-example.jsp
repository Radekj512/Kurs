
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Expression language example</h1>
<h1>Hello ${param.get("firstName")}</h1>
<h2>2 + 2 = ${2+2}</h2>
<h3>${8 > 6 ? "Bigger" : "Smaller"}</h3>
</body>
</html>
