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
<title>Search</title>
</head>
<body>
	<%@ include file="../menu.jsp" %>
	<br><br>
	<div class="container-sm">
		<div class="d-flex justify-content-around">
		    <a href="#" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">종류</a>
			<a href="#" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true" >브랜드</a>
			<a href="#" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true" >별점</a>
		</div>
	</div>
	<br><br><br>
	<div class="container-md">
		<div class="row row-cols-2 row-cols-md-4 ">
		<c:forEach var="snack" items="${snackid}">
			<a href="/snack/info/${snack.snackID}" class="btn btn-link text-muted">
	  			<div class="col mb-4">
	    			<div class="card">
	   					<img src="<c:url value='/resources/img/${snack.snackIMG}'/>" class="card-img-top"  alt="..." width="50" height="150">
	     				<div class="card-body ">
	       					<h5 class="card-title ">${snack.snackNAME}</h5>
	      				</div>
	    			</div>
	  			</div>
	  		</a>
	  	</c:forEach>  
		</div>
	</div>
</body>
</html>
