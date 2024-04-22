package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.StudentModel;
import Services.studentServices;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public registerServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentModel stdModel = new StudentModel();
		
		stdModel.setStdName(request.getParameter("name"));
		stdModel.setStdEmail(request.getParameter("email"));
		stdModel.setStdUser(request.getParameter("user"));
		stdModel.setStdPass(request.getParameter("pass"));
		
		studentServices service = new studentServices();
		
		service.insertData(stdModel);
		
		RequestDispatcher dis = request.getRequestDispatcher("HomePage.jsp");
		
		dis.forward(request, response);
	}

}
