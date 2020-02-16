<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<title>Rental Car - Add Car Page</title>
</head>
<body>

	<a href="/">Home</a>

	<div class="col-md-6">
		<form:form action="/addCar" method="post">
		
			<div class="form-group">
				<label>Model No.</label>
				<form:input type="text" path="modelNo" class="form-control" />
			</div>
			
			<div class="form-group">
				<label>Category</label>
				<form:input type="text" path="category" class="form-control" />
			</div>
			
			<div class="form-group">
				<label>Number Plate</label>
				<form:input type="text" path="numberPlate" class="form-control" />
			</div>

			<div class="form-group">
				<label>price</label>
				<form:input type="number" path="price" class="form-control" />
			</div>

			<div class="form-group">
				<label>Capacity</label>
				<form:input type="text" path="capacity" class="form-control" />
			</div>

			<div>
				<input type="submit" value="Add" class="btn btn-primary">
			</div>
		</form:form>
	</div>
</body>
</html>
