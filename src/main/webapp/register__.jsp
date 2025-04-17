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
<s:form action="register" method="post">
    <s:textfield name="user.user_id" label="使用者ID" />
    <s:textfield name="user.user_name" label="使用者名稱" />
    <s:textfield name="user.login_id" label="登入帳號" />
    <s:password name="user.password" label="密碼" />
    <s:textfield name="user.tel" label="電話" />
    <s:submit value="註冊123" />
</s:form>
<%-- 使用者註冊表單結束 --%>

</body>
</html>
