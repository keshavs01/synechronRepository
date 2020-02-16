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
<title>Rental Car - View All Cars</title>
</head>
<body>
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
				<th>Car Id</th>
				<th>Model No.</th>
				<th>Number Plate</th>
				<th>Category</th>
				<th>Price</th>
				<th>Capacity</th>
				<th>Action</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${carList}" var="carList">
				<tr>
					<td><c:out value="${carList.carId}"></c:out></td>
					<td><c:out value="${carList.modelNo}"></c:out></td>
					<td><c:out value="${carList.numberPlate}"></c:out></td>
					<td><c:out value="${carList.category}"></c:out></td>
					<td><c:out value="${carList.price}"></c:out></td>
					<td><c:out value="${carList.capacity}"></c:out></td>
					<td><a href="updateCar?carId=${carList.carId}">Edit</a></td>
					<td><a href="deleteCar?carId=${carList.carId}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>