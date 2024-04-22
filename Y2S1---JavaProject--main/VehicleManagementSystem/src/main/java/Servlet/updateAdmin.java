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

/**
 * Servlet implementation class updateAdmin
 */
@WebServlet("/updateAdmin")
public class updateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		adminModel admin = new adminModel();

		admin.setAdminName(request.getParameter("name"));
		admin.setAdminAddress(request.getParameter("address"));
		admin.setAdminEmail(request.getParameter("sex"));
		admin.setAdminGender(request.getParameter("email"));
		admin.setAdminUserName(request.getParameter("user"));
		admin.setAdminPassword(request.getParameter("pass"));
		
		adminServices service = new adminServices();
		
		boolean state = service.updateData(admin);
		
		if(state) {
			request.setAttribute("output", "Updated Successfully !");
		}else {
			request.setAttribute("output", "Error !");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("editAdmin.jsp");
		
		dis.forward(request, response);
	}

}
