<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>회원 등록</title>
</head>
<body>
	<form name="form1" method="post" action="${path}/member/insert.do">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input name="memberId"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="memberPw"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input name="memberName"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="확인">
					<input type="reset" vlaue="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>