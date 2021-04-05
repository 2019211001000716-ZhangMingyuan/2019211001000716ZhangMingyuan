<%--
  Created by IntelliJ IDEA.
  User: MMMing
  Date: 2021/3/18
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<form method="post" action="/2019211001000716ZhangMingyuan_war_exploded/register">
    username : <input type="text" name="username" required><br/>
    password : <input type="password" name="password" required><br/>
    email : <input type="email" name="email" required><br/>
    birthday : <input type="date" name="date"required><br/>
    <input name="sex" type="radio" value="Male"/>Male
    <input name="sex" type="radio" value="Female"/>Female<br/>
    <input name="b1" type="submit" id="b1" value="Register" required><br/>
</form>
<%@include file="footer.jsp"%>

