<%--
  Created by IntelliJ IDEA.
  User: MMMing
  Date: 2021/3/18
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="register">
Name<input type="text" name="Name" required><br/>
Password<input type="password" name="Password" required minlength="8"><br/>
Email<input type="email" name="Email"><br/>
BirthDay<input type="text" name="BirthDay" ><br/>
Gender
<input  type="radio" name="Gender" value="male">Male
<input  type="radio" name="Gender" value="female">Female<br/>
<input type="submit" value="register">
</form>
</body>
</html>
