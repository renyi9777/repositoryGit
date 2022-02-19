<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="<%=basePath%>static/js/jquery-3.4.1.js"></script>
    <base href="<%=basePath%>">
</head>
<body>
${msg}
<script type="text/javascript">
</script>
</body>
</html>
