<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Slip 77 Q1: JSP arithmetic operations. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Arithmetic Operations</title>
<style>body{font-family:Arial;margin:40px}.result{font-size:24px;color:#1565c0}</style>
</head><body>
    <h2>Arithmetic Operations</h2>
    <form method="post">
        Number 1: <input type="number" name="n1" required/><br/><br/>
        Number 2: <input type="number" name="n2" required/><br/><br/>
        <input type="submit" value="Calculate"/>
    </form>
    <hr/>
<%
    String str1 = request.getParameter("n1");
    String str2 = request.getParameter("n2");
    if (str1 != null && str2 != null) {
        double n1 = Double.parseDouble(str1);
        double n2 = Double.parseDouble(str2);
%>
    <div class="result">
        <p>Addition (+): <%= n1 + n2 %></p>
        <p>Subtraction (-): <%= n1 - n2 %></p>
        <p>Multiplication (*): <%= n1 * n2 %></p>
        <p>Division (/): <%= n2 != 0 ? (n1 / n2) : "Cannot divide by zero" %></p>
    </div>
<% } %>
</body></html>
