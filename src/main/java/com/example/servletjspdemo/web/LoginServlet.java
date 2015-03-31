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

@WebServlet("/login_action")
public class LoginServlet extends HttpServlet {

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
		
		if (username.isEmpty() || password.isEmpty()) {
			out.println("<p>Wszystkie pola musza byæ zapelnione</p>");
			out.println("</html></body>");
			out.close();
			return;
		}
		
		@SuppressWarnings("unchecked")
		List<User> userList = (List<User>) request.getServletContext().getAttribute("userList");
		
		if (userList != null) {
			for (User user : userList) {
				if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
					request.getSession().setAttribute("username", username);
					
					out.println("<p>Logowanie siê powiodlo</p>");
					out.println("</html></body>");
					out.close();
					
					return;
				}
			}
		}
		
		Integer failedLogins = (Integer) request.getSession().getAttribute("failedLogins");
		if (failedLogins == null) {
			failedLogins = 1;
			request.getSession().setAttribute("failedLogins", failedLogins);
		} else {
			request.getSession().setAttribute("failedLogins", failedLogins + 1);
		}
		
		out.println("<p>Login albo haslo s¹ nieprawidlowe</p>");
		out.println("</html></body>");
		out.close();
	}
	
}
