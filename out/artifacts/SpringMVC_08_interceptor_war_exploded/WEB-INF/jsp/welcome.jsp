<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎你管理员</h1>
${user}
<a href="${pageContext.request.contextPath}/logout">退出登录</a>
</body>
</html>
