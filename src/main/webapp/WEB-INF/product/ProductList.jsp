<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="com.example.pojo.entity.User" %>

<%
    // 嘗試取得 session 中的 user
    User loginUser = (User) session.getAttribute("user");
%>

<html>
<head>
    <title>商品清單</title>
    <style>
        .top-right {
            position: absolute;
            top: 20px;
            right: 20px;
            display: flex;
            align-items: center;
            gap: 10px;
        }
        .login-btn {
            padding: 6px 12px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        .login-btn:hover {
            background-color: #45a049;
        }
        .user-info {
            font-weight: bold;
            color: #333;
        }
    </style>
</head>
<body>

<!-- ✅ 右上角登入狀態 -->
<div class="top-right">
    <%
        if (loginUser != null && loginUser.getLoginId() != null) {
    %>
    <div class="user-info">歡迎，<%= loginUser.getUser_name() %>！</div>
    <s:a action="logout" cssClass="login-btn">登出</s:a>
    <%
    } else {
    %>
    <s:a action="login" cssClass="login-btn">登入</s:a>
    <%
        }
    %>
</div>

<h2>商品清單</h2>

<s:if test="productList != null && !productList.isEmpty()">
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>商品名稱</th>
            <th>價格</th>
            <th>庫存</th>
            <th>分類</th>
            <th>操作</th>
        </tr>
        <s:iterator value="productList">
            <tr>
                <td><s:property value="prod_name" /></td>
                <td><s:property value="prod_price" /></td>
                <td><s:property value="prod_stock" /></td>
                <td><s:property value="prod_category" /></td>
                <td>
                    <s:a action="findById">
                        <s:param name="product.prod_id" value="%{prod_id}" />
                        編輯
                    </s:a>
                    |
                    <s:a action="delete">
                        <s:param name="product.prod_id" value="%{prod_id}" />
                        刪除
                    </s:a>
                </td>
            </tr>
        </s:iterator>
    </table>
</s:if>

<s:else>
    <p>目前沒有商品資料。</p>
</s:else>

<br/>
<s:a action="toAdd">新增商品</s:a>
</body>
</html>
