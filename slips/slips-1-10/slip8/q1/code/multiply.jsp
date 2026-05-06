<%--
    Slip 8 - Question 1
    JSP page: accept two numbers, multiply them, display result using JSP expression tag.
    Concepts: JSP, Scriptlet, Expression Tag, Arithmetic
    Unit: UNIT 4 – JSP
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Multiplication Result</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 50px; background: #e3f2fd; }
        .result { background: white; padding: 30px; border-radius: 8px; width: 350px;
                  box-shadow: 0 2px 8px rgba(0,0,0,0.15); }
        h2 { color: #1565C0; }
        .ans { font-size: 24px; color: #2e7d32; font-weight: bold; }
    </style>
</head>
<body>
<div class="result">
    <h2>Multiplication Result</h2>

    <%
        // Scriptlet: read parameters and compute result
        String s1 = request.getParameter("num1");
        String s2 = request.getParameter("num2");

        double num1   = Double.parseDouble(s1);
        double num2   = Double.parseDouble(s2);
        double result = num1 * num2;
    %>

    <p>Number 1 : <b><%= num1 %></b></p>
    <p>Number 2 : <b><%= num2 %></b></p>
    <hr/>
    <p class="ans"><%= num1 %> &times; <%= num2 %> = <%= result %></p>

    <br/>
    <a href="index.html">&#8592; Calculate Again</a>
</div>
</body>
</html>
