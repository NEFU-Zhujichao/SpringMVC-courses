<%--
  Created by IntelliJ IDEA.
  User: 13949
  Date: 2020/11/23
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/hello" method="get">
    <input type="text" name="method">
    <button type="submit">提交</button>
</form>
</body>
</html>
