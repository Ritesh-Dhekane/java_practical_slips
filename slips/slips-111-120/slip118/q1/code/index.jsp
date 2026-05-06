<%@ page import='java.sql.*' %>
<%
    Connection con = DriverManager.getConnection('jdbc:mysql://localhost:3306/college_db', 'root', 'root');
    PreparedStatement ps = con.prepareStatement('insert into student values(?,?,?,?)');
    for(int i=1;i<=3;i++){ ps.setInt(1,i); ps.setString(2,'S'+i); ps.setString(3,'X'); ps.setInt(4,80); ps.addBatch(); }
    ps.executeBatch(); out.println('Done');
%>
