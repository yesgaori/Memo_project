<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메모 보기</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/static/css/style.css" type="text/css">
</head>
<body>

	<div id="wrap">
		<c:import url="/WEB-INF/jsp/include/header.jsp" />	
		<section class="contents d-flex justify-content-center align-items-center">
			<div class="input-box">
				<h1 class="text-center m-3">메모 보기</h1>
				<div class="d-flex justify-content-center align-items-center">
					<h5 class="small col-2">제목 : </h5>
					<input type="text" class="form-control col-10 ml-3" id="titleInput" value="${post.title }">
				</div>
				<div class="d-flex justify-content-center row-7">
					<textarea rows="7" class="col-12 mt-2" id="contentInput">${post.content }</textarea>
				</div>
				<img width="100%" src="${post.imagePath }">
				<div class="d-flex mt-2">
				</div>
				<div class="d-flex justify-content-between mt-2">
					<div class="mb-5">
						<button type="button" class="btn btn-secondary" onclick="location.href='/post/list-view'">목록으로</button>
						<button type="button" class="btn btn-danger">삭제</button>
					</div>
					<button type="button" class="btn btn-secondary mb-5" id="saveBtn">수정</button>
				</div>
			</div>
		</section>
		<c:import url="/WEB-INF/jsp/include/footer.jsp" />
	</div>





	<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script>
</body>
</html>