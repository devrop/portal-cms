<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V1</title>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<spring:url value="/resources/login/image/icons/favicon.ico" var="favIco" />
	<link rel="icon" type="image/png" href ="${favIco}" />
	<!--  <link rel="icon" type="image/png" href="images/icons/favicon.ico"/> -->
<!--===============================================================================================-->
	<spring:url value="/resources/login/vendor/bootstrap/css/bootstrap.min.css" var="bootCss" />
	<link rel="stylesheet" type="text/css" href="${bootCss}" />
	<!--  <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css"> -->
<!--===============================================================================================-->
    <spring:url value="/resources/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css" var="fontCss" />
	<link rel="stylesheet" type="text/css" href="${fontCss}" />
	
	<!--  <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
       -->
<!--===============================================================================================-->
    <spring:url value="/resources/login/vendor/animate/animate.css" var="aniCss" />
	<link rel="stylesheet" type="text/css" href="${aniCss}" />
	<!--  <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
  -->
<!--===============================================================================================--><spring:url value="/resources/login/image/icons/favicon.ico" var="favIco" />
	<spring:url value="/resources/login/vendor/css-hamburgers/hamburgers.min.css" var="hamCss" />
	<link rel="stylesheet" type="text/css" href="${hamCss}" />	
	<!--  <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
    -->
<!--===============================================================================================-->
<spring:url value="/resources/login/vendor/select2/select2.min.css" var="sel2Css" />
	<link rel="stylesheet" type="text/css" href="${sel2Css}" />
	<!--  <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css"> -->
<!--===============================================================================================-->
<spring:url value="/resources/login/css/util.css" var="ustilCss" />
	<link rel="stylesheet" type="text/css" href ="${ustilCss}" />
	<!--  <link rel="stylesheet" type="text/css" href="css/util.css"> -->
	<spring:url value="/resources/login/css/main.css" var="mainCss" />
	<!--  <link rel="icon" type="image/png" href ="${favIco}" /> -->
	<link rel="stylesheet" type="text/css" href="${mainCss}">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
				<spring:url value="/resources/login/images/img-01.png" var="im01Png" />
					<img src="${im01Png}" alt="IMG">
				</div>

				<form:form class="login100-form validate-form" action="/portal-customer-service/Login/sumbit" modelAttribute="loginBean" method="POST">
					<span class="login100-form-title">
						Member Login
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<form:input path="username" class="input100" type="text" name="email" placeholder="Email"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<form:input path="password" class="input100" type="password" name="pass" placeholder="Password" />
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>
					
					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>

					<div class="text-center p-t-12">
						<span class="txt1">
							Forgot
						</span>
						<a class="txt2" href="#">
							Username / Password?
						</a>
					</div>

					<div class="text-center p-t-136">
						<a class="txt2" href="#">
							Create your Account
							<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	
	

	
<!--===============================================================================================-->	

    <spring:url value="/resources/login/vendor/jquery/jquery-3.2.1.min.js" var="jqueJs" />
    <script src="${jqueJs}"></script>
	<!--  <script src="vendor/jquery/jquery-3.2.1.min.js"></script> -->
<!--===============================================================================================-->
	<spring:url value="/resources/login/vendor/bootstrap/js/popper.js" var="popJs" />
    <script src="${popJs}"></script>
    <spring:url value="/resources/login/vendor/bootstrap/js/bootstrap.min.js" var="boot2Js" />
    <script src="${boot2Js}"></script>
	<!--  <script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script> -->
<!--===============================================================================================-->
	<spring:url value="/resources/login/vendor/select2/select2.min.js" var="select2Js" />
    <script src="${select2Js}"></script>
	<!--  <script src="vendor/select2/select2.min.js"></script> -->
<!--===============================================================================================-->
	<spring:url value="/resources/login/vendor/tilt/tilt.jquery.min.js" var="jquetilJs" />
    <script src="${jquetilJs}"></script>
	<!--  <script src="vendor/tilt/tilt.jquery.min.js"></script> -->
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
<!--===============================================================================================-->
	<spring:url value="/resources/login/js/main.js" var="mainJs" />
    <script src="${mainJs}"></script>
	<!--  <script src="js/main.js"></script> -->

</body>
</html>