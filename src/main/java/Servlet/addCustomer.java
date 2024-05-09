package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CustomerModel;
import Model.staffModel;
import Services.customerSevices;

/**
 * Servlet implementation class addCustomer
 */
@WebServlet("/addCustomer")
public class addCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addCustomer() {
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
		CustomerModel customer = new CustomerModel();
		
		customer.setCustName(request.getParameter("custName"));
		customer.setCustAddress(request.getParameter("custAddress"));
		customer.setCustEmail(request.getParameter("custEmail"));
		customer.setCustGender(request.getParameter("custGender"));
		customer.setCustUserName(request.getParameter("custUserName"));
		customer.setCustPassword(request.getParameter("custPassword"));
		
		customerSevices service = new customerSevices();
		
		service.insertData(customer);
				
		RequestDispatcher dis = request.getRequestDispatcher("HomePage.jsp");
				
		dis.forward(request, response);
	}

}
