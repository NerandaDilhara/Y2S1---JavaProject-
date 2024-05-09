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
 * Servlet implementation class showStaffByAdmin
 */
@WebServlet("/showStaffByAdmin")
public class showStaffByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showStaffByAdmin() {
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
	    manageStaffByAdmin service = new manageStaffByAdmin();
	    
	    ArrayList<ArrayList<String>> staffDetails = service.showData(staff);
	    
	    request.setAttribute("output", staffDetails);
		request.setAttribute("len", staffDetails.size());

	    RequestDispatcher dis = request.getRequestDispatcher("showStaffByAdmin.jsp");
	    dis.forward(request, response);
	    
	    
	}


}
