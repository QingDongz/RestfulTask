<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%--
  Created by IntelliJ IDEA.
  User: summerwaves
  Date: 2017/9/20
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>当前用户</title>
</head>
<body>
<form action="${ctx}/users/register"method="get">
    <input type="submit" value="新增用户">
</form>
<table border="1">
    <th>用户名</th>
    <th>操作</th>
    <c:forEach items="${list}" var="users">
        <tr>
            <td>${users.username}</td>
            <td><form action="${ctx}/users/${users.username}" method="get">
                <input type="submit" value="详细信息">
            </form>
                <form action="${ctx}/users/${users.username}" method="post">
                    <input type="hidden" name="_method" value="DELETE">
                    <input type="submit" value="删除">
                </form></td>
    </c:forEach>
</table>

</body>
</html>
