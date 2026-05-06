<%--
    Slip 20 - Question 1
    JSP + JDBC: Insert multiple employee records into a database table.
    Concepts: JSP, JDBC, SQL INSERT, PreparedStatement
    Unit: UNIT 4 – JSP, JDBC
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Employee Records</title>
    <style>
        body { font-family: Arial; margin: 30px; background: #f5f5f5; }
        h2 { color: #1565c0; }
        table { border-collapse: collapse; width: 70%; background: white; margin-top: 10px; }
        th { background: #1565c0; color: white; padding: 10px; text-align: left; }
        td { border: 1px solid #ddd; padding: 8px 12px; }
        .ok  { color: green; } .err { color: red; }
    </style>
</head>
<body>
<h2>Insert Employee Records – JDBC</h2>

<%
    String url    = "jdbc:mysql://localhost:3306/college_db";
    String dbUser = "root";
    String dbPass = "root";

    Connection        con = null;
    PreparedStatement ps  = null;

    // Employee data to insert
    String[][] employees = {
        {"E001", "Amit Sharma",   "IT",      "55000"},
        {"E002", "Priya Patel",   "HR",      "42000"},
        {"E003", "Rahul Verma",   "Finance", "60000"},
        {"E004", "Sneha Joshi",   "IT",      "48000"},
        {"E005", "Rohan Desai",   "Sales",   "38000"}
    };

    int inserted = 0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, dbUser, dbPass);

        // Create table if not exists
        Statement st = con.createStatement();
        st.executeUpdate(
            "CREATE TABLE IF NOT EXISTS employee (" +
            "emp_id VARCHAR(10) PRIMARY KEY, name VARCHAR(50), " +
            "department VARCHAR(30), salary DOUBLE)");
        st.close();

        // Use PreparedStatement for multiple inserts
        ps = con.prepareStatement(
            "INSERT INTO employee(emp_id, name, department, salary) VALUES(?,?,?,?)");

        for (String[] emp : employees) {
            ps.setString(1, emp[0]);
            ps.setString(2, emp[1]);
            ps.setString(3, emp[2]);
            ps.setDouble(4, Double.parseDouble(emp[3]));
            ps.executeUpdate();
            inserted++;
        }
%>

<p class="ok">&#10004; Successfully inserted <%= inserted %> employee records.</p>

<table>
    <tr><th>Emp ID</th><th>Name</th><th>Department</th><th>Salary</th></tr>
<%
        for (String[] emp : employees) {
%>
    <tr>
        <td><%= emp[0] %></td>
        <td><%= emp[1] %></td>
        <td><%= emp[2] %></td>
        <td>Rs. <%= emp[3] %></td>
    </tr>
<%      }
    } catch (ClassNotFoundException e) {
        out.println("<p class='err'>Driver error: " + e.getMessage() + "</p>");
    } catch (SQLException e) {
        out.println("<p class='err'>SQL error: " + e.getMessage() + "</p>");
    } finally {
        try { if (ps  != null) ps.close();  } catch(Exception e) {}
        try { if (con != null) con.close(); } catch(Exception e) {}
    }
%>
</table>
</body>
</html>
