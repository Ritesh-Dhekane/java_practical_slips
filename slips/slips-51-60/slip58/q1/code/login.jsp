<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Slip 58 Q1: JSP – Login form and display. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>JSP Login</title>
<style>body{font-family:Arial;margin:40px}.card{border:1px solid #ccc;padding:20px;width:300px;background:#f9f9f9;border-radius:8px}</style>
</head><body>
<%
    String u = request.getParameter("user");
    String p = request.getParameter("pass");
    if (u != null) {
%>
    <h2>Login Submitted</h2>
    <div class="card">
        <p><b>Username:</b> <%= u %></p>
        <p><b>Password:</b> <%= p %> <i>(Never display passwords in real apps!)</i></p>
    </div>
    <br/><a href="login.jsp">Go Back</a>
<% } else { %>
    <h2>User Login</h2>
    <div class="card">
    <form method="post">
        <p>Username: <input type="text" name="user" required/></p>
        <p>Password: <input type="password" name="pass" required/></p>
        <input type="submit" value="Login"/>
    </form>
    </div>
<% } %>
</body></html>
