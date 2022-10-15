<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Job</title>
</head>
<body>
<form action="savejob" method="post" enctype="multipart/form-data" >
	Job Title <input type="text" name="Jobtitle" placeholder="Job Title"><br><br>
	Description<input type="file" name="Description" ><br><br>
	<input type="submit" value="Submit">
</form>
</body>
</html>