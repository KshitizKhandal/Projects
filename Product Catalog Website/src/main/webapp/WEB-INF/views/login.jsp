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
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
	integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js"
	integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
	height: 100%;
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

.bg-img {
	/* The image used */
	background-image:
		url("https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp");
	min-height: 750px;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}
</style>
</head>
<body>
<div class="bg-img">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <a class="navbar-brand"
				href="#">Login Page </a> <i class="fab fa-github fa-2x mx-3 ps-1"></i>
			</a>
			<button class="navbar-toggler" type="button"
				data-mdb-toggle="collapse" data-mdb-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link  active"
						aria-current="page" href='<c:url value="/login"></c:url>'>Login</a>
					</li>
					<li class="nav-item"><a class="nav-link  active"
						aria-current="page" href='<c:url value="/home"></c:url>'>Register</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container mt-5 d-flex align-items-center justify-content-center" >
		<div class="card" style="width: 55rem;">
			<div class="card-header text-center bg-light">Login</div>
			<c:if test="${success != null}">
				<div style="color: green; font-size: 20px;" role="alert">
					<c:out value="${success}" />
				</div>
			</c:if>
			<c:if test="${error != null}">
				<div style="color: green; font-size: 20px;" role="alert">
					<c:out value="${error}" />
				</div>
			</c:if>
			<div class="card-body">

				<f:form action="login" modelAttribute="employee" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">UserName</label>
						<f:input type="text" path="userName" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							required="true" />
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label>
						<f:input type="password" path="password" class="form-control"
							id="exampleInputPassword1" required="true" />
					</div>

					<br />
					<center>
						<button type="submit" class="btn btn-primary">Login</button>
					</center>
				</f:form>
			</div>
		</div>
	</div>
	</div>
</body>
</html>



