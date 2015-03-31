package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletjspdemo.domain.User;

@WebServlet("/register_action")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext ctx = config.getServletContext();

		if (ctx.getAttribute("userList") == null) {
			List<User> userList = new ArrayList<User>();
			
			User user = new User();
			user.setUsername("admin");
			user.setPassword("admin");
			user.setEmail("admin");
			
			userList.add(user);
			
			ctx.setAttribute("userList", userList);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<a href=\"index.jsp\">Strona glowna</a>");

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String passwordConfirm = request.getParameter("confirm_password");
		String email = request.getParameter("email");
		
		if (username.isEmpty() || password.isEmpty() || passwordConfirm.isEmpty() || email.isEmpty()) {
			out.println("<p>Wszystkie pola musza byc wypelnione</p>");
			out.println("</html></body>");
			out.close();
			return;
		}
		
		if (!password.equals(passwordConfirm)) {
			out.println("<p>Haslo musi byc takie same</p>");
			out.println("</html></body>");
			out.close();
			return;
		}
		
		@SuppressWarnings("unchecked")
		List<User> userList = (List<User>) request.getServletContext().getAttribute("userList");
		
		for (User user : userList) {
			if (user.getUsername().equals(username)) {
				out.println("<p>Uzytkownik o takim loginie juz istnieje</p>");
				out.println("</html></body>");
				out.close();
				return;
			}
		}
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setPremium(false); 
		
		userList.add(user);
		
		out.println("<p>Konto zostalo stworzone</p>");
		out.println("</html></body>");
		out.close();
	}
}
