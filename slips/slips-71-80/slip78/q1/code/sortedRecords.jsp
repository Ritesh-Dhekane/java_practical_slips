<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 78 Q1: JSP+JDBC – Fetch records sorted. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Sorted Student Records</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#4527a0;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}</style>
</head><body><h2>Student Records (Sorted by Name)</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    try (Connection con=DriverManager.getConnection(url,u,p);
         Statement st=con.createStatement();
         // ORDER BY name ASC fetches sorted records
         ResultSet rs=st.executeQuery("SELECT * FROM student ORDER BY name ASC")) {
%><table><tr><th>Roll No</th><th>Name</th><th>Course</th><th>Marks</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getInt(4)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style='color:red'>"+e.getMessage()+"</p>");}%>
</body></html>
