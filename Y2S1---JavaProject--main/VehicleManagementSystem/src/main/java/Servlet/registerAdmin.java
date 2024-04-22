package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.adminModel;
import Services.adminServices;

@WebServlet("/registerAdmin")
public class registerAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public registerAdmin() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		adminModel adModel = new adminModel();
		
		adModel.setAdminName(request.getParameter("name"));
		adModel.setAdminAddress(request.getParameter("address"));
		adModel.setAdminEmail(request.getParameter("email"));
		adModel.setAdminGender(request.getParameter("sex"));
		adModel.setAdminUserName(request.getParameter("user"));
		adModel.setAdminPassword(request.getParameter("pass"));
				
		adminServices service = new adminServices();		
		
		service.insertData(adModel);
				
		RequestDispatcher dis = request.getRequestDispatcher("HomePage.jsp");
				
		dis.forward(request, response);
	}

}
