<%@ include file="../common/header.jspf"%>
<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=bleue>

<h1> Welcom to SARAYA TECH Web Validation2</h1>
<p><font color="red">${errorMessage}</font></p>
<h3>Welcom to saraya Tech</h3> 
<section bgcolor=bleue>
			<div>
		<form action="/login.do" method="post">
 			name		:<input type="text" name="nom" > <br> <br>
 			password	:<input type="text" name="pass"> <br> <br>
 			<input type="submit"><br> <br>
			</form>
</div>

</section>



</body>
</html>
<%@ include file="../common/footer.jspf"%>