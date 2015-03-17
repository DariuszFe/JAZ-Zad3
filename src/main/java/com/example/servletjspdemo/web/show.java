
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

@WebServlet("/show")
public class show extends HttpServlet {

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

		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("showUser.jsp").forward(request, response);


		
	}
}
