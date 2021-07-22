<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<c:set var="path" value="${pageContext.request.contextPath }"/>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2weeks</title>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="${path }/resources/js/jquery-3.6.0.min.js"></script>
</head>
<body>

<div id="container">
	<header>
		<div id="search"  style="display:inline-block;">
			<input type="text"/> 검색
		</div>
		<div id="darkmode"  style="display:inline-block;">
			<a href="">다크모드</a>
		</div>
		<div id="multiLanguage"  style="display:inline-block;">
			<a href="">다국어</a>
		</div>
		<div id="profile"  style="display:inline-block;">
			<a href="">프로필 사진</a>
		</div>
	</header>
</div>
