<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 36 Q2: JSP+JDBC – Update employee salary, display updated data. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Update Salary</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#e65100;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>Update Employee Salary</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;PreparedStatement ps=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,u,p);
        String eid=request.getParameter("empId");
        if(eid!=null&&!eid.isEmpty()){
            ps=con.prepareStatement("UPDATE emp SET salary=? WHERE emp_id=?");
            ps.setDouble(1,Double.parseDouble(request.getParameter("newSalary")));
            ps.setString(2,eid);
            int rows=ps.executeUpdate();
            out.println(rows>0?"<p class="ok">Salary updated!</p>":"<p style="color:red">Employee not found.</p>");
        }
        st=con.createStatement();rs=st.executeQuery("SELECT * FROM emp");
%><table><tr><th>ID</th><th>Name</th><th>Dept</th><th>Salary</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td><td><%=rs.getDouble(4)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style="color:red">"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><form method="post">Emp ID:<input name="empId"/> New Salary:<input name="newSalary" type="number"/>
<input type="submit" value="Update"/></form>
</body></html>
