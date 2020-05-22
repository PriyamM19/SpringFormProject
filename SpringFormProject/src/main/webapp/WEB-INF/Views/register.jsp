<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register Page</h1>

	<form:form action="register" method="post">

	<form:input path="Name"  placeholder="Enter Name"/>
	<br>
	<br>
	<form:input path="EmailID" placeholder="Enter EmailID"/>
	<br>
	<br>
	<form:input path="Address" placeholder="Enter Address"/>
	<br>
	<br>
	<form:input path="PhoneNO" placeholder="Enter PhoneNO"/>
	<br>
	<br>
	
	
	<input type="submit" value="Submit">
	
</form:form>
</body>
</html>