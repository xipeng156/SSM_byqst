<%@ page import="com.qst.entity.Users" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: 15621
  Date: 2020/9/8
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<%
    Users users = (Users) request.getAttribute("users");
    System.out.println(users.toString());
    PrintWriter writer = response.getWriter();
    writer.print(users.toString());
%>

hello success
</body>
</html>
