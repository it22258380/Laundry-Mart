<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Admin</title>
<link rel="stylesheet" href="style.css">

    
</head>
<body>
		<%
			String id    =request.getParameter("id");
			
			String un    =request.getParameter("un");
			String pw    =request.getParameter("pw");
			
		
		%>
		<div class="loginbox">
<form action= "delete" method="post">
<img src="assets/pictures/a.png" class= "user" alt="User Image">

			<table>
				
			<tr>
			<td ><h4>Admin ID</h4> </td>
			<td><input type="text" name="id" value="<%= id %>" ></td>
		    </tr>
			
		    
		    <tr>
			<td ><h4>User Name	</h4> </td>
			<td> <input type="text" name="uname" value="<%=un%>"><br> </td>
		    </tr>
		
			<tr>
			<td ><h4>Password </h4></td>
			<td> <input type="password" name="pass" value="<%=pw%>"><br>  </td>
		    </tr>
		    
			
			</table>
			<br>
			 <input type="submit" name="submit" value="Delete"><br>
			
		</form>
	</div>
</body>
</html>