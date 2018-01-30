<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>

<input id="userId" value="1">

<c:if test="${user != null}">
    用户名:${user.userName} 邮箱地址:${user.email}
</c:if>

<c:if test="${not empty userInfoList}">
    <ul>
        <c:forEach items="${userInfoList}" var="userInfo">
            <li>用户名:${userInfo.userName} 邮箱地址:${userInfo.email}</li>
        </c:forEach>
    </ul>
</c:if>

<input type="button" id="getUser" name="用户请求">

<script>
    var userId = $("#userId").val();
    alert(userId);
</script>
</body>
</html>
