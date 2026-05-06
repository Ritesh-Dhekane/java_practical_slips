<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 49 Q1: JSP+JDBC – Count total records in a table. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Count Records</title>
<style>body{font-family:Arial;margin:40px}.count{font-size:28px;color:#1a237e;font-weight:bold}</style></head>
<body><h2>Count Records in Table</h2>
<%
    String table = request.getParameter("table");
    if (table == null || table.isEmpty()) table = "student";
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); con=DriverManager.getConnection(url,u,p);
        st=con.createStatement(); rs=st.executeQuery("SELECT COUNT(*) FROM " + table);
        rs.next(); int count = rs.getInt(1);
%><p>Table: <b><%= table %></b></p><p class="count">Total Records: <%= count %></p>
<%}catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<form method="get">Table name: <input name="table" value="student"/>
<input type="submit" value="Count"/></form>
</body></html>
