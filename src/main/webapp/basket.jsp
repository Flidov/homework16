<%@ page import="logic.User" %>
<%@ page import="logic.Order" %>
<%@ page import="java.util.Arrays" %>
<% User user = (User) session.getAttribute("user");%>
<% Order order = (Order) session.getAttribute("goods");%><%--
  Created by IntelliJ IDEA.
  User: Fioden
  Date: 09.09.2022
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Basket</title>
    <div style="text-align: center;">
        <h1>Dear <%=user.getName()%> , you order:
        </h1>
        <ol style="display: inline-block" >

            <%=order.listBasket()%>
        </ol>
        <h3> You total price <%= order.getTotalPrice()%></h3>
    </div>
</head>
<body>

</body>
</html>
