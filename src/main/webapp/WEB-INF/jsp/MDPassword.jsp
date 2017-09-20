<%--
  Created by IntelliJ IDEA.
  User: summerwaves
  Date: 2017/9/18
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/users/${user.username}" method="post">
    <input type="hidden" name="_method" value="PUT">
    用户名<input type="text" name="username" value="${user.username}" readonly="readonly"></br>
    密码<input type="text" name="password" value="${user.password}"></br>
    <input type="submit" value="修改密码">
</form>
</body>
</html>
