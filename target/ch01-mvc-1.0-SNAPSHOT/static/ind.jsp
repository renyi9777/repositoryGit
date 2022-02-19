<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="static/js/jquery-3.4.1.js"></script>
    <base href="<%=basePath%>">
</head>
<body>
<div align="center">
<p>登录页面</p>
    <a href="getLogin">点击登录</a>
    <a href="lostLogin">点击退出</a>
</div>

<script type="text/javascript">
</script>
</body>
</html>
