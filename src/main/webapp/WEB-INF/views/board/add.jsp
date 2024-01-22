<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Personal - Start Bootstrap Theme</title>
<!-- Favicon-->
<!-- 사용전 경로를 꼭 수정하세요-->
<c:import url="../temps/head_css.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<!-- navigator -->
		<!-- 사용전 경로를 꼭 수정하세요-->
		<c:import url="../temps/header.jsp"></c:import>

		<section class="py-5"></section>
		<div class="text-center mb-5">
			<h1 class="display-5 fw-bolder mb-0">
				<span class="text-gradient d-inline">${board}Add</span>
			</h1>
		</div>
		<form action="./add" method="post" enctype="multipart/form-data">
			<div class="mb-3">
				<label for="title" class="form-label">Title</label> <input
					type="text" class="form-control" id="title" name="boardTitle">
			</div>
			<div class="mb-3">
				<label for="Writer" class="form-label">Writer</label> <input
					type="text" class="form-control" id="Writer" name="boardWriter">
			</div>
			<div class="mb-3">
				<label class="form-label" for="Contents">Contents</label> 
				<textarea class="form-control" id="Contents" rows="3" name="boardContents"></textarea>
			</div>

			<div class="mb-3">
				<input class="form-control" type="file" accept="image/*" name="attachs">
				<input class="form-control" multiple="file" name="attachs">
				<input class="form-control" type="file" accept="image/*" name="attachs">
			</div>
			<button type="submit" class="btn btn-primary">추가하기</button>
		</form>
	</main>
	<!--footer-->
	<!-- 사용전 경로를 꼭 수정하세요-->
	<c:import url="../temps/footer.jsp"></c:import>
</body>
</html>
