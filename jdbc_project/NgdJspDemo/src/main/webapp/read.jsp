<%--
  Created by IntelliJ IDEA.
  User: 15621
  Date: 2020/9/8
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>read</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    for (int i = 0; i < cookies.length; i++) {
        %>
<%=cookies[i].getName()%>:<%=cookies[i].getValue()%>
<%
    }
%>
</body>
</html>
