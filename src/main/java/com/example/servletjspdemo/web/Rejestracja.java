
package com.example.servletjspdemo.web;

import com.example.servletjspdemo.domain.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Rejestracja")
public class Rejestracja extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ServletContext ctx;
	private List<User> UserList = new ArrayList<User>();

	@Override
	public void init(ServletConfig config) throws ServletException {

		ctx = config.getServletContext();

		if (ctx.getAttribute("UserList") != null)
			UserList = (List<User>) ctx.getAttribute("UserList");
		else
			ctx.setAttribute("UserList", UserList);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User registration = new User();

		registration.setLogin(request.getParameter("login"));
		registration.setPassword(request.getParameter("password"));
		registration.setEmail(request.getParameter("email"));

		if (UserList.size() >= 5) {
			response.sendRedirect("error_registration_unavailable.jsp");
			return;
		}

		if (UserList.contains(registration)) {
			response.sendRedirect("error_registration_exists.jsp");
			return;
		}

		UserList.add(registration);

		response.sendRedirect("registration_confirm.jsp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (UserList.size() >= 5) {
			response.sendRedirect("error_registration_unavailable.jsp");
			return;
		}

		request.getRequestDispatcher("rejestracja.jsp").forward(request, response);
	}
}
