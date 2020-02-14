<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!------ Include the above in your HEAD tag ---------->
<body>
<form:form action="register" method="post">
<div class="container">
<div class="row justify-content-center">
    <div class="col-md-8">
      <div class="card">
       <div class="card-header">Register</div>
         <div class="card-body">

<%--    <form class="form-horizontal" method="post" action="register"> --%>

     <div class="form-group">
     <label for="name" class="cols-sm-2 control-label">User Name</label>
       <div class="cols-sm-10">
      <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
      <input type="text" class="form-control" name="fullName" id="fullName" placeholder="Enter your Name" />
   </div>
   </div>
  </div>
    <div class="form-group">
   <label for="email" class="cols-sm-2 control-label">Email Id</label>
   <div class="cols-sm-10">
   <div class="input-group">
   <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
      <input type="text" class="form-control" name="email_id" id="email_id" placeholder="Enter your Email" />
      </div>
   </div>
    </div>
  <div class="form-group">
      <label for="username" class="cols-sm-2 control-label">UserId</label>
   <div class="cols-sm-10">
    <div class="input-group">
  <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
           <input type="text" class="form-control" name="userId" id="userId" placeholder="Enter your Username" />
      </div>
     </div>
 </div>
     <div class="form-group">
   <label for="password" class="cols-sm-2 control-label">Password</label>
     <div class="cols-sm-10">
       <div class="input-group">
         <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
      <input type="password" class="form-control" name="password" id="password" placeholder="Enter your Password" />
       </div>
      </div>
     </div>
 <div class="form-group">
    <label for="confirm" class="cols-sm-2 control-label">Phone Number</label>
        <div class="cols-sm-10">
     <div class="input-group">
         <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
           <input type="text" class="form-control" name="ph_number" id="ph_number" placeholder="Enter your Phone Number" />
   </div>
   </div>
    </div> 
      <div class="form-group ">
      <!-- <button type="submit" class="btn btn-success btn-lg float-right"
					id="btnLogin">Register</button> -->
         <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Register</button> 
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
