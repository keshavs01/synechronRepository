<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!------ Include the above in your HEAD tag ---------->
<body>
	<h1>${requestScope.driversNotPresent}</h1>

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">Add Driver's Details</div>
					<div class="card-body">

						<%--    <form class="form-horizontal" method="post" action="register"> --%>

						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">city</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="text"
										class="form-control" name="city" id="city"
										placeholder="Enter City" />
								</div>
							</div>
						</div>

						<div class="form-group ">
							<!-- <button type="submit" class="btn btn-success btn-lg float-right"
					id="btnLogin">Register</button> -->
							<button type="button"
								class="btn btn-primary btn-lg btn-block login-button"
								onclick="add();">Search</button>
							<%-- <a href="showDriversByCity/${driver.city}">Submit</a> --%>
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




	<script>
		function add() {

			location.href = "/showDriversByCity/" + $("#city").val();

		}
	</script>

</body>
