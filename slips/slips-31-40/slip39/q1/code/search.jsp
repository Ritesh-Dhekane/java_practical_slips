<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 39 Q1: JSP+JDBC – Search student by roll number. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Search Student</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#7b1fa2;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.nf{color:red}</style>
</head><body><h2>Search Student Record</h2>
<%
    String roll = request.getParameter("rollNo");
    if (roll != null && !roll.isEmpty()) {
        String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
        Connection con=null;PreparedStatement ps=null;ResultSet rs=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,u,p);
            ps=con.prepareStatement("SELECT * FROM student WHERE roll_no=?");
            ps.setInt(1,Integer.parseInt(roll)); rs=ps.executeQuery();
            if(rs.next()){
%><table><tr><th>Roll</th><th>Name</th><th>Course</th><th>Marks</th></tr>
<tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getInt(4)%></td></tr></table>
<%          }else{ out.println("<p class="nf">No student found with Roll No " + roll + ".</p>"); }
        }catch(Exception e){out.println("<p class="nf">"+e.getMessage()+"</p>");}
        finally{try{if(con!=null)con.close();}catch(Exception x){}}
    }
%>
<hr/><form method="get">Roll Number: <input name="rollNo" type="number" required/>
<input type="submit" value="Search"/></form>
</body></html>
