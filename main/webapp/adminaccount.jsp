<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

	
	<c:forEach var ="ad" items="${admindetails}">
	
	<c:set var="id" value="${ad.adminID}"></c:set>
	<c:set var="name" value="${ad.adminName}"></c:set>
	<c:set var="un" value="${ad.username}"></c:set>
	<c:set var="pw" value="${ad.password}"></c:set>
	<c:set var="email" value="${ad.email }"></c:set>
	<c:set var="phone" value="${ad.phonenumber}"></c:set>
	
	
	  ${ad.adminID} {ad.adminName} {ad.username} {ad.password} ${ad.email } {ad.phonenumber}
	
	</c:forEach>
		
		
		<c:url value="updateadmin.jsp" var="adupdate">
			
			<c:param name= "id" value="${id}"/>
			<c:param name="name" value="${name}"/>
			<c:param name= "un" value="${un}"/>
			<c:param name= "pw" value="${pw}"/>
			<c:param name= "email" value="${email}"/>
			<c:param name= "phone" value="${phone}"/>
		
		</c:url>
		<a href="${adupdate} ">
		<input type="button" name="update" value="Update MY Account">
		</a>
		
		<br>
		<c:url value="deleteAdmin.jsp" var="addelete">
		<c:param name="id" value="${id}"/>
			<c:param name="name" value="${name}"/>
			<c:param name="un" value="${un}"/>
			<c:param name="pw" value="${pw}"/>
			<c:param name="email" value="${email}"/>
			<c:param name="phone" value="${phone}"/>
		</c:url>
			<a href="${addelete}">
			<input type="button" name="delete" value="Delete My Account">
			</a>
		
		
</body>
</html>