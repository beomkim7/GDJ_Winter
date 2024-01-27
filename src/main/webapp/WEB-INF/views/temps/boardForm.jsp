<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
		<div class="row gx-5 justify-content-center">
			<div class="col-lg-11 col-xl-9 col-xxl-8">
				<form method="post" enctype="multipart/form-data">
					<input type="hidden" name="boardNum" value="${boardDTO.boardNum}">
					<div class="mb-3">
						<label for="title" class="form-label">Title</label> 
						<input type="text" class="form-control" id="title" name="boardTitle" value="${boardDTO.boardTitle}">
					</div>
					<div class="mb-3">
						<label for="Writer" class="form-label">Writer</label>
					 	<input type="text" class="form-control" id="Writer" name="boardWriter" value="${boardDTO.boardWriter}">
					</div>
					<div class="mb-3">
						<label class="form-label" for="Contents">Contents</label> 
						<textarea class="form-control" id="Contents" rows="3" name="boardContents">${boardDTO.boardContents}</textarea>
					</div>
		
					<div class="mb-3">
						<input class="form-control" type="file" name="attachs">
						<input class="form-control" type="file" name="attachs">
						<input class="form-control" type="file" name="attachs">
		
					</div>
					<button class="btn btn-primary">추가하기</button>
				</form>
			</div>
		</div>