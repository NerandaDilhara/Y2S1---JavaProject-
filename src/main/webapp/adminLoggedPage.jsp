<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Potal</title>

<link rel="stylesheet" href="css/bootstrap.min.css">

<style>
	.div1{
		margin: 10px;
		font-size: 23px;
	}
	body{
		background-color: rgb(178, 170, 170)
	}
	.flex-container{
		display: flex;
		justify-content: space-around;
		align-items: center;
	}
	.flex{
		margin: 100px;
	}
	.a{
		text-decoration: none;
		font-size: 30px;
		color: black;
	}
	.img{
		width:30px;
		height:30px;
	}
	.flex-container2{
		display: flex;
		margin-left:340px;
	}
	.common-div{
		display: flex;
		margin: 60px;
		justify-content: space-around;
	}
	.image{
		width: 250px;
		height: 250px;
		margin-right: 100px;
		border-radius: 40px;
	}
	.container {
	  position: relative;
	  width: 50%;
	}
	
	.image {
	  opacity: 1;
	  display: block;
	  width: 100%;
	  height: auto;
	  transition: .5s ease;
	  backface-visibility: hidden;
	}
	
	.middle {
	  transition: .5s ease;
	  opacity: 0;
	  position: absolute;
	  top: 50%;
	  left: 50%;
	  transform: translate(-50%, -50%);
	  -ms-transform: translate(-50%, -50%);
	  text-align: center;
	}
	
	.container:hover .image {
	  opacity: 0.3;
	}
	
	.container:hover .middle {
	  opacity: 1;
	}
	
	.text {
	  background-color: black;
	  color: white;
	  font-size: 16px;
	  padding: 16px 32px;
	  border-radius: 20px;
	}
	.class1{
          background-color: rgb(237, 218, 192);
          color: black;
          border-radius: 40px;
          margin: 100px;
          padding: 60px;
          text-align: center;
    }
    .card {
	    padding-left: 20px;
	    padding-right: 20px;
	    box-shadow: 0 0px 20px 0 rgba(0,0,0,0.2);
	    background-color: rgba(0,0,0,0.2);
	    transition: 0.3s;
 	}
</style>

