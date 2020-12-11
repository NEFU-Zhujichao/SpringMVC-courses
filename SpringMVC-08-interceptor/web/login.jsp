<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名: <input type="text" name="username"><br>
    密码: <input type="password" name="pwd">
    <button type="submit">提交</button>
</form>
</body>
</html>
