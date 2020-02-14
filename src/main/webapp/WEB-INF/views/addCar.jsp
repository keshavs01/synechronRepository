<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!------ Include the above in your HEAD tag ---------->
<body>
<h1>${requestScope.carRegistrationError}</h1>
<form:form action="addCar" method="post">
<div class="container">
<div class="row justify-content-center">
    <div class="col-md-8">
      <div class="card">
       <div class="card-header">Add Car Details</div>
         <div class="card-body">

<%--    <form class="form-horizontal" method="post" action="register"> --%>


     <div class="form-group">
     <label for="name" class="cols-sm-2 control-label">Registration Number</label>
       <div class="cols-sm-10">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
      <input type="text" class="form-control" name="registrationNumber" id="registrationNumber" placeholder="Enter Registration Number" />
   </div>
   </div>
  </div>
     <div class="form-group">
     <label for="name" class="cols-sm-2 control-label">Car Brand</label>
       <div class="cols-sm-10">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
      <input type="text" class="form-control" name="carBrand" id="carBrand" placeholder="Enter brand" />
   </div>
   </div>
  </div>
  
      <div class="form-group">
     <label for="name" class="cols-sm-2 control-label">Category</label>
     <form:select path="carCategory" var="Select">  
     <form:options/>
     </form:select>
       <!-- <div class="cols-sm-10">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
      <input type="text" class="form-control" name="carCategory" id="carCategory" placeholder="Choose Category" />
   </div>
   </div> -->
  </div>
  

  <div class="form-group">
      <label for="username" class="cols-sm-2 control-label">Rating</label>
   <div class="cols-sm-10">
    <div class="input-group">
  <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
           <input type="text" class="form-control" name="carRating" id="carRating" placeholder="Enter Rating" />
      </div>
     </div>
 </div>
 

      <div class="form-group ">
      <!-- <button type="submit" class="btn btn-success btn-lg float-right"
					id="btnLogin">Register</button> -->
         <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Add</button> 
      </div>
     <!--  <div class="login-register">
      <a href="index.php">Login</a>
        </div> -->
    <%--  </form> --%>
    </div>

  </div>
</div>
   </div>
</div>
</form:form>
</body>
