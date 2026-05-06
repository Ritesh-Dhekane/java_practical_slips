<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Slip 38 Q1: JSP – Accept number, display factorial. Unit: UNIT 4 – JSP --%>
<%!
    long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
%>
<!DOCTYPE html>
<html><head><title>Factorial</title>
<style>body{font-family:Arial;margin:50px}.ans{font-size:22px;color:#1a237e;font-weight:bold}</style></head>
<body><h2>Factorial Calculator</h2>
<%
    String numStr = request.getParameter("num");
    if (numStr != null && !numStr.isEmpty()) {
        int num = Integer.parseInt(numStr);
        long result = factorial(num);
%>
<p>Number: <b><%= num %></b></p>
<p class="ans"><%= num %>! = <%= result %></p>
<br/><a href="factorial.jsp">Calculate Another</a>
<% } else { %>
<form method="post"><label>Enter a number: </label>
<input type="number" name="num" min="0" max="20" required/>
<input type="submit" value="Calculate Factorial"/></form>
<% } %>
</body></html>
