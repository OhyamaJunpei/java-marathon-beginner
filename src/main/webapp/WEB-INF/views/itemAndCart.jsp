<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


商品一覧<br>
<form action="/insert/inCart" method="post">
<c:forEach var="item" items="${itemList}">
  <c:out value="${item.name}"/> 
  <c:out value="${item.price}"/>円 
  <input type="submit" value="カートへ"><br>
</c:forEach>
</form>
<hr>

ショッピングカート<br>
<form action="/delete/inCart" method="post">
<c:forEach var="cartItem" items="${cartList}">
  <c:out value="${cartItem.name}"/> 
  <c:out value="${cattItem.price}"/>円 
  <input type="submit" value="削除"><br>
</c:forEach>
</form>

<hr>

合計<c:out value="${total}"/>円
</body>
</html>