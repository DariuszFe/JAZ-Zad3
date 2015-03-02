
package com.example.servletjspdemo.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Rejestracja")
public class Rejestracja extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Rejestracja() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastName");
		String email = request.getParameter("email");
		String email2 = request.getParameter("email2");
		String prac = request.getParameter("prac");
		String zaj = request.getParameter("zaj");
		
		HttpSession session = request.getSession();
		
		if(name!=null && !name.equals(""))
		{
			session.setAttribute("name", name);
		}
		
			session.setAttribute("lastname", lastname);
			session.setAttribute("email", email);
			session.setAttribute("email2", email2);
			session.setAttribute("prac", prac);
			session.setAttribute("zaj", zaj);
		

		response.getWriter().println("ZAREJESTROWANO :");
		response.getWriter().println("Imie : " +  session.getAttribute("name"));
		response.getWriter().println("Nazwisko : " +  session.getAttribute("lastname"));
		response.getWriter().println("Email : " +  session.getAttribute("email"));
		response.getWriter().println("Pracodawca : " +  session.getAttribute("prac"));
		response.getWriter().println("Stanowisko : " +  session.getAttribute("zaj"));
		//response.sendRedirect("test.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		if(name!=null && !name.equals(""))
		{
			session.setAttribute("name", name);
			context.setAttribute("name", name);
		}

		response.getWriter().println("Hello " +  name + "!");
		response.getWriter().println("Hello from session " +  session.getAttribute("name") + "!");
		response.getWriter().println("Hello from context " +  context.getAttribute("name") + "!");
	
	}

}
