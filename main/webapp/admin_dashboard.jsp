<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "java.util.List" %>
<%@page import ="laundryjava.Admin" %>
<%@page import ="laundryjava.AdminDAO" %> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dash board</title>
<link rel="stylesheet" href="ad.css">
</head>
<body>

 <aside id="sidebar">
 
       <div class="logo">
        <a href="#"><img src="assets/pictures/logo.png" ></a>
            <div class="logo-text">
                <h1>AquaGlow</h1>
                <p>Laundry Service</p>
           </div>
  	</div>

        <ul class="sidebar-list">
          <li class="sidebar-list-item">
            <a href="admin_dashboard.jsp" target="_self">
              <i class="fa-solid fa-bars"></i> Dashboard
            </a>
          </li>

            <li class="sidebar-list-item">
            <a href="adminaccount.jsp" target="_self">
              <i class="fa-solid fa-user"></i> Admin Profile
            </a>
          </li>

          <li class="sidebar-list-item">
            <a href="" target="_self">
              <i class="fa-solid fa-people-roof"></i>Customer Details
            </a>
          </li>
          
          <li class="sidebar-list-item">
            <a href="" target="_self">
              <i class="fa-solid fa-people-roof"></i>Order Details
            </a>
          </li>
         
          <li class="sidebar-list-item">
            <a href="" target="_self">
              <i class="fa-solid fa-bars"></i> Feedbacks
            </a>
          </li>
          
        </ul>
        
   
  </aside>
        
       <div class="box">
    <main class="">
        <h4 style="font-size:large">SYSTEM ADMIN LIST<span ><a href="addAdmin.jsp"><br><button class="addnew">+ Add New Admin</button></a></span></h4>
          <div class="whole">
             <table border="0px" class="admin_list">
                <tr id="head">
                     <th>Admin_ID</th>
                     <th>Admin_Name</th>
                     <th>Username</th>
                     <th>Password</th>
                     <th>Admin_Email</th>
                     <th>Phone_Number</th>
                 </tr>
                 <%
            List<Admin> admins = AdminDAO.getAlladmins();
            for (Admin a: admins) {
        %>
            <tr>
                <td><%= a.getAdminID() %></td>
                <td><%= a.getAdminName() %></td>
                <td><%= a.getUsername() %></td>
                <td><%= a.getPassword()  %></td>
                <td><%= a.getemail() %></td>
                <td><%= a.getphonenumber() %></td>
                
            </tr>
        <%
            }
        %>
                 
              </table>
	

          </div>
    </main>
  </div>
		
</body>
</html>