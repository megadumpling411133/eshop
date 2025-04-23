<%@ page import="com.example.pojo.entity.User" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%
    // 獲取當前會話中的用戶物件
    User user = (User) session.getAttribute("user");

    // 如果用戶已登入，則重新導向到首頁
    if (user != null && !"".equals(user.getLoginId())) {
        response.sendRedirect("home/index");
    }
%>

<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>用戶登入</title>
    <script src="public/jquery-3.4.1.min.js"></script>
</head>
<body>
    <!-- <form id="loginForm" action="login/login" method="post"> --> <!-- 多重 namespace 錯誤  /eshop/login/login/login-->
    <form id="loginForm" action="<s:url action='login' namespace='/login' />" method="post">
    
        <div style="margin: 50px;">
            <table>
                <!-- 顯示錯誤訊息 -->
                <c:if test="${not empty msg}">
                    <tr>
                        <td colspan="2" align="center" style="color: red;">
                            <c:out value="${msg}" />
                        </td>
                    </tr>
                </c:if>
                <tr>
                    <td>使用者名稱(loginId)：</td>
                    <td>
                        <input type="text" name="loginId" value='<c:out value="${loginId}"/>' required>
                    </td>
                </tr>
                <tr>
                    <td>密碼(password)：</td>
                    <td>
                        <input type="password" name="password" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <br />
                        <button type="button" onclick="validateAndSubmit()">登入</button>
                        <!-- 
                        		原本的 <a> href="register/register" 
                        		第一個 register 是 Struts 		<package> 的屬性 namespace="/register" 這會讓所有的 action URL 前綴會是 /register/ 開始
                        		第二個 register 是 action 名稱		<action>  的屬性 name="register"
                         -->
                        <!-- &nbsp;<a href="register/register" style="text-decoration: none;">註冊</a> -->
                        <!-- &nbsp;<a href="register.jsp" style="text-decoration: none;">註冊</a> -->
                        <!-- &nbsp;<a href="${pageContext.request.contextPath}/register/register.action" style="text-decoration: none;">註冊321</a><!-- 成功跳轉 --> 
                    	<s:url action="register" namespace="/register" var="registerUrl" />
						<a href="${registerUrl}">註冊</a>
						
                    	
                    </td>
                </tr>
            </table>
        </div>
    </form>

    <script type="text/javascript">
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
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</body>
</html>
