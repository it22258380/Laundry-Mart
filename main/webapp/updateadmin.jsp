<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Admin Details</title>
<link rel="stylesheet" href="style.css">
 
</head>
<body>
		<%
			String id    =request.getParameter("id");
			String name  =request.getParameter("name");
			String un    =request.getParameter("un");
			String pw    =request.getParameter("pw");
			String email =request.getParameter("email");
			String phone =request.getParameter("phone");
		
		%>
		
			<div class="loginbox">
		<form action= "update" method="post">
		<img src="assets/pictures/a.png" class= "user" alt="User Image">
			<table>
				
			<tr>
			<td><h4>Admin ID</h4> </td>
			<td><input type="text" name="id" value="<%= id %>" ></td>
		    </tr>
			
			<tr>
			<td><h4>Name <h4></td>
			<td>	 <input type="text" name="name" value="<%=name%>"><br></td>
		    </tr>
		    
		    <tr>
			<td><h4>User Name</h4>	 </td>
			<td> <input type="text" name="uname" value="<%=un%>"><br> </td>
		    </tr>
		
			<tr>
			<td><h4>Password</h4> </td>
			<td> <input type="password" name="pass" value="<%=pw%>"><br>  </td>
		    </tr>
		    
			<tr>
			<td><h4>Email	</h4> </td>
			<td><input type="text" name="email" value="<%=email%>"><br></td>
		    </tr>
		    
		    <tr> 
		    <td><h4>Phone Number</h4></td>
			<td> <input type="text" name="phone" value="<%=phone%>"><br></td>
		    </tr>
			
			</table>
			<br>
			 <input type="submit" name="submit" value="Update"><br>
		
		</form>
</div>
</body>
</html>