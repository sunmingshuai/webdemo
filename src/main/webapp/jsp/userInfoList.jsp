<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>用户列表</title>
    <%--<link rel="stylesheet" href="/webjars/jquery/3.2.1/dist/jquery.min.js">--%>
</head>
<script src='/resources/js/jquery-2.1.4.js'></script>
<body>

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

<button id="btn" name="发请求" value="发请求">发请求</button>
<div id="result"></div>
<script type="text/javascript">
    $("#btn").click(function () {
        $.ajax("", {
            success: function (data) {
                $("#result").html(data.user.desc);
                //$("#result").text(data.user.desc);
            }
        })
    });
</script>

</body>
</html>
