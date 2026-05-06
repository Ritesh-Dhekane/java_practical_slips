<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 53 Q2: JSP+JDBC – Patient registration. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Patient Registration</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#b71c1c;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>Hospital Patient Details</h2>
<%
    String url="jdbc:mysql://localhost:3306/hospital_db",u="root",p="root";
    Connection con=null;PreparedStatement ps=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        // create DB and use it if it doesn't exist
        Connection setupCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/", u, p);
        setupCon.createStatement().executeUpdate("CREATE DATABASE IF NOT EXISTS hospital_db");
        setupCon.close();
        
        con=DriverManager.getConnection(url,u,p);
        st=con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS patient(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), age INT, disease VARCHAR(50))");
        String name = request.getParameter("name");
        if(name!=null && !name.isEmpty()){
            ps=con.prepareStatement("INSERT INTO patient(name,age,disease) VALUES(?,?,?)");
            ps.setString(1,name); ps.setInt(2,Integer.parseInt(request.getParameter("age"))); ps.setString(3,request.getParameter("disease"));
            ps.executeUpdate(); out.println("<p class="ok">Patient recorded successfully!</p>");
        }
        rs=st.executeQuery("SELECT * FROM patient");
%><table><tr><th>ID</th><th>Name</th><th>Age</th><th>Disease</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getInt(3)%></td><td><%=rs.getString(4)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><h3>Add Patient</h3>
<form method="post">Name: <input name="name" required/> Age: <input name="age" type="number" required/>
Disease: <input name="disease" required/> <input type="submit" value="Add Patient"/></form>
</body></html>
