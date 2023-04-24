<%--
  Created by IntelliJ IDEA.
  User: fz
  Date: 2023/4/23
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎 home</h1>
<%--用户名称--%>
<security:authentication property="principal.username"/>

<%--标签权限--%>
<security:authorize access="hasAnyRole('ROLE_USER')">
<a href="#">用户查询</a>><br>
</security:authorize>

<security:authorize access="hasAnyRole('ROLE_USER')">
<a href="#">用户修改</a>><br>
</security:authorize>

<security:authorize access="hasAnyRole('ROLE_USER')">
<a href="#">用户增加</a>><br>
</security:authorize>

<security:authorize access="hasAnyRole('ROLE_ADMIN')">
<a href="#">用户删除</a>><br>
</security:authorize>

<%--标签权限--%>
</body>
</html>
