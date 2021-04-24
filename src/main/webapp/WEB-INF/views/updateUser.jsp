<%--
  Created by IntelliJ IDEA.
  User: MMMing
  Date: 2021/4/24
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<%
    User u=(User) session.getAttribute("user");
%>
<form method="post" action="updateUser">
    <tr> <td>Id:</td> <td><input type="text" name="id" value="<%=u.getId()%>" required><br/></td></tr>
    <input type="hidden" name="id" value="<%=u.getId()%>">
    username : <input type="text" name="username" required value="<%=u.getUsername()%>"> <br/>
    password : <input type="password" name="password" required value="<%=u.getPassword()%>"> <br/>
    email : <input type="email" name="email" required value="<%=u.getEmail()%>"> <br/>
    birthday : <input type="date" name="date"required value="<%=u.getBirthdate()%>"> <br/>
    <input name="gender" type="radio" value="Male" <%="Male".equals(u.getGender())?"checked":""%>/>Male
    <input name="gender" type="radio" value="Female" <%="Female".equals(u.getGender())?"checked":""%>/>Female<br/>
    <input type="submit" value="Save Changes"/><br/>
</form>
<%@include file="footer.jsp"%>
