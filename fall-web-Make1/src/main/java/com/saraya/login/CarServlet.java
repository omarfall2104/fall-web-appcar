package com.saraya.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.CarService;

@WebServlet(urlPatterns = "/car.do")
public class CarServlet extends HttpServlet {
	
	CarService cs = new CarService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("cars", cs.getAllCars() );
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int year = Integer.parseInt(request.getParameter("yr"));
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		String image = request.getParameter("im");
		
	   cs.addCar(year, make, model, image);
	   response.sendRedirect("/car.do");

	}


}
