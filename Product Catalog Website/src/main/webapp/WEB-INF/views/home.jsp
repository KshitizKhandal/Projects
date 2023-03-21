

<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.nitish.dao.ProductDaoImpl"%>
<%@page import="com.nitish.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.nitish.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
	
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
	integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp"
	crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Welcome</title>

</head>
<body>
	<%
		ProductDaoImpl pp = new ProductDaoImpl();
		List<Product> prod =pp.getAllProducts();
		System.out.println("This is list:"+prod);
		
		%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">  Tinder</a> <i class="fab fa-github fa-2x mx-3 ps-1"></i>
			
			<button class="navbar-toggler" type="button"
				data-mdb-toggle="collapse" data-mdb-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<i class="fas fa-bars"></i>
			</button>
		

			<ul class="navbar-nav ml-auto ">
				<li class="nav-item"><a class="nav-link  active"
					aria-current="page" href='<c:url value="/login"></c:url>'>Logout</a>
				</li>

			</ul>
			<f:form action="home/search/${productId}" modelAttribute="product" method="get" >
				<div class="form-group">
					<input type="text" name="productId" th:value="${productId}" 
						placeholder="Find by Product Name & Brand" size="50">
							
					<button type="submit" class="btn btn-info">Search</button>
				</div>
				
												
			</f:form>
			


		</div>
	</nav>
	<br />
	<div class="text-center">
		<h1>
			Welcome
			<c:out value="${employee.firstname}"></c:out>
			In Car Duniya
		</h1>
	</div>
		
	<div class="container">
		<div class="row">
	
			<div class="col-lg-3 mb-4">
				<div class="card" style="width: 16rem;">
				<img class="card-img-top" src="https://assets.myntassets.com/dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/1376577/2022/6/3/ea10ab6c-883e-437a-8780-ed87484393f81654235830793-Roadster-Men-Black--Grey-Checked-Casual-Sustainable-Shirt-42-1.webp" alt=""  height="250">

					<div class="card-body">
						<h5 class="card-title">Men;s shirt</h5>
						<p class="card-text">soft and flexible shirt</p>
	<f:form action="" modelAttribute="product">
				<div class="form-group">
					<input type="text" name="pincode" 
						placeholder="Enter Pincode" size="10">
							<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#pincode-model">
  Launch demo modal
</button>
				</div>
				
												
			</f:form>
			
						
					</div>
			</div>
			</div>
			
			</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-3 mb-4">
				<div class="card" style="width: 16rem;">
					<img class="card-img-top" src="https://assets.myntassets.com/dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/1376577/2022/6/3/ea10ab6c-883e-437a-8780-ed87484393f81654235830793-Roadster-Men-Black--Grey-Checked-Casual-Sustainable-Shirt-42-1.webp" alt="" height="250" >
					

					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>

						<a href="#" class="btn btn-outline-primary btn-sm"> Card link
						</a> <a href="#" class="btn btn-outline-secondary btn-sm"> <i
							class="far fa-heart"></i></a>
					</div>
				</div>
			</div>
			<div class="col-lg-6 mb-4">
				<div class="card">
					<img class="card-img-top" src="" alt="">

					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>

						<a href="#" class="btn btn-outline-primary btn-sm"> Card link
						</a> <a href="#" class="btn btn-outline-secondary btn-sm"> <i
							class="far fa-heart"></i></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-6 mb-4">
				<div class="card">
					<img class="card-img-top" src="" alt="">

					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>

						<a href="#" class="btn btn-outline-primary btn-sm"> Card link
						</a> <a href="#" class="btn btn-outline-secondary btn-sm"> <i
							class="far fa-heart"></i></a>
					</div>
				</div>
			</div>
			<div class="col-lg-6 mb-4">
				<div class="card">
					<img class="card-img-top" src="" alt="">

					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>

						<a href="#" class="btn btn-outline-primary btn-sm"> Card link
						</a> <a href="#" class="btn btn-outline-secondary btn-sm"> <i
							class="far fa-heart"></i></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-6 mb-4">
				<div class="card">
					<img class="card-img-top" src="" alt="">

					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>

						<a href="#" class="btn btn-outline-primary btn-sm"> Card link
						</a> <a href="#" class="btn btn-outline-secondary btn-sm"> <i
							class="far fa-heart"></i></a>
					</div>
				</div>
			</div>
			<div class="col-lg-6 mb-4">
				<div class="card">
					<img class="card-img-top" src="" alt="">

					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>

						<a href="#" class="btn btn-outline-primary btn-sm"> Card link
						</a> <a href="#" class="btn btn-outline-secondary btn-sm"> <i
							class="far fa-heart"></i></a>
					</div>
				</div>
			</div>
		</div>
		
	</div>
	<%@ include file="Model.jsp" %>
</body>
</html>