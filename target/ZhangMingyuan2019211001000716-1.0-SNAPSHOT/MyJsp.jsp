<%--
  Created by IntelliJ IDEA.
  User: MMMing
  Date: 2021/3/14
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<a href="index.jsp">go to ecjtu</a> <!-- method is GET -->
<form method="post">
    Name:<input type="text" name="name"><br/>
    ID:<input type="text" name="id"><br/>
    <input type="submit" value="Send data to server"/>
</form>
<%@include file="footer.jsp"%>
