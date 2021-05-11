package com.academy.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/login")
public class UserFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String login = (String) servletRequest.getParameter("login");
        String password = (String) servletRequest.getParameter("password");

        if (login.equals("a") && password.equals("a")) {
            servletRequest.setAttribute("isLogged", "true");
        } else {
            servletRequest.setAttribute("isLogged", "false");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
