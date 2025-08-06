package laundryjava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addAdmin")
public class addAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String username=request.getParameter("uname");
		String password=request.getParameter("pw");
		String email=request.getParameter("email");
		String phonenumber=request.getParameter("pno");
		
		boolean isTrue;
		
		isTrue=adminDBUtil.newadmin(name,username, password,email,phonenumber);
		
		if(isTrue==true) {
			RequestDispatcher dis=request.getRequestDispatcher("admin_dashboard.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2=request.getRequestDispatcher("addAdmin.jsp");
			dis2.forward(request, response);
		}
	}

}
