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

<form action="/insert/inCart" method="post">

商品一覧<br>
<c:forEach var="item" items="${itemList}">
  <c:out value="${item.name}"/> 
  <c:out value="${item.price}"/>円 
  <input type="submit" value="カートへ"><br>
</c:forEach>

<hr>

ショッピングカート<br>


</form>
</body>
</html>