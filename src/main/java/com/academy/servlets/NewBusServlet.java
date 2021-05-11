package com.academy.servlets;

import com.academy.utils.SqlConnect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/bus/add")
public class NewBusServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String model = req.getParameter("busModel");
        int company = Integer.parseInt(req.getParameter("company"));

        SqlConnect.addBus(model, company);

        req.getRequestDispatcher("/sql.jsp").forward(req, resp);
    }
}
