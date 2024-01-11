
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    
    <!-- css -->
    <c:import url="./temps/bootStrap_css.jsp"></c:import>

</head>
<body>
	<c:import url="./temps/header.jsp"></c:import>
	<h1>Regions List</h1>
	
	<div>
		<form class="row g-3" action="./list">
		  <div class="col-auto">
		  	<select name="kind" class="form-select" aria-label="Default select example">
			  <option class="a" value="kind1">Title</option>
			  <option class="a" value="kind2">Contents</option>
			  <option class="a" value="kind3">Writer</option>
			  <option class="a" value="kind4">Title+Contents+Writer</option>
			</select>
		  </div>		
		
		  <div class="col-auto">
		    <label for="search" class="visually-hidden">Search</label>
		    <input type="text" name="search" class="form-control" id="search">
		  </div>

		  <div class="col-auto">
		    <button type="submit" class="btn btn-primary mb-3">검색</button>
		  </div>
.		</form>
	</div>
</body>
</html>