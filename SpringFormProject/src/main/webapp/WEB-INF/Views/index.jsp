<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<h1 align="center">SpringFormProject 

		<h2 align="center"><button><a href="register">New Register</a></button></h2>	
	<c:if test="${List.size()>0 }">
	<br/><br/>
	<table border="1" align="center">
	<th>ID</th>
	<th>Name</th>
	<th>Email</th>
	<th>Address</th>
	<th>Phone</th>
	<th colspan="8" >Action</th>
		<c:forEach var="user" items="${List}">
		
			<tr>
			<td>	<c:out value="${user.getID() }"></c:out>	</td>
			<td>	<c:out value="${user.getName()}"></c:out>	</td>
			<td>	<c:out value="${user.getEmailID()}"></c:out>	</td>
			<td>	<c:out value="${user.getAddress()}"></c:out>	</td>
			<td>	<c:out value="${user.getPhoneNO()}"></c:out>	</td>
			
			<td>  <a href="editbyid${user.getID() }">	<c:out value="Edit"></c:out> </a> </td>
			<td>  <a href="delete${user.getID() }">	<c:out value="Delete"></c:out> </a> </td>
			
			</tr>
		</c:forEach>
	</table>
	</c:if>	
	</h1>
</body>
</html>
