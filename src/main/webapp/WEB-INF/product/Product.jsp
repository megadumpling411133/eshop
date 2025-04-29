<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>商品查詢</title>
</head>
<body>
    <h2>商品查詢畫面</h2>

    <s:form action="list" method="post">
        商品名稱：<s:textfield name="prod_name" />
        類別：<s:textfield name="prod_category" />
        <s:submit value="查詢" />
    </s:form>

    <hr/>

    <s:if test="productList != null">
        <table border="1">
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
                        <s:a action="findById?prod_id=%{prod_id}">編輯</s:a>
                        |
                        <s:a action="delete?prod_id=%{prod_id}">刪除</s:a>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </s:if>
</body>
</html>

<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>商品查詢</title>
</head>
<body>
    <h2>商品查詢畫面</h2>
  <!-- <s:> 這是 struts 標籤語法 </s> -->
    <!-- <s:form action="product-query" method="post"> -->
    <s:form action="findAll" method="post">
        商品名稱：<s:textfield name="prod_name" />
        類別：<s:textfield name="prod_category" />
        <s:submit value="查詢" />
    </s:form>

    <hr/>

    <s:if test="productList != null">
        <table border="1">
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
                        <!--<s:a action="product-edit?prod_id=%{prod_id}">編輯</s:a>
                        |
                        <s:a action="product-delete?prod_id=%{prod_id}">刪除</s:a>-->
                        <s:a action="findById?prod_id=%{prod_id}">編輯</s:a>
                        |
                        <s:a action="delete?prod_id=%{prod_id}">刪除</s:a>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </s:if>
</body>
</html>
 --%>