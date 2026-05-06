<%@ page import='java.sql.*' %>
<% Connection con = DriverManager.getConnection('jdbc:mysql://localhost:3306/college_db','root','root'); ResultSet rs = con.createStatement().executeQuery('select * from emp order by salary'); while(rs.next()) out.println(rs.getString(1)); %>
