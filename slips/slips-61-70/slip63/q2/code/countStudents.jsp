<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 63 Q2: JSP+JDBC – Count total records in student table. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Count Students</title>
<style>body{font-family:Arial;margin:40px}.count{font-size:32px;color:#c62828;font-weight:bold}</style>
</head><body><h2>Total Students in Database</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    try (Connection con=DriverManager.getConnection(url,u,p);
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("SELECT COUNT(*) FROM student")) {
         
         rs.next();
         int count = rs.getInt(1);
%>
    <p class="count"><%= count %> Students found.</p>
<%}catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}%>
</body></html>
