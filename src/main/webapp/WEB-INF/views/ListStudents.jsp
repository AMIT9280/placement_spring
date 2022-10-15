<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Students</title>
</head>
<body>
<h3>List Students</h3>

<table border="1">
	<a href="searchuser">Search</a>
	<tr>
		<th>StudentId</th>
		<th>FirstName</th>
		<th>Email</th>
		<th>SSC</th>
		<th>HSC</th>
		<th>BCGPA</th>
		<th colspan="2">Action</th>
	</tr>
	<c:forEach items="${students}" var="user">
	<tr>
		<td>${user.studentId}</td>
		<td>${user.firstName}</td>
		<td>${user.email}</td>
		<td>${user.ssc}</td>
		<td>${user.hsc}</td>
		<td>${user.bcgpa}</td>
	 <td><a href="deletstudent?studentId=${user.studentId }">Delete</a></td>
		<td><a href="upDateStudent?studentId=${user.studentId }">Update</a></td>
	 
		 
	 
	</tr>
	</c:forEach>
</table>
</body>
</html>