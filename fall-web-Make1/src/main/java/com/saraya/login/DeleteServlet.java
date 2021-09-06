package com.saraya.login;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saraya.model.Car;
import com.saraya.model.CarService;



@WebServlet(urlPatterns = "/delete.do")
public class DeleteServlet extends HttpServlet {
	CarService cs = new CarService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("ide"));
		cs.deleteCar(id);
		response.sendRedirect("/car.do");
	}
	
}



