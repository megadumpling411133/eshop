<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>商品清單</title>
</head>
<body>
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
    <s:a action="toAdd">新增商品</s:a> <!-- 若有新增表單頁面，可對應到 add.jsp -->
</body>
</html>
