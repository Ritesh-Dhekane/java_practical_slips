<%@ page import="java.sql.*" %>
<%
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db", "root", "root");
    con.createStatement().executeUpdate("insert into emp values(10,"X")");
    ResultSet rs = con.createStatement().executeQuery("select * from emp");
    while(rs.next()) out.println(rs.getString(2));
%>
