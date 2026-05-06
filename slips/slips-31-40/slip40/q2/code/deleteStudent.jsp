<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 40 Q2: JSP+JDBC – Delete student record, display remaining. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Delete Student</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#c62828;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}.nf{color:red}</style>
</head><body><h2>Delete Student &amp; Display Remaining</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;PreparedStatement ps=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,u,p);
        String roll=request.getParameter("rollNo");
        if(roll!=null&&!roll.isEmpty()){
            ps=con.prepareStatement("DELETE FROM student WHERE roll_no=?");
            ps.setInt(1,Integer.parseInt(roll));
            int r=ps.executeUpdate();
            out.println(r>0?"<p class='ok'>Deleted roll "+roll+"</p>":"<p class='nf'>Not found: "+roll+"</p>");
        }
        st=con.createStatement();rs=st.executeQuery("SELECT * FROM student");
%><table><tr><th>Roll</th><th>Name</th><th>Course</th><th>Marks</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getInt(4)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p class='nf'>"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><form method="post">Roll No to delete: <input name="rollNo" type="number" required/>
<input type="submit" value="Delete"/></form>
</body></html>
