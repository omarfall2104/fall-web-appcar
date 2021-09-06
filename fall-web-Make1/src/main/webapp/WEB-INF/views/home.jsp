<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=bleue>



<h1>WELCOM TO SARAYA TECH</h1>
<h3>Hello ${nom} your password is ${pass}</h3>

			<table>
			<thead>
					<tr>
						<td>Image</td>
						<td>Year</td>
						<td>Make</td>
						<td>Model</td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${cars}" var="car">
				<tr>
					<td><img src = "${car.image}" width="250" height="250" /></td>
					<td>${car.year}</td>
					<td>${car.make}</td>
					<td>${car.model}</td>
					
					
					<td><a href="/delete.do?id=${car.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
		</table>
		<form action="/car.do" method="post">
			<input type="text" name = "yr">
			<input type="text" name = "mk">
			<input type="text" name = "md">
			<input type="text" name = "im">
			<input type="submit" value="Add a Car">
		</form>
		</p>
</body>
</html>
<%@ include file="../common/footer.jspf"%>