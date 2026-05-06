<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 44 Q2: JSP+JDBC – Placement portal registration. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Placement Registration</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#00695c;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>Placement Portal – Registration</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;PreparedStatement ps=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); con=DriverManager.getConnection(url,u,p);
        st=con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS placement(id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(50),email VARCHAR(50),course VARCHAR(30),cgpa DOUBLE,skills VARCHAR(100))");
        String nm=request.getParameter("name");
        if(nm!=null&&!nm.isEmpty()){
            ps=con.prepareStatement("INSERT INTO placement(name,email,course,cgpa,skills) VALUES(?,?,?,?,?)");
            ps.setString(1,nm);ps.setString(2,request.getParameter("email"));
            ps.setString(3,request.getParameter("course"));ps.setDouble(4,Double.parseDouble(request.getParameter("cgpa")));
            ps.setString(5,request.getParameter("skills"));ps.executeUpdate();
            out.println("<p class="ok">Registered successfully!</p>");
        }
        rs=st.executeQuery("SELECT * FROM placement");
%><table><tr><th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>CGPA</th><th>Skills</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td><td><%=rs.getDouble(5)%></td><td><%=rs.getString(6)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><form method="post">Name:<input name="name"/> Email:<input name="email"/>
Course:<input name="course"/> CGPA:<input name="cgpa" type="number" step="0.01"/>
Skills:<input name="skills"/> <input type="submit" value="Register"/></form>
</body></html>
