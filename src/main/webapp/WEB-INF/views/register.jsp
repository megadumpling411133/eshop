<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>使用者註冊</title>
</head>
<body>

<h2>使用者註冊表單</h2>

<!-- 顯示錯誤訊息 -->
<s:if test="hasActionErrors()">
    <div style="color:red;">
        <s:actionerror />
    </div>
</s:if>

<!-- 請勿使用 HTML 註解包住 struts 標籤，會導致 Jasper 誤判 -->
<%-- 使用者註冊表單開始 --%>
<s:form action="register/save" method="post">
    <s:textfield id="user_id" name="user.user_id" label="使用者ID (user_id)" />
    <s:textfield id="user_name" name="user.user_name" label="使用者名稱 (user_name)" />
    <s:textfield id="loginId" name="user.loginId" label="登入帳號 (loginId)" />
    <s:password id="password" name="user.password" label="密碼 (password)" />
    <s:textfield id="tel" name="user.tel" label="電話 (tel)" />
    <s:textfield id="createDate" name="user.createDate" label="註冊日期 (createDate)" />
    <s:submit value="註冊456" />
</s:form>
<%-- 使用者註冊表單結束 --%>
<script src="${pageContext.request.contextPath}/public/script.js"></script>
</body>
</html>
