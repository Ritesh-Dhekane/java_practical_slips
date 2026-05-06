<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 34 Q2: JSP+JDBC – Accept employee details, store in DB, display. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Employee JDBC</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#1565c0;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>Employee – Insert & Display</h2>
<%
    String eid = request.getParameter("empId");
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null; PreparedStatement ps=null; Statement st=null; ResultSet rs=null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,u,p);
        st = con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS emp(emp_id VARCHAR(10) PRIMARY KEY,name VARCHAR(50),dept VARCHAR(30),salary DOUBLE)");
        if (eid!=null && !eid.isEmpty()) {
            ps = con.prepareStatement("INSERT INTO emp VALUES(?,?,?,?)");
            ps.setString(1,eid); ps.setString(2,request.getParameter("name"));
            ps.setString(3,request.getParameter("dept"));
            ps.setDouble(4,Double.parseDouble(request.getParameter("salary")));
            ps.executeUpdate();
            out.println("<p class="ok">Record inserted!</p>");
        }
        rs = st.executeQuery("SELECT * FROM emp");
%><table><tr><th>ID</th><th>Name</th><th>Dept</th><th>Salary</th></tr>
<% while(rs.next()){%><tr><td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getDouble(4)%></td></tr><%}%></table>
<%} catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}
  finally{try{if(rs!=null)rs.close();}catch(Exception x){}try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><h3>Add Employee</h3>
<form method="post">ID:<input name="empId"/> Name:<input name="name"/> Dept:<input name="dept"/>
Salary:<input name="salary" type="number"/> <input type="submit" value="Insert"/></form>
</body></html>
