<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!------ Include the above in your HEAD tag ---------->
<body>
<h1>${requestScope.driverRegistrationError}</h1>
<form:form action="addDriver" method="post">
<div class="container">
<div class="row justify-content-center">
    <div class="col-md-8">
      <div class="card">
       <div class="card-header">Add Driver's Details</div>
         <div class="card-body">

<%--    <form class="form-horizontal" method="post" action="register"> --%>

     <div class="form-group">
     <label for="name" class="cols-sm-2 control-label">First Name</label>
       <div class="cols-sm-10">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
      <input type="text" class="form-control" name="firstName" id="firstName" placeholder="Enter Driver's First Name" />
   </div>
   </div>
  </div>
  
      <div class="form-group">
     <label for="name" class="cols-sm-2 control-label">Last Name</label>
       <div class="cols-sm-10">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
      <input type="text" class="form-control" name="lastName" id="lastName" placeholder="Enter Driver's Last Name" />
   </div>
   </div>
  </div>
  
   <div class="form-group">
    <label for="confirm" class="cols-sm-2 control-label">Phone Number</label>
        <div class="cols-sm-10">
     <div class="input-group">
         <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
           <input type="text" class="form-control" name="phoneNumber" id="phoneNumber" placeholder="Enter your Phone Number" />
   </div>
   </div>
    </div> 
  
    <div class="form-group">
   <label for="email" class="cols-sm-2 control-label">city</label>
   <div class="cols-sm-10">
   <div class="input-group">
   <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
      <input type="text" class="form-control" name="city" id="city" placeholder="Enter City" />
      </div>
   </div>
    </div>
  <div class="form-group">
      <label for="username" class="cols-sm-2 control-label">Rating</label>
   <div class="cols-sm-10">
    <div class="input-group">
  <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
           <input type="text" class="form-control" name="driverRating" id="driverRating" placeholder="Enter Rating" />
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
