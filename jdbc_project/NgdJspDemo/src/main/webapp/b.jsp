<%--
  Created by IntelliJ IDEA.
  User: 15621
  Date: 2020/9/12
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>b</title>
</head>
<body>
<%
    String userCount = application.getAttribute("userCount").toString();
    Integer i = Integer.parseInt(userCount)+1;
    application.setAttribute("userCount",i);
%>
</body>
</html>
