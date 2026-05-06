<%--
    Slip 9 - Question 1
    JSP + JDBC: Connect to database and retrieve all records from Student table.
    Concepts: JSP, JDBC, SQL SELECT
    Unit: UNIT 4 – JSP, JDBC
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Records – JDBC</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 30px; background: #f9f9f9; }
        h2 { color: #333; }
        table { border-collapse: collapse; width: 80%; margin-top: 10px; background: white; }
        th { background: #3f51b5; color: white; padding: 10px; text-align: left; }
        td { border: 1px solid #ddd; padding: 8px 12px; }
        tr:nth-child(even) { background: #f2f2f2; }
        .error { color: red; }
    </style>
</head>
<body>
<h2>Student Table – All Records</h2>

<%
    // JDBC Configuration
    String url      = "jdbc:mysql://localhost:3306/college_db";
    String dbUser   = "root";
    String dbPass   = "root";

    Connection con = null;
    Statement  st  = null;
    ResultSet  rs  = null;

    try {
        // Step 1: Load JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish Connection
        con = DriverManager.getConnection(url, dbUser, dbPass);

        // Step 3: Create Statement and execute query
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM student");

        // Step 4: Display results in HTML table
%>
<table>
    <tr>
        <th>Roll No</th>
        <th>Name</th>
        <th>Course</th>
        <th>Marks</th>
    </tr>
<%
        boolean hasData = false;
        while (rs.next()) {
            hasData = true;
%>
    <tr>
        <td><%= rs.getInt("roll_no")   %></td>
        <td><%= rs.getString("name")   %></td>
        <td><%= rs.getString("course") %></td>
        <td><%= rs.getInt("marks")     %></td>
    </tr>
<%
        }
        if (!hasData) {
            out.println("<tr><td colspan='4'>No records found.</td></tr>");
        }
%>
</table>
<%
    } catch (ClassNotFoundException e) {
        out.println("<p class='error'>Driver not found: " + e.getMessage() + "</p>");
    } catch (SQLException e) {
        out.println("<p class='error'>DB Error: " + e.getMessage() + "</p>");
    } finally {
        // Step 5: Close resources
        try { if (rs  != null) rs.close();  } catch (Exception e) {}
        try { if (st  != null) st.close();  } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>

</body>
</html>
