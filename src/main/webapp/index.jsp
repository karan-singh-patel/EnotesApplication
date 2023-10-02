<%@ page import="com.db.DBConnect"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.back-img {
	background: url("image/home.jpeg");
	width: 100%;
	height: 80vh;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
<meta charset="ISO-8859-1">
<title>Home</title>
<%@include file="all_component/allcss.jsp"%>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>

	<%
	Connection conn = DBConnect.getConn();
	%>

	<div class="container-fluid back-img">
		<div class="text-center">
			<h1 class="text-white">
				<i class="fa fa-book" aria-hidden="true"></i>E Notes-Save Your Notes
			</h1>
			<a href="login.jsp" class="btn btn-light"><i
				class="fa fa-user-circle-o" aria-hidden="true"></i>Login</a> <a
				href="register.jsp" class="btn btn-light"><i
				class="fa fa-user-plus" aria-hidden="true"></i>Register</a>
		</div>
	</div>

	<div class="container-fluid bg-dark mt-1">
		<p class="text-center text-white">Note: Any Errors occur then
			contact CodeWith Karan. Designed and devloped by Karan Singh</p>

		<p class="text-center text-white">All Right Reserved
			@CodeWithKaran-2023-2024</p>
	</div>
</body>
</html>