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
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>Snack</title>
</head>
<body>
	<%@ include file="../menu.jsp" %>
	<br>
	<div class="container">
		<div class="card mb-3 " style="max-width: 740px; margin:auto">
			<div class="row no-gutters ">
				<div class="col-md-4 ">
					<img src="<c:url value='/resources/img/${snack.snackIMG}'/>" class="card-img" alt="...">
				</div>
				<div class="col-md-8">
					<div class="card-body">
						<h5 class="card-header">${snack.snackNAME}</h5>
						<br>
						<p class="card-text">제조사 : ${snack.snackCompany}</p>
						<p class="card-text">종류 : ${snack.snackCategory}</p>
						<p class="card-text">열량 : ${snack.snackCal}kcal</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<div class="container-md">
		<c:if test="${member != null}">
			<div class="input-group mb-3">
				<input type="text" class="form-control" placeholder="작성자" aria-label="작성자" aria-describedby="button-addon2"> 
				<input type="text" class="form-control" placeholder="한줄평" aria-label="한줄평" aria-describedby="button-addon2">
				<div class="input-group-append">
					<button class="btn btn-outline-secondary" type="button" id="button-addon2">저장</button>
				</div>
			</div>	
		</c:if>
			<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>작성자</th>
					<th>별점</th>
					<th>리뷰</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Mark</td>
					<td>Otto</td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>Jacob</td>
					<td>Thornton</td>
				</tr>
					<tr>
					<th scope="row">3</th>
					<td>Jacob</td>
					<td>Thornton</td>
				</tr>
			</tbody>
		</table>
	<br>
	<div class="d-flex justify-content-around ">
		<nav aria-label="Page navigation example">
			<ul class="pagination">
				<li class="page-item "><a class="page-link" href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span></a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
			</ul>
		</nav>
	</div>
	</div>
</body>
</html>
