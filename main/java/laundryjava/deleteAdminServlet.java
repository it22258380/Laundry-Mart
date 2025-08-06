package laundryjava;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteAdminServlet")
public class deleteAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = adminDBUtil.deleteadmin(id);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("addAdmin.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Admin> admindetail = adminDBUtil. getAdminDetails(id);
			request.setAttribute("admindetail", admindetail);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("adminaccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}