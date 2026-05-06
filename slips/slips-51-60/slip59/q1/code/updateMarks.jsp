<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 59 Q1: JSP+JDBC – Update marks of a student. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Update Marks</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#f57c00;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>Update Student Marks</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;PreparedStatement ps=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); con=DriverManager.getConnection(url,u,p);
        String roll = request.getParameter("roll");
        if(roll!=null && !roll.isEmpty()){
            ps=con.prepareStatement("UPDATE student SET marks=? WHERE roll_no=?");
            ps.setInt(1,Integer.parseInt(request.getParameter("newMarks")));
            ps.setInt(2,Integer.parseInt(roll));
            int r=ps.executeUpdate();
            out.println(r>0?"<p class="ok">Marks updated!</p>":"<p style="color:red">Student not found.</p>");
        }
        st=con.createStatement(); rs=st.executeQuery("SELECT * FROM student");
%><table><tr><th>Roll No</th><th>Name</th><th>Course</th><th>Marks</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getInt(4)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><form method="post">Roll No: <input name="roll" type="number" required/> 
New Marks: <input name="newMarks" type="number" required/> <input type="submit" value="Update Marks"/></form>
</body></html>
