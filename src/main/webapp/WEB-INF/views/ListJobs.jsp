<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JOb List</title>
</head>
<body>

	<table border="1">

		<tr>
			<td>JobId</td>
			<td>title</td>
			<td>JDURL</td>
		</tr>

		<c:forEach items="${jobs}" var="j">
			<tr>
				<td>${j.jobid }</td>
				<td>${j.jobtitle }</td>
				<td><a href="${j.jdurl }" target="_blank">JD</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>