<%@ page import="java.sql.*" %>
<%
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db", "root", "root");
    PreparedStatement ps = con.prepareStatement("insert into emp values(?,?)");
    ps.setInt(1, 1); ps.setString(2, "R"); ps.executeUpdate();
    out.println("Inserted");
%>