</head>
<body>

		<div class="div1">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
			  <a class="navbar-brand" href="HomePage.jsp"><img src="logo/logo1.avif" style="width:60px; height:60px;"></a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
			  </button>
			
			  <div class="collapse navbar-collapse" id="navbarSupportedContent">
			    <ul class="navbar-nav mr-auto">
			      <li class="nav-item active">
			        <a class="nav-link" href="HomePage.jsp">Home</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="aboutUs.jsp">AboutUs</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="contactUs.jsp">ContactUs</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="services.jsp">Services</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="fuel.jsp">Fuel</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="login.jsp">Login</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="adminRegister.jsp">Register</a>
			      </li>
			      
			    </ul>
			    <form class="form-inline my-2 my-lg-0">
			    	<div class="flex-container2">
			    		<input type="search" class="form-control mr-sm-2" placeholder="Search">
			      		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			    	</div>
			    </form>
			  </div>
			</nav>
		</div>
	</div>
	
	<div class="class1">
	
		<h2>Admin Portal</h2>
		
		<h5>${requestScope.output}</h5><br>
		
		<h6>
			Welcome to our admin portal for efficient online vehicle management! Streamline your operations with comprehensive tools for fleet tracking, maintenance scheduling, and performance analytics. Manage drivers, vehicles, and routes seamlessly to optimize productivity and reduce costs. Stay in control with real-time updates and customizable reporting features. Experience hassle-free management with our user-friendly interface.
		</h6>
		
		<br>
		
		<div class="row">
		
		 <div class="col-sm-6 mb-3 mb-sm-0">
		  <div class="card">
		    <div class="card-body">
		      <h3 class="card-title">Manage Staff Details</h3>
		      <p class="card-text">You can add staff, remove and update staff members</p>
		      
		      <a href="addStaffByAdmin.jsp" class="btn btn-success mb-2">Add Staff</a>
		      
		      <form action="showStaffByAdmin"  method="POST" >
		      	<input type="submit" value="Show Staff members" class="btn btn-info mb-2">
		      </form>
		      
		      <!-- <form action="updateStaffByAdmin"  method="POST" >
		      	<input type="submit" value="Update Staff members" class="btn btn-secondary mb-2">
		      </form>
		      
		      <form action="deleteStaffByAdmin"  method="POST" >
		      	<input type="submit" value="Update Staff members" class="btn btn-danger mb-2">
		      </form> -->
		      
		    </div>
		  </div>
		</div>

		  
		  <div class="col-sm-6 mb-3 mb-sm-0">
		  <div class="card">
		    <div class="card-body">
		      <h3 class="card-title">Manage Fuel Details</h3>
		      <p class="card-text">You can add fuel, remove and update</p>
		      
		      <a href="editFuel.jsp" class="btn btn-success mb-2">Add Fuel Details</a>
		      <a href="editFuel.jsp" class="btn btn-info mb-2">Show fuel details</a>
		      <a href="editFuel.jsp" class="btn btn-secondary mb-2">Update fuel status</a>
		      <a href="deleteFuel.jsp" class="btn btn-danger mb-2">Remove Fuel Details</a>
		    </div>
		  </div>
		</div>
	  
		</div>
		
		<br><br>
		
		<div class="row">
		
		  <div class="col-sm-6 mb-3 mb-sm-0">
		  <div class="card">
		    <div class="card-body">
		      <h3 class="card-title">Manage Customer Details</h3>
		      <p class="card-text">You can add customers, remove and update customers</p>
		      
		      <a href="editFuel.jsp" class="btn btn-success mb-2">Add customers</a>
		      <a href="editFuel.jsp" class="btn btn-info mb-2">Show customers</a>
		      <a href="editFuel.jsp" class="btn btn-secondary mb-2">Update customers</a>
		      <a href="deleteFuel.jsp" class="btn btn-danger mb-2">Delete customers</a>
		    </div>
		  </div>
		</div>
		  
		  <div class="col-sm-6 mb-3 mb-sm-0">
		  <div class="card">
		    <div class="card-body">
		      <h3 class="card-title">Manage Vehicle Service Details</h3>
		      <p class="card-text">You can add Vehicle, remove and update Vehicle</p>
		      
		      <a href="editFuel.jsp" class="btn btn-success mb-2">Add Vehicle</a>
		      <a href="editFuel.jsp" class="btn btn-info mb-2">Show Vehicle details</a>
		      <a href="editFuel.jsp" class="btn btn-secondary mb-2">Update Vehicle</a>
		      <a href="deleteFuel.jsp" class="btn btn-danger mb-2">Delete Vehicle</a>
		    </div>
		  </div>
		</div>
	  
		</div>
		
		<br><br>
		
		<div class="row justify-content-center">
		  <div class="col-sm-6 mb-3 mb-sm-0">
		    <div class="card">
		      <div class="card-body">
		        <h3 class="card-title">Admin Details</h3>
		        
		        <a href="editAdmin.jsp"><button class="btn btn-secondary">Edit Admin Profile</button></a>
				<a href="deleteAdmin.jsp"><button class="btn btn-danger">Delete Admin</button></a><br><br>
		
		      </div>
		    </div>
		  </div>
		</div>
	
		<a href="HomePage.jsp"><button class="btn btn-primary">Return HomePage</button></a>
	</div>
	
	
	
	
	<div style="background-color: gray;">
	<div class="flex-container">
		<a href="services.jsp" class="a"><div class="flex">Services</div></a>
		<a href="aboutUs.jsp" class="a"><div class="flex">About Us</div></a>
		<a href="contactUs.jsp" class="a"><div class="flex">Contact Us</div></a>
		<a href="fuel.jsp" class="a"><div class="flex">Fuel</div></a>
	</div>
	</div>
</body>
</html>