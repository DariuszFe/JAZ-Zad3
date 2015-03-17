package com.example.servletjspdemo.web;

import com.example.servletjspdemo.domain.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by robert on 17.03.15.
 */
@WebServlet("/login")
public class LoginSevlet extends HttpServlet {

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

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        User checkUser = new User(httpServletRequest.getParameter("login"), httpServletRequest.getParameter("password"));

        for(User u : UserList) {
            if(u.equals(checkUser)) {
                HttpSession session = httpServletRequest.getSession();
                session.setAttribute("user", u);
                httpServletResponse.sendRedirect("profile.jsp");
            }
        }

        httpServletResponse.sendRedirect("loginError.jsp");
    }
}
