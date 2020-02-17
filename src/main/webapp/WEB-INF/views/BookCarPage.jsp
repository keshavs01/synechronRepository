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
<title>Rental Car - Login Page</title>
</head>
<body>

	<a href="/">Home</a>
	<h4>Details of the car you are booking -----</h4>
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
				<th>Car Id</th>
				<th>Model No.</th>
				<th>Number Plate</th>
				<th>Category</th>
				<th>Price</th>
				<th>Capacity</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td>${carObject.getCarId()}</td>
				<td>${carObject.getModelNo()}</td>
				<td>${carObject.getNumberPlate()}</td>
				<td>${carObject.getCategory()}</td>
				<td>${carObject.getPrice()}</td>
				<td>${carObject.getCapacity()}</td>
			</tr>
		</tbody>
	</table>
	<br>
	<br>


<h4>Please enter the details of the trip</h4>

	<form:form action="/bookCar" method="post"
		style="max-width: 50%;margin-left: 25%;">
		<div class="form-group">
			<label>City</label>
			<form:input type="text" path="city" class="form-control" />
		</div>

		<div class="form-group">
			<label>Source</label>
			<form:input type="text" path="source" class="form-control" />
		</div>
		
		<div class="form-group">
			<label>Destination</label>
			<form:input type="text" path="destination" class="form-control" />
		</div>
		
		<div class="form-group">
			<label>Distance</label>
			<form:input type="text" path="distance" class="form-control" />
		</div>
		
		<form:radiobutton path="serviceType" value="Car Booked" />Booked Car
		<form:radiobutton path="serviceType" value="Driver Booked" />Booked Driver 
			
		<div>
			<input type="submit" value="Submit" class="btn btn-primary">
		</div>
	</form:form>
</body>
</html>