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

<table>
	<tr>
		<td>名前：</td>
		<td><c:out value="${name }"/></td>
	</tr>
	<tr>
		<td>年齢：</td>
		<td><c:out value="${age }"/>歳</td>
	</tr>
	<tr>
		<td>住所：</td>
		<td><c:out value="${address }"/></td>
	</tr>

</table>
</body>
</html>