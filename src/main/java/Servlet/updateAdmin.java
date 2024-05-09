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

@WebServlet("/updateAdmin")
public class updateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public updateAdmin() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		adminModel admin = new adminModel();

		admin.setAdminName(request.getParameter("name"));
		admin.setAdminAddress(request.getParameter("address"));
		admin.setAdminGender(request.getParameter("sex"));
		admin.setAdminEmail(request.getParameter("email"));
		admin.setAdminUserName(request.getParameter("user"));
		admin.setAdminPassword(request.getParameter("pass"));
		
		adminServices service = new adminServices();
		
		boolean state = service.updateData(admin);
		
		if(state) {
			request.setAttribute("output2", "Updated Successfully !");
		}else {
			request.setAttribute("output2", "Updation Error !");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("updateAdmin.jsp");
		
		dis.forward(request, response);
	}

}
