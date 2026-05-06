<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%-- Slip 69 Q1: JSP+JDBC – Insert multiple records. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>Insert Multiple Records</title>
<style>body{font-family:Arial;margin:30px}table{border-collapse:collapse;margin-top:10px}
th{background:#d84315;color:white;padding:8px}td{border:1px solid #ddd;padding:8px}.ok{color:green}</style>
</head><body><h2>Insert Multiple Products</h2>
<%
    String url="jdbc:mysql://localhost:3306/college_db",u="root",p="root";
    Connection con=null;PreparedStatement ps=null;Statement st=null;ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); con=DriverManager.getConnection(url,u,p);
        st=con.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS product(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), price DOUBLE)");
        
        String doInsert = request.getParameter("insert");
        if(doInsert!=null && doInsert.equals("yes")){
            con.setAutoCommit(false); // Batch processing
            ps=con.prepareStatement("INSERT INTO product(name,price) VALUES(?,?)");
            
            // Record 1
            ps.setString(1, "Laptop"); ps.setDouble(2, 45000); ps.addBatch();
            // Record 2
            ps.setString(1, "Mouse"); ps.setDouble(2, 500); ps.addBatch();
            // Record 3
            ps.setString(1, "Keyboard"); ps.setDouble(2, 1200); ps.addBatch();
            
            ps.executeBatch();
            con.commit();
            out.println("<p class='ok'>Inserted 3 products successfully via Batch Processing!</p>");
        }
        
        rs=st.executeQuery("SELECT * FROM product");
%><table><tr><th>ID</th><th>Product Name</th><th>Price</th></tr>
<%while(rs.next()){%><tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td>
<td><%=rs.getDouble(3)%></td></tr><%}%></table>
<%}catch(Exception e){out.println("<p style='color:red'>"+e.getMessage()+"</p>");}
finally{try{if(con!=null)con.close();}catch(Exception x){}}%>
<hr/><form method="post"><input type="hidden" name="insert" value="yes"/>
<input type="submit" value="Insert 3 Sample Products Now"/></form>
</body></html>
