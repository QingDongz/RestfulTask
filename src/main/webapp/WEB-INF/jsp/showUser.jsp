<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: summerwaves
  Date: 2017/9/18
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
用户名：${user.username} </br>
密码:${user.password} </br>
性别:${user.sex}</br>

<form action="${ctx}/users/modify" method="get">
    <input type="submit" value="修改密码">
</form>

</body>
</html>
