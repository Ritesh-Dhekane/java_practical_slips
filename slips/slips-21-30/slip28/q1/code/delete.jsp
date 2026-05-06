<%--
    Slip 28 - Question 1
    JSP + JDBC: Delete a Student record by roll number.
    Concepts: JSP, JDBC, SQL DELETE, PreparedStatement
    Unit: UNIT 4 – JSP, JDBC
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Student</title>
    <style>
        body{font-family:Arial;margin:30px;background:#fce4ec}
        .card{background:white;padding:25px;border-radius:8px;width:400px;box-shadow:0 2px 8px rgba(0,0,0,0.1)}
        h2{color:#c62828}.ok{color:green}.err{color:red}
    </style>
</head>
<body><div class="card">
<h2>Delete Student Record</h2>
<%
    String url    = "jdbc:mysql://localhost:3306/college_db";
    String dbUser = "root";
    String dbPass = "root";

    Connection        con = null;
    PreparedStatement ps  = null;

    try {
        int rollNo = Integer.parseInt(request.getParameter("rollNo"));
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, dbUser, dbPass);

        ps = con.prepareStatement("DELETE FROM student WHERE roll_no = ?");
        ps.setInt(1, rollNo);
        int rows = ps.executeUpdate();

        if (rows > 0) {
%>
<p class="ok">&#10004; Record with Roll No <b><%= rollNo %></b> deleted successfully.</p>
<%
        } else {
%>
<p class="err">&#10006; No record found with Roll No <b><%= rollNo %></b>.</p>
<%
        }
    } catch (NumberFormatException e) {
        out.println("<p class="err">Invalid roll number format.</p>");
    } catch (ClassNotFoundException e) {
        out.println("<p class="err">Driver error: " + e.getMessage() + "</p>");
    } catch (SQLException e) {
        out.println("<p class="err">SQL error: " + e.getMessage() + "</p>");
    } finally {
        try { if (ps  != null) ps.close();  } catch(Exception e) {}
        try { if (con != null) con.close(); } catch(Exception e) {}
    }
%>
<br/><a href="index.html">&#8592; Delete Another</a>
</div></body></html>
