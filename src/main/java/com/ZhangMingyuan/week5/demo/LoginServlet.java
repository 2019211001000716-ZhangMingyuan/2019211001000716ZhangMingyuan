package com.ZhangMingyuan.week5.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        super.init();
        con=(Connection) getServletContext().getAttribute("con");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username=request.getParameter("Username");
        String password=request.getParameter("password");
        String sql="select * from Usertable where username=? and password=?";
        PreparedStatement pstmt= null;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,Username);
            pstmt.setString(2,password);
            ResultSet rs= pstmt.executeQuery();
            PrintWriter out=response.getWriter();
            if(rs.next()){
                /*out.println("Login Success!!!");
                out.println("Welcome,"+Username);*/
                request.setAttribute("id",rs.getInt("id"));
                request.setAttribute("username",rs.getString("username"));
                request.setAttribute("password",rs.getString("password"));
                request.setAttribute("email",rs.getString("email"));
                request.setAttribute("gender",rs.getString("gender"));
                request.setAttribute("Date",rs.getDate("Date"));
                request.getRequestDispatcher("userinfo.jsp").forward(request,response);
            }else {
                //out.println("Login Error!!!")
                request.setAttribute("message","Username or password Error!!!");
                request.getRequestDispatcher("Login.jsp").forward(request,response);
                ;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
