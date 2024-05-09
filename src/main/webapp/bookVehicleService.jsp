<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Vehicle Service</title>
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
</style>

</head>
<body>
	<div>
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
		        <a class="nav-link" href="selectLoginType.jsp">Login</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="selectRegisterType.jsp">Register</a>
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
		<h1>Book Vehicle Service Order</h1>
		
		<div>
			<form action="addServiceOrder" method="POST">
			<fieldset>
    			<legend>Customer Details: </legend>
					Full Name : <input type="text" name="custName"><br><br>
					City : <input type="text" name="custCity"><br><br>
					Phone No : <input type="text" name="custPhone"><br><br>
	
					Username : <input type="text" name="custUserName"><br><br>
					Password : <input type="password" name="custPassword"><br><br>
			<fieldset>
			
			<fieldset>
    			<legend>Service Details: </legend>
    			
					Service Type : 
						<select name="serviceType">
						  <option value="fullService">Full Service</option>
						  <option value="bodyWash">Body Wash</option>
						  <option value="repair">Repair</option>
						  <option value="other">Other</option>
						</select>
					<br><br>
					
					Vehicle Brand : 
						<select name="vehicleBrand">
						  <option value="toyota">Toyota</option>
						  <option value="nissan">Nissan</option>
						  <option value="suzuki">Suzuki</option>
						  <option value="bmw">BMW</option>
						  <option value="other">Other</option>
						</select>
						<br><br>
						
					Body Type : 
						<select name="bodyType">
						  <option value="suv">SUV</option>
						  <option value="van">Van</option>
						  <option value="car">Car</option>
						  <option value="hatchback">HatchBack</option>
						  <option value="sadan">Sadan</option>
						  <option value="other">Other</option>
						</select>
						<br><br>
						
					Manufacture Year : 
						<select name="manufYear">
						  <option value="Before 2000">Before 2000</option>
						  <option value="2000 to 2015">2000 to 2015</option>
						  <option value="After 2015">After 2015</option>
						</select>
						<br><br>
						
					Additional Details : 
						<textarea rows="5" cols="45" name="serviceDescription"></textarea>
					
					<br><br>
					
					<input href="vehicleService" type="submit" value="Book Order" class="btn btn-info"><br><br>
			<fieldset>
			
			<a href="HomePage.jsp"><button type="button" class="btn btn-primary">Return Back >></button></a>
		</form>
		</div>
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