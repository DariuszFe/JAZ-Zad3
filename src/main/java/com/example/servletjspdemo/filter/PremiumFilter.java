package com.example.servletjspdemo.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.servletjspdemo.domain.User;

@WebFilter("/premium.jsp")
public class PremiumFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpSession session = ((HttpServletRequest) request).getSession();
		String username = (String) session.getAttribute("username");

		if (username == null) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<a href=\"index.jsp\">Strona glowna</a>");
			out.println("<p>Musisz sie zalogowac</p>");
			out.println("</html></body>");
			out.close();
			return;
		}
		
		if (username.equals("admin")) {
			chain.doFilter(request, response);
			return;
		} else {
			@SuppressWarnings("unchecked")
			List<User> userList = (List<User>) request.getServletContext().getAttribute("userList");
			
			for (User user : userList) {
				if (username.equals(user.getUsername()) && user.isPremium()) {
					chain.doFilter(request, response);
					return;
				}
			}
		} 
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<a href=\"index.jsp\">Strona glowna</a>");
		out.println("<p>Musisz posiadac konto premium aby zobaczyc ta strone</p>");
		out.println("</html></body>");
		out.close();
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
