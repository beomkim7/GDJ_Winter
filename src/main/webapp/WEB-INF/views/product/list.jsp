<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Personal - Start Bootstrap Theme</title>
    <!-- 사용전 경로를 꼭 수정 하세요 -->
	<c:import url="../temps/head_css.jsp"></c:import>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <!-- 사용전 경로를 꼭 수정 하세요 -->
			<c:import url="../temps/header.jsp"></c:import>
			
			<div class="container px-5 my-5">
	        	<div class="text-center mb-5">
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">Product List</span></h1>
                </div>
                
        <table class="table table-hover">
			<thead>
				<tr>
					<th>ID</th><th>NAME</th>
				</tr>
			</thead>
			<!-- for(int i=0;i<;i++) -->
			<!-- for(타입명 변수명:배열명) -->
			<c:forEach items="${requestScope.list}" var="dto">
				<tr>
					<td>${pageScope.dto.productnum}</td>
					<td>>${pageScope.dto.productname}</a></td>
					
				</tr>
			</c:forEach>
	
	
			<tbody>
				
			</tbody>
				
		</table>
			
			<div>
				<nav aria-label="Page navigation example">
				  <ul class="pagination">
				  	<c:if test="${!pager.start}">
				    <li class="page-item">
				      <a class="page-link" href="./list?page=${pager.startNum-1}&search=${pager.search}&kind=${pager.kind}" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
				    </c:if>
				    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				    <li class="page-item"><a class="page-link" href="./list?page=${i}&search=${pager.search}&kind=${pager.kind}">${i}</a></li>
				    </c:forEach>
				   
				   <c:if test="${!pager.last}"> 
				    <li class="page-item">
				      <a class="page-link" href="./list?page=${pager.lastNum+1}&search=${pager.search}&kind=${pager.kind}" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				    </li>
				    </c:if>
				  </ul>
				</nav>
			</div>
                
                <div>
                	<a href="add" class="btn btn-danger">상품등록</a>
                </div>		
			</div>
			
		
			
        </main>
        <!-- Footer-->
        <!-- 사용전 경로를 꼭 수정 하세요 -->
        <c:import url="../temps/footer.jsp"></c:import>

    </body>
</html>
    