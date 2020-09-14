<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: 15621
  Date: 2020/9/11
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String userCount = application.getAttribute("userCount").toString();
    Integer i = Integer.parseInt(userCount)+1;
    application.setAttribute("userCount",i);
%>

您已访问了${applicationScope.userCount}次
<a href="success.jsp">return</a>
</ul>
</body>
</html>
