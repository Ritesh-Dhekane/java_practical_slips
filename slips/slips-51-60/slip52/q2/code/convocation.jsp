<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 52 Q2: JSP+JDBC – Convocation registration. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Convocation Registration</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#4527a0;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>MCA Convocation Registration</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;PreparedStatement ps=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); con=DriverManager.getConnection(url,u,p);
        st=con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS convocation(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), roll_no VARCHAR(20), batch VARCHAR(20))");
        String name = request.getParameter("name");
        if(name!=null && !name.isEmpty()){
            ps=con.prepareStatement("INSERT INTO convocation(name,roll_no,batch) VALUES(?,?,?)");
            ps.setString(1,name); ps.setString(2,request.getParameter("roll")); ps.setString(3,request.getParameter("batch"));
            ps.executeUpdate(); out.println("<p class='ok'>Registered successfully for Convocation!</p>");
        }
        rs=st.executeQuery("SELECT * FROM convocation");
%><table><tr><th>ID</th><th>Name</th><th>Roll No</th><th>Batch</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style='color:red'>"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><h3>Register Form</h3>
<form method="post">Name: <input name="name" required/> Roll No: <input name="roll" required/>
Batch: <input name="batch" required/> <input type="submit" value="Register"/></form>
</body></html>
