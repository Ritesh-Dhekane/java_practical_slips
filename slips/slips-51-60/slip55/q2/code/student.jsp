<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 55 Q2: JSP+JDBC – Student details using PreparedStatement. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Student Details</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#00695c;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>Student Records</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;PreparedStatement ps=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); con=DriverManager.getConnection(url,u,p);
        st=con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS student_details(roll INT PRIMARY KEY, name VARCHAR(50), class VARCHAR(20), marks DOUBLE)");
        String roll = request.getParameter("roll");
        if(roll!=null && !roll.isEmpty()){
            ps=con.prepareStatement("INSERT INTO student_details(roll,name,class,marks) VALUES(?,?,?,?)");
            ps.setInt(1,Integer.parseInt(roll)); ps.setString(2,request.getParameter("name")); 
            ps.setString(3,request.getParameter("class")); ps.setDouble(4,Double.parseDouble(request.getParameter("marks")));
            ps.executeUpdate(); out.println("<p class="ok">Student added!</p>");
        }
        rs=st.executeQuery("SELECT * FROM student_details");
%><table><tr><th>Roll No</th><th>Name</th><th>Class</th><th>Marks</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getDouble(4)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><h3>Add Student</h3>
<form method="post">Roll No: <input name="roll" type="number" required/> Name: <input name="name" required/>
Class: <input name="class" required/> Marks: <input name="marks" type="number" step="0.1" required/> 
<input type="submit" value="Add Student"/></form>
</body></html>
