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
import Model.staffModel;
import Services.adminServices;
import Services.manageStaffByAdmin;

/**
 * Servlet implementation class updateStaffByAdmin
 */
@WebServlet("/updateStaffByAdmin")
public class updateStaffByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateStaffByAdmin() {
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

		staff.setStaffUserName(request.getParameter("staffUserName"));
		
		manageStaffByAdmin service = new manageStaffByAdmin();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list = service.showData2(staff);
		
		if(list == null) {
			request.setAttribute("output", "Enter Valid Staff Username");
			RequestDispatcher dis = request.getRequestDispatcher("loginAdminToUpdateStaff.jsp");
			dis.forward(request, response);
		}else {
			request.setAttribute("output", list);
			RequestDispatcher dis = request.getRequestDispatcher("updateStaffByAdmin.jsp");
			dis.forward(request, response);
		}

	}

}
