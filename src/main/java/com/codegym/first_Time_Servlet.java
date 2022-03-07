package com.codegym;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "first_Time_Servlet", value = "/first_Time_Servlet")
public class first_Time_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("discount"));
        double discountAmount = price * discount * 0.01;
        double discountPrice = price - discountAmount;
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<html>");
        printWriter.println("<h3>Discount Amount = " + discountAmount + "</h3>");
        printWriter.println("<h3>Discount Price = " + discountPrice + "</h3>");
        printWriter.write("</html>");
        printWriter.close();
    }
}
