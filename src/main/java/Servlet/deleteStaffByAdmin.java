package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.adminModel;
import Model.staffModel;
import Services.adminServices;
import Services.manageStaffByAdmin;

/**
 * Servlet implementation class deleteStaffByAdmin
 */
@WebServlet("/deleteStaffByAdmin")
public class deleteStaffByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteStaffByAdmin() {
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
		staffModel staff = new staffModel();
		
		staff.setStaffUserName(request.getParameter("user"));
		staff.setStaffPassword(request.getParameter("pass"));
		
		manageStaffByAdmin service = new manageStaffByAdmin();
		
		boolean state = service.deleteData(staff);
		
		if(state) {
			request.setAttribute("output", "Deleted Successfully !");
		}else {
			request.setAttribute("output", "Error detected !");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("adminLoggedPage.jsp");
		
		dis.forward(request, response);
	}

}
