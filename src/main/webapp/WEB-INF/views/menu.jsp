<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<div class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="/">BASAK</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
	    	<ul class="navbar-nav mr-auto">
	   			<li class="nav-item active">
	    			<a class="nav-link" href="/snack">검색 <span class="sr-only">(current)</span></a>
	    		</li>
	    		<li class="nav-item active">
	    			<a class="nav-link" href="chart">차트</a>
	    		</li>
	    	</ul>
	    	
	    	<c:if test="${member == null}">
	    		<button class="btn btn-outline-success" onclick="location.href='/member/write.do'">회원 가입</button>
			    <button class="btn btn-outline-dark" onclick="location.href='/member/login.do'">로그인</button>			
	    	</c:if>
	    	<c:if test="${member != null}">
		    	${member.memberName}님이 로그인중입니다.
		   		<button class="btn btn-outline-dark" onclick="location.href='member/logout.do'">로그아웃</button>			
		    </c:if>
		</div>
	</nav>
</div>