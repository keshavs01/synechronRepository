<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Rental Car - View All Drivers</title>
</head>
<body>
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
				<th>Driver Id</th>
				<th>Driver License</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>Age</th>
				<th>City</th>
				<th>State</th>
				<th>Contact No.</th>
				<th>Email Id</th>
				
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${driverList}" var="driverList">
				<tr>
					<td><c:out value="${driverList.driverId}"></c:out></td>
					<td><c:out value="${driverList.driverLicense}"></c:out></td>
					<td><c:out value="${driverList.firstName}"></c:out></td>
					<td><c:out value="${driverList.lastName}"></c:out></td>
					<td><c:out value="${driverList.gender}"></c:out></td>
					<td><c:out value="${driverList.age}"></c:out></td>
					<td><c:out value="${driverList.city}"></c:out></td>
					<td><c:out value="${driverList.state}"></c:out></td>
					<td><c:out value="${driverList.contactNo}"></c:out></td>
					<td><c:out value="${driverList.emailId}"></c:out></td>
					<td><a href="updateDriver?driverId=${driverList.driverId}">Edit</a>
					<td><a href="deleteDriver?driverId=${driverList.driverId}">Delete</a>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>