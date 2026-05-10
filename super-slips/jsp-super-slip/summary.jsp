<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jspf" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Super Slip - Summary</title>
</head>
<body>
<div class="wrapper">
    <h1>JSP Summary Page</h1>
    <p>This page reads values from the session and completes the form-to-JSP-to-JSP workflow.</p>

    <div class="info">
        JSPs are translated into servlets by the container. That is why they can use request, response, session, and Java expressions.
    </div>

    <table class="result-table">
        <tr><th>Student Name</th><td><%= session.getAttribute("studentName") %></td></tr>
        <tr><th>City</th><td><%= session.getAttribute("city") %></td></tr>
        <tr><th>Marks</th><td><%= session.getAttribute("marks") %></td></tr>
        <tr><th>Technology</th><td><%= session.getAttribute("technology") %></td></tr>
        <tr><th>Result</th><td><%= session.getAttribute("result") %></td></tr>
        <tr><th>Processed At</th><td><%= session.getAttribute("processedAt") %></td></tr>
    </table>

    <div class="actions">
        <a class="link-btn" href="index.jsp">Submit another record</a>
    </div>
</div>
</body>
</html>
