package com.example.servletjspdemo.filter;

import com.example.servletjspdemo.domain.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

    private ServletContext context;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;

        HttpSession session = httpRequest.getSession(false);
        User user = (User) session.getAttribute("user");

      
        	
        	if (user == null){

            // TODO: Sprawdzanie warunków i odpowiednie przekierowania zgodnie z intrukcją
            // TODO: przekierowanie za pomocą httpResponse.sendRedirect("/login"); z odpowiednim plikiem

            filterChain.doFilter(servletRequest, servletResponse);
        }

        httpResponse.sendRedirect("/login");
    }

    @Override
    public void destroy() {

    }
}
