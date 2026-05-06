<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Slip 33 Q2: JSP – Accept student marks, display total and percentage. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Student Marks</title>
<style>body{font-family:Arial;margin:50px}.res{font-size:20px;color:#2e7d32;font-weight:bold}</style></head>
<body><h2>Student Marks Calculator</h2>
<%
    String s1 = request.getParameter("m1");
    if (s1 != null) {
        double m1=Double.parseDouble(s1), m2=Double.parseDouble(request.getParameter("m2")),
               m3=Double.parseDouble(request.getParameter("m3"));
        double total=m1+m2+m3, pct=(total/300)*100;
%>
<p>Marks: <%= m1 %>, <%= m2 %>, <%= m3 %></p>
<p class="res">Total: <%= total %>/300 | Percentage: <%= String.format("%.2f",pct) %>%</p>
<% } else { %>
<form method="post">
Sub 1: <input type="number" name="m1" required/><br/>
Sub 2: <input type="number" name="m2" required/><br/>
Sub 3: <input type="number" name="m3" required/><br/><br/>
<input type="submit" value="Calculate"/>
</form>
<% } %>
</body></html>
