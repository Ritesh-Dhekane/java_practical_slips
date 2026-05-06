<%@ page import="java.sql.*" %>
<html>
<body>
    <h2>Student Records</h2>
    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            while(rs.next()) {
                out.println("RollNo: " + rs.getInt(1) + " Name: " + rs.getString(2) + "<br>");
            }
        } catch(Exception e) {
            out.println("Error: " + e.getMessage());
        }
    %>
</body>
</html>
