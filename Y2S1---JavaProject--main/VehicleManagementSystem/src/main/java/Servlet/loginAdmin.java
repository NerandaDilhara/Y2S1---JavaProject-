package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CustomerModel;
import Model.StudentModel;
import Model.adminModel;
import Model.managementModel;
import Model.staffModel;
import Services.adminServices;
import Services.customerServices;
import Services.studentServices;

@WebServlet("/loginAdmin")
public class loginAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public loginAdmin() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		adminModel admin = new adminModel();
		
		admin.setAdminUserName(request.getParameter("user"));
		admin.setAdminPassword(request.getParameter("pass"));
		
		adminServices service = new adminServices();
		
		boolean state = service.validate(admin);
		
		if(state) {
			request.setAttribute("output", "Successfully Logged !");
		}else {
			request.setAttribute("output", "Login Failed !");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("adminLoggedPage.jsp");
		
		dis.forward(request, response);
	
	}

}
