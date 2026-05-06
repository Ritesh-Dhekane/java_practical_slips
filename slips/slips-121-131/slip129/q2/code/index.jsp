<%@ page import='java.sql.*' %>
<% Connection con = DriverManager.getConnection('jdbc:mysql://localhost:3306/college_db','root','root'); ResultSet rs = con.createStatement().executeQuery('select * from student'); while(rs.next()) out.println(rs.getString(2)); %>
