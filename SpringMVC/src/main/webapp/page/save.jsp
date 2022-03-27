<%--
  Created by IntelliJ IDEA.
  User: xiangxl
  Date: 2022/3/27
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>保存表单</h1>
<form action="${pageContext.request.contextPath}/useraccount/save" method="post">
    姓名：<input type="text" name="userName"><br>
    金额：<input type="text" name="money"><br>
    <input type="submit" name="提交">
</form>
</body>
</html>
