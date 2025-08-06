package laundryjava;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateAdminServlet")
public class updateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id    =request.getParameter("id");
		String name  =request.getParameter("name");
		String un    =request.getParameter("un");
		String pw    =request.getParameter("pw");
		String email =request.getParameter("email");
		String phone =request.getParameter("phone");
	
		boolean isTrue;
		isTrue=adminDBUtil.updateadmin(id,name,un,pw,email,phone);
		
		if(isTrue==true) {
			
			List<Admin> adDetails=adminDBUtil.getAdminDetails(id);		
			request.setAttribute("admindetails",adDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("adminaccount.jsp");
			dis.forward(request, response);
		
		
	}
	
	}
}
