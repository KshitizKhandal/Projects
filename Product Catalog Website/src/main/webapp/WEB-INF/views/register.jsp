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
<title>Register</title>
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
  background-image: url("https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp");

  min-height: 750px;

 
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  }


}
</style>
</head>
<body>
<div class="bg-img">
	 <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#"> <a class="navbar-brand"
                href="#">Camera World </a> <i class="fab fa-github fa-2x mx-3 ps-1"></i>
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
                        aria-current="page" href='<c:url value="/"></c:url>'>Register</a>
                    </li>
                </ul>
           </div>
    </nav>
	
		
			<div class=" text-center " style=" font-size: 30px;">Registration</div>
			<c:if test="${success != null}">
				<div style="color: green; font-size: 20px;" role="alert">
					<c:out value="${success}" />
				</div>
			</c:if>
			
				<f:form action="register" modelAttribute="employee" method="post"
					onSubmit="return checkPassword(this)">
					
						<div
							class="mask d-flex align-items-center h-100 gradient-custom-3">
							<div class="container h-100">
								<div
									class="row d-flex justify-content-center align-items-center h-100">
									<div class="col-12 col-md-9 col-lg-7 col-xl-6">
										<div class="card" style="border-radius: 15px;">
											<div class="card-body p-5">
												<h2 class="text-uppercase text-center mb-5">Create an
													account</h2>
												<div class="form-outline mb-4">
													<f:input type="text" path="firstname" class="form-control"
														id="exampleInputEmail1" aria-describedby="emailHelp"
														required="true" />
													<label class="form-label" for="form3Example1cg">Your
														first Name</label>
												</div>
												<div class="form-outline mb-4">
													<f:input type="text" path="lastname" class="form-control"
														id="exampleInputEmail1" aria-describedby="emailHelp"
														required="true" />
													<label class="form-label" for="form3Example1cg">Your
														last Name</label>
												</div>
												<div class="form-outline mb-4">
													<f:input type="text" path="userName" class="form-control"
														id="exampleInputEmail1" aria-describedby="emailHelp"
														required="true" />
													<label class="form-label" for="form3Example1cg">Your
														UserName</label>
												</div>
												<div class="form-outline mb-4">
													<f:input type="text" path="email" class="form-control"
														id="exampleInputEmail1" aria-describedby="emailHelp"
														required="true" />
													<label class="form-label" for="form3Example1cg">Your
														email</label>
												</div>
												<div class="form-outline mb-4">
													<f:input type="password" path="Password"
														class="form-control" id="exampleInputPassword1"
														required="true" value="" />
													<label class="form-label" for="form3Example3cg">Your
														Password</label>
												</div>
												<div class="form-outline mb-4">
													<f:input type="password" path="confirmPassword"
														class="form-control" id="exampleInputPassword1"
														required="true" value="" />
													<label class="form-label" for="form3Example3cg">Confirm
														Password</label>
												</div>
												<div class="form-check d-flex justify-content-center mb-5">
													<input class="form-check-input me-2" type="checkbox"
														value="" id="form2Example3cg" /> <label
														class="form-check-label" for="form2Example3g"> I
														agree all statements in <a href="#!" class="text-body"><u>Terms
																of service</u></a>
													</label>
												</div>
												<script>
													// Function to check Whether both passwords
													// is same or not.
													function checkPassword(form) {
														password1 = form.password.value;
														password2 = form.confirmPassword.value;

														// If password not entered
														if (password1.length <= 8) {
															alert("Please enter Password with length equal 8");
															return false;
														}

														// If confirm password not entered
														else if (password2 == '')
															alert("Please enter confirm password");

														// If Not same return False.    
														else if (password1 != password2) {
															alert("\nPassword did not match: Please try again...")
															return false;
														}

														// If same return True.
														else {
															alert("Password Match: Welcome to Car Duniya!")
															return true;
														}
													}
												</script>
												<center class="text-center text-muted mt-5 mb-0">
													<a href="#!" class="fw-bold text-body"></a>
													<button type="submit" class="btn btn-primary">Register</button>
												</center>

											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
				</f:form>
			
		
	</div>

</body>
</html>