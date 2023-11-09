<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
<style>
.border-md {
	border-width: 2px;
}

.btn-facebook {
	background: #405D9D;
	border: none;
}

.btn-facebook:hover, .btn-facebook:focus {
	background: #314879;
}

.btn-twitter {
	background: #42AEEC;
	border: none;
}

.btn-twitter:hover, .btn-twitter:focus {
	background: #1799e4;
}

/*
*
* ==========================================
* FOR DEMO PURPOSES
* ==========================================
*
*/
body {
	min-height: 100vh;
}

.form-control:not(select) {
	padding: 1.5rem 0.5rem;
}

select.form-control {
	height: 52px;
	padding-left: 0.5rem;
}

.form-control::placeholder {
	color: #ccc;
	font-weight: bold;
	font-size: 0.9rem;
}

.form-control:focus {
	box-shadow: none;
}
</style>
</head>

<body>

	<!-- Navbar-->
	<header class="header">
		<nav class="navbar navbar-expand-lg navbar-light py-0">
			<div class="container">
				<!-- Navbar Brand -->
				<a href="#" class="navbar-brand">
					<h1>CityBank SignUp Form</h1>
				</a>
			</div>
		</nav>
	</header>


	<div class="container">
		<div class="row py-0 mt-1.5 align-items-center">
			<!-- For Demo Purpose -->
			<div class="col-md-5 pr-lg-5 mb-5 mb-md-0">
				<img
					src="https://bootstrapious.com/i/snippets/sn-registeration/illustration.svg"
					alt="" class="img-fluid mb-3 d-none d-md-block">
				<h1>Create an Account</h1>

				</p>
			</div>

			<!-- Registeration Form -->
			<div class="col-md-7 col-lg-6 ml-auto py-0">
				<form id="signUp" name="signUp" onsubmit="clickSubmit(event)"
					action="/customer/add" method="post" enctype="multipart/form-data">
					<div class="row mb-0">

						<!-- First Name -->
						<div class="input-group col-lg-6 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-user text-muted"></i>
								</span>
							</div>
							<input id="firstName" type="text" name="firstname"
								placeholder="First Name"
								class="form-control bg-white border-left-0 border-md">
						</div>

						<!-- Last Name -->
						<div class="input-group col-lg-6 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-user text-muted"></i>
								</span>
							</div>
							<input id="lastName" type="text" name="lastname"
								placeholder="Last Name"
								class="form-control bg-white border-left-0 border-md">
						</div>

						<!-- Email Address -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-envelope text-muted"></i>
								</span>
							</div>
							<input id="email" type="email" name="email"
								placeholder="Email Address"
								class="form-control bg-white border-left-0 border-md">
						</div>

						<!-- Permanent Address -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-address-book text-muted"></i>
								</span>
							</div>
							<input id="Permanent_Address" type="text"
								name="Permanent_Address" placeholder="Permanent Address"
								class="form-control bg-white border-left-0 border-md">
						</div>
						<!-- Current Address -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-address-book text-muted"></i>
								</span>
							</div>
							<input id="Current_Address" type="text" name="Current_Address"
								placeholder="Current Address"
								class="form-control bg-white border-left-0 border-md">
						</div>

						<!-- Aadhar Card Number -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-id-card text-muted"></i>
								</span>
							</div>
							<input id="Aadhar_No" type="text" name="Aadhar_No"
								placeholder="Aadhar No"
								class="form-control bg-white border-left-0 border-md">
						</div>

						<!-- Pan Card Number -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-id-card text-muted"></i>
								</span>
							</div>
							<input id="Pan_Card_Number" type="text" name="Pan_Card_Number"
								placeholder="Pan Card Number"
								class="form-control bg-white border-left-0 border-md">
						</div>

						<!-- E-Kyc Number -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-university text-muted"></i>
								</span>
							</div>
							<input id="E_Kyc_No" type="text" name="E_Kyc_No"
								placeholder="E-Kyc Number"
								class="form-control bg-white border-left-0 border-md">
						</div>
						
						<!-- Passport Number -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-university text-muted"></i>
								</span>
							</div>
							<input id="Passport_No" type="text" name="Passport_No"
								placeholder="Passport Number"
								class="form-control bg-white border-left-0 border-md">
						</div>
						
						<!-- Date of Birth -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-university text-muted"></i>
								</span>
							</div>
							<input id="DOB" type="date" name="DOB"
								placeholder="Date of Birth"
								class="form-control bg-white border-left-0 border-md">
						</div>
						
						<!-- Job -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-question-circle text-muted"></i>
								</span>
							</div>
							<input id="Job" type="text" name="Job" placeholder="Job"
								class="form-control bg-white border-left-0 border-md">
						</div>

						<!-- Photo -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="">
									<!--<i class="fa fa-question-circle text-muted"></i>-->
								</span>
							</div>
							<label>Insert Photo</label>
							<input type="file" name="image" accept="image/png, image/jpeg" id="Photo"
								class="" />
							
						</div>

						<!-- Phone Number -->
						<div class="input-group col-lg-12 mb-4">
							<div class="input-group-prepend">
								<span
									class="input-group-text bg-white px-4 border-md border-right-0">
									<i class="fa fa-phone-square text-muted"></i>
								</span>
							</div>
							<select id="countryCode" name="countryCode"
								style="max-width: 80px"
								class="custom-select form-control bg-white border-left-0 border-md h-100 font-weight-bold text-muted">
								<option value="">+91</option>
							</select> <input id="phoneNumber" type="tel" name="phoneNumber"
								placeholder="Phone Number"
								class="form-control bg-white border-md border-left-0 pl-3">
						</div>
						.

						<!-- Submit Button -->
						<div class="form-group col-lg-12 mx-auto mb-0">

							<input class="text-center input-group col-lg-12 mb-2"
								style="text-align: center; background-color: #1799e4;"
								type="submit" value="Create Account" />
						</div>

						<!-- Divider Text -->
						<div
							class="form-group col-lg-12 mx-auto d-flex align-items-center my-2">
							<div class="border-bottom w-100 ml-5"></div>
							<span class="px-2 small text-muted font-weight-bold text-muted">OR</span>
							<div class="border-bottom w-100 mr-5"></div>
						</div>
						<!-- Already Registered -->
						<div class="text-center w-100">
							<p class="text-muted font-weight-bold">
								Already Registered? <a href="signin"
									class="text-primary ml-2">Login</a>
							</p>
						</div>

					</div>
				</form>
			</div>
		</div>
	</div>
	<%
		
		
		/*
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			Statement st = conn.createStatement();
			int i = st.executeUpdate("insert into users(first_name,last_name,city_name,email)values('" + first_name
					+ "','" + last_name + "','" + city_name + "','" + email + "')");
			out.println("Data is successfully inserted!");
		} catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}*/
	%>

	<script>
		function clickSubmit(event) {

			let x = document.forms["signUp"]["firstName"].value;
			let lastname = document.forms["signUp"]["lastname"].value;
			let Permanent_Address = document.forms["signUp"]["Permanent_Address"].value;
			let Current_Address = document.forms["signUp"]["Current_Address"].value;
			let Aadhar_No = document.forms["signUp"]["Aadhar_No"].value;
			let Pan_Card_Number = document.forms["signUp"]["Pan_Card_Number"].value;
			let E_Kyc_No = document.forms["signUp"]["E_Kyc_No"].value;
			let Job = document.forms["signUp"]["Job"].value;
			let phoneNumber = document.forms["signUp"]["phoneNumber"].value;
			let email = document.forms["signUp"]["email"].value;
			function getAge(DOB) {
			    var today = new Date();
			    var age = today.getFullYear() - DOB.getFullYear();
			    var m = today.getMonth() - birthDate.getMonth();
			    console.log(m);
			    if(m<=20)
			    	{alert("Age invalid");
			    		return false;
			    	}
			    return age;
			}
			
			if (x == "" || lastname == "" || Permanent_Address == ""
					|| Current_Address == "" || Aadhar_No == ""
					|| Pan_Card_Number == "" || E_Kyc_No == "" || Job == ""
					|| phoneNumber == "" || email == "") {
				event.preventDefault();
				alert("Please fill all the details");
				return false;
			}

			if (!email.includes('@') || !email.includes(".")) {
				event.preventDefault();
				alert("Email Invalid");
				return false;
			}

		}
		const signUpButton = document.getElementById('signUp');
		function changePage() {
			location.replace("SignUp.html")
		}
		// For Demo Purpose [Changing input group text on focus]
		;
		$(function() {
			$('input, select').on(
					'focus',
					function() {
						$(this).parent().find('.input-group-text').css(
								'border-color', '#80bdff');
					});
			$('input, select').on(
					'blur',
					function() {
						$(this).parent().find('.input-group-text').css(
								'border-color', '#ced4da');
					})
		});
	</script>
</body>

</html>