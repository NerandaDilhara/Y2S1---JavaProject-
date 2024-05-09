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
 * Servlet implementation class addStaffByAdmin
 */
@WebServlet("/addStaffByAdmin")
public class addStaffByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStaffByAdmin() {
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
		
		staff.setStaffName(request.getParameter("staffName"));
		staff.setStaffAddress(request.getParameter("staffAddress"));
		staff.setStaffEmail(request.getParameter("staffEmail"));
		staff.setStaffGender(request.getParameter("staffGender"));
		staff.setStaffUserName(request.getParameter("staffUserName"));
		staff.setStaffPassword(request.getParameter("staffPassword"));
		
		manageStaffByAdmin service = new manageStaffByAdmin();
		
		service.insertData(staff);
				
		RequestDispatcher dis = request.getRequestDispatcher("adminLoggedPage.jsp");
				
		dis.forward(request, response);
		
		doGet(request, response);
	}

}
