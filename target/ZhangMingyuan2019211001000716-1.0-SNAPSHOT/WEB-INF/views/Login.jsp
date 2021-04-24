<%--
  Created by IntelliJ IDEA.
  User: MMMing
  Date: 2021/4/5
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>Login</h1>
<%
    if (!(request.getAttribute("message")==null)){
        out.println(request.getAttribute("message"));
    }
%>

<%
    Cookie[] allcookies=request.getCookies(); //give all cookies
    String username="",password="",rememberMeVal="";
    if(allcookies!=null) {
        for (Cookie c:allcookies) {
            if (c.getName().equals("cUsername")){
                username = c.getValue();
            }
            if (c.getName().equals("cPassword")){
                password = c.getValue();
            }
            if(c.getName().equals("cRememberMe")){
                rememberMeVal=c.getValue();
            }
        }
    }
%>

<form method="post" action="/2019211001000716ZhangMingyuan_war_exploded/Login">
    <table>
        <tr> <td>Username:</td> <td><input type="text" name="Username" value="<%=username%>" required><br/></td></tr>
        <tr> <td>password:</td> <td><input type="password" name="password" value="<%=password%>" required minlength="8"><br/></td></tr>
        <tr> <td><input type="checkbox" name="rememberMe" value="1" <%=rememberMeVal.equals("")?"checked":""%>>Remember Me<br/></td></tr>
        <tr> <td></td><td><input type="submit" value="Login"/></td>  </tr>

    </table>
</form>
<%@include file="footer.jsp"%>
