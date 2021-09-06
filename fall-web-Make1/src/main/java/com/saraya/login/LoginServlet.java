package com.saraya.login;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		UserValidation validate = new UserValidation();
		String nom = request.getParameter("nom");
		String pass = request.getParameter("pass");
		
		//System.out.println(nom);
		if(validate.userValidation(nom, pass)) {
			request.getSession().setAttribute(nom, pass);
			HttpSession session = request.getSession();
			session.setAttribute("nom", nom);
			session.setAttribute("pass", pass);
			response.sendRedirect("/car.do");
		 
		} else {
		request.setAttribute("errorMessage", "User name or password provided incorrect");
	request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		
	}
	}
}


