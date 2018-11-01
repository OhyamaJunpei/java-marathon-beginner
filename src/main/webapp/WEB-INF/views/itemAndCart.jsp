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
<c:forEach var="item" items="${itemList}" varStatus="status">
<form action="/insert/inCart" method="post">
  <c:out value="${item.name}"/> 
  <c:out value="${item.price}"/>円 
  <input type="submit" value="カートへ"><br>
  <input type="hidden" name="index" value="${status.index}">
</form>
</c:forEach>
<hr>

ショッピングカート<br>
<c:forEach var="cartItem" items="${cartList}" varStatus="status">
<form action="/delete/outCart" method="post">
  <c:out value="${cartItem.name}"/> 
  <c:out value="${cartItem.price}"/>円 
  <input type="submit" value="削除"><br>
  <input type="hidden" name="index" value="${status.index}">
</form>
</c:forEach>

<hr>

合計<c:out value="${total}"/>円
</body>
</html>