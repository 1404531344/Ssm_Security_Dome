<%--
  Created by IntelliJ IDEA.
  User: fz
  Date: 2023/4/23
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/login">
  账号：<input type="text"  name="username" /><br>
  密码：<input type="password" name="password" /><br>

    <security:csrfInput />
    <input type="checkbox" name="remember-me" value="true" /> 记住我<br>
  <input  type="submit" value="确定"/>

</form>

</body>
</html>
