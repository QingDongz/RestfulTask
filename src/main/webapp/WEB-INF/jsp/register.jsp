<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: summerwaves
  Date: 2017/9/18
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form  action="${ctx}/users" method="post">
    用户名<input type="text" name="username" />
    <br/>
    密码<input type="password" name="password"/>
    <br/>
    性别:  男<input type="radio" checked="checked" name="sex" value="M"/>
    女<input type="radio" name="sex"  value="F" /><br>
    <input type="submit" name="注册" value="注册">
</form>
</body>
</html>
