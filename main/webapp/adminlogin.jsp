<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrator login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	
	<div class="loginbox">
	 <img src="assets/pictures/a.png" class= "user" alt="User Image">
	<h2>Administrator</h2>
		
		<form action="adlogin" method="post">
		
		<p><b>User name</b></p>
		<input type="text" name="adun" placeholder="Enter username">
		<p><b>Password</b></p>
		<input type="text" name="adpw" placeholder="Enter password">
		<input type="submit" value="Log in">
		
		</form>
	
	</div>
</body>
</html>