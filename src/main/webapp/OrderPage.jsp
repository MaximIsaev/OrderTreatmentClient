<%@ page import="client_treatment.Process" %>
<%--
  Created by IntelliJ IDEA.
  User: Maxim_Isaev1
  Date: 11/18/2015
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Page</title>
</head>
<body>

<%
    Process process = new Process();
%>
<%
    if (!process.treatment(request)) {
%>

<h1 align="center">Reserve your ticket, please!</h1>

<form method="POST" action="OrderPage.jsp">
    <h2>Input your personal data:</h2>

    Name: <input type="text" size="20" name="User_name">

    Surname: <input type="text" size="20" name="User_surname">

    Patronymic:<input type="text" size="20" name="User_patronymic">
    Born date: <input type="date" size="20" name="User_born_date"><br>
    Sex:
    <input type="radio" checked name="sex" value="male">Male
    <input type="radio" name="sex" value="female">Female<br>
    <input type=submit value="Reserve" size="20">
</form>
<%
} else {%>
<%
    process.checkFields(out, request);%>
<%
    }
%>

</body>
</html>
