<%--
  Created by IntelliJ IDEA.
  User: Fioden
  Date: 09.09.2022
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="logic.User" %>
<% User user =(User) session.getAttribute("user");%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello </title>
    <div style="text-align: center;">
        <h1>Hello <%=user.getName()%>
        </h1>
        <h4>make you order</h4>
        <form action="Shop" method="get" >
        <p><label>

            <select multiple name="goods" >
                <option value="book1 5$">book1 5 $</option>
                <option value="book2 4$">book2 4 $</option>
                <option value="book3 10$">book3 10 $</option>
                <option value="book4 7$">book4 7 $</option>
            </select>
        </label></p>
        <p><input type="submit" value="send"></p>
        </form>
    </div>
</head>
<body>

</body>
</html>
