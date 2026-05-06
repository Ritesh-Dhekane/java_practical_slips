<%@ page import='java.sql.*' %>
<%
    Connection con = DriverManager.getConnection('jdbc:mysql://localhost:3306/college_db', 'root', 'root');
    ResultSet rs = con.createStatement().executeQuery('select count(*) from emp');
    rs.next(); out.println('Total: ' + rs.getInt(1));
%>
