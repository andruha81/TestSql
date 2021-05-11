package com.academy.servlets;

import com.academy.utils.SqlConnect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/company/add")
public class NewCompanyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("companyName");
        String fullName = req.getParameter("companyFullName");
        String address = req.getParameter("companyAddress");

        SqlConnect.addCompany(name, fullName, address);

        req.getRequestDispatcher("/sql.jsp").forward(req, resp);
    }
}
