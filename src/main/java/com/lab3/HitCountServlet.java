package com.lab3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HitCountServlet", value = "/HitCountServlet")
public class HitCountServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ServletContext context = getServletContext();
        context.setAttribute("visitTimes", 0);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out =  response.getWriter();
        ServletContext context = getServletContext();
        int times = (Integer) context.getAttribute("visitTimes");
        times++;
        context.setAttribute("visitTimes", times);
        out.println("<html><head><title>Total Number of Hits</title></head>");
        out.println("<body><center><h1>Total Number of Hits</h1><h2>"+times+"</h2></center></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

