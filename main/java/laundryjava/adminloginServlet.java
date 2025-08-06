package laundryjava;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/adminloginServlet")
public class adminloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String username=request.getParameter("adun");
			String password=request.getParameter("adpw");
			
			try {
			List<Admin> admindetails=adminDBUtil.validate(username, password);
			request.setAttribute("admindetails", admindetails);
			}
			
			catch(Exception e){
				e.printStackTrace();
			}
			RequestDispatcher dis=request.getRequestDispatcher("admin_dashboard.jsp");
			dis.forward(request, response);
			
			}
		
	}


