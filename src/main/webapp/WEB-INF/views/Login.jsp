<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<title>Rental Car - Login Page</title>
</head>
<body>

	<a href="/">Home</a>

	<form:form action="/login" method="post" style="max-width: 50%;margin-left: 25%;">
		<div class="form-group">
			<label>Email</label>
			<form:input type="email" path="email" class="form-control"/>
		</div>

		<div class="form-group">
			<label>Password</label>
			<form:input type="password" path="password" class="form-control"/>
		</div>

		<div>
			<input type="submit" value="Login" class="btn btn-primary">
		</div>
	</form:form>
</body>
</html>