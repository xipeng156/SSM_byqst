<%--
  Created by IntelliJ IDEA.
  User: 15621
  Date: 2020/9/10
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--取值语句--%>
<c:set value="内蒙古工业大学" var="ngd" scope="request"></c:set>
<c:out value="${ngd}"/>
<c:if test="${not empty ngd}">
    欢迎你，${ngd}
</c:if>


<
</body>
</html>
