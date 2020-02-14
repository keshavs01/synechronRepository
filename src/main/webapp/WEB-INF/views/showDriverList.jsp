<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver Details</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
</head>
<body>
	<div class="container">
 <h1 class="centerText">Registered Drivers List</h1>
    
<table class="table table-dark">
<thead>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Phone Number</th>
		<th>City</th>
		<th>Rating</th>	
	</tr>

</thead>
<tbody>
<c:forEach items="${driverList}" var="driver">
<link href=css/style.css rel="stylesheet">
<span class=blue>
	<tr>
		<td><c:out value="${driver.firstName}"></c:out></td>
		<td><c:out value="${driver.lastName}"></c:out></td>
		<td><c:out value="${driver.phoneNumber}"></c:out></td>
		<td><c:out value="${driver.city}"></c:out></td>
		<td><c:out value="${driver.driverRating}"></c:out></td>
		<td><a href="deleteDriver/${driver.driverId}">Delete</a>
		<td><a href="updateDriver/${driver.driverId}">Update</a>
	</tr>
</span>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>