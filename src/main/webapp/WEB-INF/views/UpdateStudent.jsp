<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	rel="stylesheet" />
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	rel="stylesheet" />
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/5.0.0/mdb.min.css"
	rel="stylesheet" />
<title>Update Student</title>
</head>
<style>
body {
	background: pink;
}

.frm {
	width: 30%;
	margin-top: 1%;
	margin-left: 500px
}
button{
	 margin-left: 150px;
	 margin-bottom: 50px;
}
span{
color: red;
}
</style>
<body>
<div class="frm">
		<h3>Update Student</h3>
		<form action="upDateStudent" method="post">
		<div class="form-group">
				<label for="exampleInputEmail1">First Name</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter First Name" name="firstName"  value="${student.firstName }"><span>${firstName }</span>   
			</div> 
			<div class="form-group">
				<label for="exampleInputEmail1">Last Name</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter Last Name" name="lastName" value="${student.lastName }"><span>${lastName }</span>    
			</div>
		 
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email" value="${student.email }"><span>${email }</span> <br> <small
					id="emailHelp" class="form-text text-muted">We'll never
					share your email with anyone else.</small>
			</div>
			 
			<div class="form-group">
				<label for="exampleInputPassword1">Gender</label> <br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<label for="exampleInputPassword1">Male</label> <input type="radio"  name="gender">&nbsp;&nbsp;&nbsp;
				<label for="exampleInputPassword1">Female</label> <input type="radio" name="gender">&nbsp;&nbsp;&nbsp;
				<label for="exampleInputPassword1">Other</label> <input type="radio" name="gender">&nbsp;&nbsp;&nbsp;
				<span>${gender }</span> 
			</div>
			
		 <div class="form-group">
				<label for="exampleInputEmail1">Contact</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter Contact" name="contact" value="${student.contact }">  
					<span>${contact }</span> 
			</div>
			 <div class="form-group">
				<label for="exampleInputEmail1">SSC</label> <input
					type="number" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter SSC" name="ssc" value="${student.ssc }">  
					<span>${ssc }</span> 
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">HSC</label> <input
					type="number" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter HSC" name="hsc" value="${student.hsc }">  
					<span>${hsc }</span> 
			</div>
				<div class="form-group">
				<label for="exampleInputEmail1">BCGPA</label> <input
					type="number" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter BCGPA" name="bcgpa" value="${student.bcgpa }">  
					<span>${bcgpa }</span> 
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">University</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter University" name="university" value="${student.university }">  
					<span>${university }</span> 
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Branch</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter Branch" name="branch"  value="${student.branch }"> 
					<span>${branch }</span> 
			</div>
			<br>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>