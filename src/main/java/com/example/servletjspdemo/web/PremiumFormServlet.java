package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletjspdemo.domain.User;

@WebServlet("/premium_action")
public class PremiumFormServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<a href=\"index.jsp\">Strona glowna</a>");
		
		String username = (String) request.getSession().getAttribute("username");
		
		if (username == null) {
			out.println("<p>Musisz sie zalogowac aby zobaczyc strone</p>");
			out.println("</html></body>");
			out.close();
			return;
		}
		
		if (!username.equals("admin")) {
			out.println("<p>Strona dostepna tylko dla administratora</p>");
			out.println("</html></body>");
			out.close();
			return;
		}
		
		@SuppressWarnings("unchecked")
		List<User> userList = (List<User>) request.getServletContext().getAttribute("userList");
		
		if (userList != null) {
			for (User user : userList) {
				if (user.getUsername().equals(request.getParameter("username"))) {
					user.setPremium(!user.isPremium());
					
					out.println("<p>Konto premium zostalo stworzone</p>");
					out.println("</html></body>");
					out.close();
					return;
				}
			}
		}

		out.println("<p>Nie znaleziono uzytkownika o takim loginie</p>");
		out.println("</html></body>");
		out.close();
	}
	
}
