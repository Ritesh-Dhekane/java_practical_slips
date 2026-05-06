<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 61 Q2: JSP+JDBC – Employees with salary > 30000. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>High Salary Employees</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#2e7d32;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}</style>
</head><body><h2>Employees with Salary &gt; 30,000</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    try (Connection con=DriverManager.getConnection(url,u,p);
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("SELECT * FROM emp WHERE salary > 30000")) {
%><table><tr><th>ID</th><th>Name</th><th>Dept</th><th>Salary</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getString("emp_id")%></td><td><%=rs.getString("name")%></td>
<td><%=rs.getString("dept")%></td><td><%=rs.getDouble("salary")%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}%>
</body></html>
