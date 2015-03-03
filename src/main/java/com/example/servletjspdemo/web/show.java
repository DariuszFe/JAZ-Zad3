
package com.example.servletjspdemo.web;

import com.example.servletjspdemo.domain.ConferenceRegistration;

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
	private List<ConferenceRegistration> conferenceRegistrationList = new ArrayList<ConferenceRegistration>();

	@Override
	public void init(ServletConfig config) throws ServletException {

		ctx = config.getServletContext();

		if (ctx.getAttribute("conferenceRegistrationList") != null)
			conferenceRegistrationList = (List<ConferenceRegistration>) ctx.getAttribute("conferenceRegistrationList");
		else
			ctx.setAttribute("conferenceRegistrationList", conferenceRegistrationList);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("showPerson.jsp").forward(request, response);


		
	}
}
