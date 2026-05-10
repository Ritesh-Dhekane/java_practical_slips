<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.time.LocalDateTime,java.time.format.DateTimeFormatter" %>
<%@ include file="header.jspf" %>
<%
    request.setCharacterEncoding("UTF-8");

    String studentName = request.getParameter("studentName");
    String city = request.getParameter("city");
    String marksText = request.getParameter("marks");
    String technology = request.getParameter("technology");

    int marks = 0;
    try {
        marks = Integer.parseInt(marksText);
    } catch (NumberFormatException ex) {
        marks = 0;
    }

    String result;
    if (marks >= 75) {
        result = "Distinction";
    } else if (marks >= 60) {
        result = "First Class";
    } else if (marks >= 40) {
        result = "Pass";
    } else {
        result = "Fail";
    }

    session.setAttribute("studentName", studentName);
    session.setAttribute("city", city);
    session.setAttribute("marks", marks);
    session.setAttribute("technology", technology);
    session.setAttribute("result", result);
    session.setAttribute("processedAt", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Super Slip - Process</title>
</head>
<body>
<div class="wrapper">
    <h1>JSP Processing Page</h1>
    <p>This page mixes scriptlets, expressions, and session attributes to prepare data for the next page.</p>

    <table class="result-table">
        <tr><th>Student Name</th><td><%= studentName %></td></tr>
        <tr><th>City</th><td><%= city %></td></tr>
        <tr><th>Marks</th><td><%= marks %></td></tr>
        <tr><th>Technology</th><td><%= technology %></td></tr>
        <tr><th>Result</th><td><%= result %></td></tr>
    </table>

    <div class="actions">
        <a class="link-btn" href="summary.jsp">Open summary.jsp</a>
        <a class="link-btn" href="index.jsp">Back to home</a>
    </div>
</div>
</body>
</html>
