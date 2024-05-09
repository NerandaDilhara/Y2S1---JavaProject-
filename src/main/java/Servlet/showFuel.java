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
import Model.fuelModel;
import Services.fuelServices;



@WebServlet("/showFuel")
public class showFuel extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public showFuel() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		fuelModel model = new fuelModel();
		fuelServices service = new fuelServices();
		
		ArrayList fuelDetails = new ArrayList();
		
		fuelDetails = service.showData(model);
		
		if(fuelDetails != null) {
			request.setAttribute("output", fuelDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher(".jsp");

			dis.forward(request, response);
		}else if(fuelDetails == null) {
			request.setAttribute("output", "Error !");
			
			RequestDispatcher dis = request.getRequestDispatcher(".jsp");
			
			dis.forward(request, response);
		}
	}

}
