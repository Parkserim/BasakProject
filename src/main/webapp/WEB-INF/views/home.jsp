<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!doctype html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" >
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>BASAK</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<br>	   	
	<div class="container-md">
		<div id="carouselExampleSlidesOnly" class="carousel slide"
			data-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="<c:url value='/resources/img/main.jpg'/>" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="<c:url value='/resources/img/main2.jpg'/>" class="d-block w-100" alt="...">
				</div>
			</div>
		</div>
	</div>
	<br><br>
	<c:if test="${member != null}">
	<div class="container-sm">
		<form method="post" action="/recommend/write.do">
			<div class="form-group">
				<label>추천하기</label> 
				<input class="form-control" name="comment" aria-describedby="recom"> 
				<small id="recom" class="form-text text-muted">여러분의 의견을 자유롭게 남겨주세요.</small>
			</div>
			<button type="submit" class="btn btn-success">저장</button>
		</form>
	</div>
	<br>
	</c:if>
	<div class="container-sm">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>아이디</th>
					<th>내용</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="recommend" items="${recommendid}">
				<tr>
					<th scope="row">${recommend.memberId}</th>
					<td>${recommend.comment}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
