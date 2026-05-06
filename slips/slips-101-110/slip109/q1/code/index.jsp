<%@ page import='java.sql.*' %>
<table>
<%
    Connection con = DriverManager.getConnection('jdbc:mysql://localhost:3306/college_db', 'root', 'root');
    ResultSet rs = con.createStatement().executeQuery('select * from emp');
    while(rs.next()) { %><tr><td><%= rs.getString(1) %></td><td><%= rs.getString(2) %></td></tr><% }
%>
</table>
