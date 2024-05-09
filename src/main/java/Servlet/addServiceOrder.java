package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.vehicleServiceModel;
import Services.vehicleService;


@WebServlet("/addServiceOrder")
public class addServiceOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public addServiceOrder() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		vehicleServiceModel vehicle = new vehicleServiceModel();
		
		vehicle.setCustName(request.getParameter("custName"));
		vehicle.setCustCity(request.getParameter("custCity"));
		vehicle.setCustPhone(request.getParameter("custPhone"));
		vehicle.setCustUserName(request.getParameter("custUserName"));
		vehicle.setCustPassword(request.getParameter("custPassword"));
		vehicle.setServiceType(request.getParameter("serviceType"));
		vehicle.setVehicleBrand(request.getParameter("vehicleBrand"));
		vehicle.setBodyType(request.getParameter("bodyType"));
		vehicle.setManufYear(request.getParameter("manufYear"));
		vehicle.setServiceDescription(request.getParameter("serviceDescription"));
	
		vehicleService service = new vehicleService();
				
		service.insertData(vehicle);
						
		RequestDispatcher dis = request.getRequestDispatcher("HomePage.jsp");
						
		dis.forward(request, response);
	}

}
