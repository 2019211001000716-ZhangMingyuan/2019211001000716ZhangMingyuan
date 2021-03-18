package com.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String Name=request.getParameter("Name");
        String Password=request.getParameter("Password");
        String Email=request.getParameter("Email");
        String BirthDay=request.getParameter("BirthDay");
        String Gender=request.getParameter("Gender");
        PrintWriter writer=response.getWriter();
        writer.println("<br>Name :"+Name);
        writer.println("<br>Password :"+Password);
        writer.println("<br>Email :"+Email);
        writer.println("<br>BirthDay :"+BirthDay);
        writer.println("<br>Gender :"+Gender);
        writer.close();
    }
}
