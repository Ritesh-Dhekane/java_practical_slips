<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 35 Q2: JSP+JDBC – Insert student records, retrieve and display all. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Student JDBC</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#388e3c;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>Student Records – Insert &amp; Display</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;Statement st=null;PreparedStatement ps=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,u,p);
        st=con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS student(roll_no INT PRIMARY KEY,name VARCHAR(50),course VARCHAR(30),marks INT)");
        String roll=request.getParameter("rollNo");
        if(roll!=null&&!roll.isEmpty()){
            ps=con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
            ps.setInt(1,Integer.parseInt(roll));ps.setString(2,request.getParameter("name"));
            ps.setString(3,request.getParameter("course"));ps.setInt(4,Integer.parseInt(request.getParameter("marks")));
            ps.executeUpdate();out.println("<p class='ok'>Inserted!</p>");
        }
        rs=st.executeQuery("SELECT * FROM student");
%><table><tr><th>Roll</th><th>Name</th><th>Course</th><th>Marks</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getInt(4)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style='color:red'>"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><form method="post">Roll:<input name="rollNo" type="number"/> Name:<input name="name"/>
Course:<input name="course"/> Marks:<input name="marks" type="number"/>
<input type="submit" value="Insert"/></form>
</body></html>
