<%--
  Created by IntelliJ IDEA.
  User: 15621
  Date: 2020/9/8
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie cookie = new Cookie("loginState","true");
    response.addCookie(cookie);
%>
</body>
</html>
