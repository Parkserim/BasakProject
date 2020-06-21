<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h2>로그인</h2>
	<form name='homeForm' method="post" action="/member/login">
		<div>
			<label for="memberId"></label><input type="text" id="memberId" name="memberId">
		</div>
		<div>
			<label for="memberPw"></label><input type="password" id="memberPw" name="memberPw">
		</div>
		<div>
			<button type="submit">로그인</button>
			<button type="button">회원가입</button>
		</div>
		<c:if test="${msg == false}">
			<p style="color: red;">로그인 실패! 아이디와 비밀번호 확인해주세요.</p>
		</c:if>
	</form>
</body>
</html>