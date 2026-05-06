<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Slip 32 Q2: JSP – Accept salary, display annual salary. Unit: UNIT 4 – JSP --%>
<!DOCTYPE html>
<html><head><title>Annual Salary</title>
<style>body{font-family:Arial;margin:50px}.ans{font-size:22px;color:#1a237e;font-weight:bold}</style></head>
<body><h2>Annual Salary Calculator</h2>
<%
    String salStr = request.getParameter("salary");
    if (salStr != null && !salStr.isEmpty()) {
        double monthly = Double.parseDouble(salStr);
        double annual  = monthly * 12;
%>
<p>Monthly Salary: <b>Rs. <%= monthly %></b></p>
<p class="ans">Annual Salary: Rs. <%= annual %></p>
<% } else { %>
<form method="post"><label>Enter Monthly Salary: </label>
<input type="number" name="salary" required/> <input type="submit" value="Calculate"/></form>
<% } %>
</body></html>
