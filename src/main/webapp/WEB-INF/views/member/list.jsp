<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원 목록</title>
	</head>

	<input type="button" value="회원등록" onclick="location.href='${path}/member/write.do'">
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
		</tr>
		<c:forEach var="row" items="${list}">
		<tr>
			<td>${row.memberId}</td>
			<td>${row.memberName}</td>
		</tr>
		</c:forEach>
	</table>
</html>