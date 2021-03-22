package com.ZhangMingyuan.week4;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ConfigDemoServlet",urlPatterns="/config",initParams={
        @WebInitParam(name="name",value="ZhangMingyuan"),
        @WebInitParam(name="student-id",value="2019211001000716")})

public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer=response.getWriter();
        writer.println("name:"+getServletConfig().getInitParameter("name"));
        writer.println("student-id:"+getServletConfig().getInitParameter("student-id"));
    }
}
