<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Administrator</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
<div class="loginbox">
	<form action="add" method="post">
	<img src="assets/pictures/a.png" class= "user" alt="User Image">
			
			<h4>Admin Name</h4>    <input type="text"  name="name"><br>
			<h4>Admin User Name</h4> <input type="text"  name="uname"><br>
			<h4>Admin Password</h4>  <input type="text"  name="pw"><br>
			<h4>Email </h4>          <input type="text"  name="email"><br>
			<h4>Phone Number <h4>  <input type="text"  name="pno"><br>
			
			<input type="submit" name="submit" value="Create">
	</form>
</div>
</body>
</html>