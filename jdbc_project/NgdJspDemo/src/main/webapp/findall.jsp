<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: 15621
  Date: 2020/9/11
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String lists = (String)request.getAttribute("lists");
    PrintWriter writer = response.getWriter();
    writer.print(lists);
%>

</body>
</html>
