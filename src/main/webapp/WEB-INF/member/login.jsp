<%@ page import="com.example.pojo.entity.User" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    // 若使用者已登入，轉到首頁
    User user = (User) session.getAttribute("user");
    if (user != null && !"".equals(user.getLoginId())) {
        response.sendRedirect("ProductList.action"); // ✅ 登入後跳轉商品列表
        return;
    }
%>

<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <title>用戶登入</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>

<h3>測試帳號登入：david123@.com</h3>

<!-- ✅ 登入表單 -->
<form id="loginForm" action="<s:url action='login' />" method="post">
    <div style="margin: 50px;">
        <table>
            <!-- ✅ 錯誤訊息顯示 -->
            <c:if test="${not empty msg}">
                <tr>
                    <td colspan="2" style="color: red; text-align: center;">
                            ${msg}
                    </td>
                </tr>
                <c:remove var="msg" scope="session" /> <!-- ✅ 清除錯誤訊息避免刷新重出現 -->
            </c:if>

            <tr>
                <td>使用者名稱 (loginId)：</td>
                <td><input type="text" name="loginId" value="${loginId}" required /></td>
            </tr>
            <tr>
                <td>密碼 (password)：</td>
                <td><input type="password" name="password" required /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <br/>
                    <button type="button" onclick="validateAndSubmit()">登入</button>
                    &nbsp;
                    <s:url action="register" var="registerUrl" />
                    <a href="${registerUrl}">註冊</a>
                </td>
            </tr>
        </table>
    </div>
</form>

<script>
    function validateAndSubmit() {
        let loginId = $("input[name='loginId']").val().trim();
        let password = $("input[name='password']").val().trim();

        if (!loginId) {
            alert("使用者名稱不能為空");
            return;
        }

        if (!password) {
            alert("密碼不能為空");
            return;
        }

        $("#loginForm").submit();
    }
</script>

</body>
</html>
