<%--
    Slip 30 - Question 2
    JSP: Accept two numbers, display addition using expression tag.
    Unit: UNIT 4 – JSP
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Addition Result</title>
<style>body{font-family:Arial;margin:50px}.ans{font-size:26px;color:#1a237e;font-weight:bold}</style>
</head>
<body>
<h2>Addition Result</h2>
<%
    double n1  = Double.parseDouble(request.getParameter("num1"));
    double n2  = Double.parseDouble(request.getParameter("num2"));
    double sum = n1 + n2;
%>
<p>Number 1 : <b><%= n1 %></b></p>
<p>Number 2 : <b><%= n2 %></b></p>
<hr/>
<p class="ans"><%= n1 %> + <%= n2 %> = <%= sum %></p>
<a href="index.html">&#8592; Calculate Again</a>
</body></html>
