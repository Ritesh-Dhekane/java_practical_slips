<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Slip 48 Q1: JSP – Student result with total and percentage. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Student Result</title>
<style>body{font-family:Arial;margin:40px}table{border-collapse:collapse}
th{background:#1565c0;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.res{font-size:20px;color:#2e7d32;font-weight:bold}</style></head>
<body><h2>Student Result Card</h2>
<%
    String n = request.getParameter("name");
    if (n != null) {
        int m1=Integer.parseInt(request.getParameter("m1")),m2=Integer.parseInt(request.getParameter("m2")),
            m3=Integer.parseInt(request.getParameter("m3")),m4=Integer.parseInt(request.getParameter("m4")),
            m5=Integer.parseInt(request.getParameter("m5"));
        int total=m1+m2+m3+m4+m5; double pct=(total/500.0)*100;
%>
<table><tr><th colspan="2"><%=n%>'s Result</th></tr>
<tr><td>Sub 1</td><td><%=m1%></td></tr><tr><td>Sub 2</td><td><%=m2%></td></tr>
<tr><td>Sub 3</td><td><%=m3%></td></tr><tr><td>Sub 4</td><td><%=m4%></td></tr>
<tr><td>Sub 5</td><td><%=m5%></td></tr></table>
<p class="res">Total: <%=total%>/500 | Percentage: <%=String.format("%.2f",pct)%>%</p>
<% } else { %>
<form method="post">Name:<input name="name"/><br/>
Sub1:<input name="m1" type="number"/> Sub2:<input name="m2" type="number"/>
Sub3:<input name="m3" type="number"/> Sub4:<input name="m4" type="number"/>
Sub5:<input name="m5" type="number"/><br/><input type="submit" value="Show Result"/></form>
<% } %></body></html>
