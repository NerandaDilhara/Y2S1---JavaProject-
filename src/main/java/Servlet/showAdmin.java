package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.adminModel;
import Services.adminServices;


@WebServlet("/showAdmin")
public class showAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public showAdmin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		adminModel admin = new adminModel();
		adminServices service = new adminServices();
		
		admin.setAdminUserName(request.getParameter("user"));
		admin.setAdminPassword(request.getParameter("pass"));
		
		ArrayList<String> adminDetails = new ArrayList<>();
		
		adminDetails = service.showData(admin);
		
		if(adminDetails != null) {
			request.setAttribute("output", adminDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("updateAdmin.jsp");

			dis.forward(request, response);
		}else if(adminDetails == null) {
			request.setAttribute("output", "Error !");
			
			RequestDispatcher dis = request.getRequestDispatcher("editAdmin.jsp");
			
			dis.forward(request, response);
		}
		
		
	}

}
