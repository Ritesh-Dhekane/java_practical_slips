<%@ page import='java.sql.*' %>
<%
    Connection con = DriverManager.getConnection('jdbc:mysql://localhost:3306/college_db', 'root', 'root');
    PreparedStatement ps = con.prepareStatement('insert into student values(?,?,?,?)');
    ps.setInt(1, 1); ps.setString(2, 'Ritesh'); ps.setString(3, 'MCA'); ps.setInt(4, 90);
    ps.executeUpdate();
    out.println('Inserted');
%>
