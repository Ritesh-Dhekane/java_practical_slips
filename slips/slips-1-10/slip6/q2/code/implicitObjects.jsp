<%-- 
    Slip 6 - Question 2
    Program: JSP page demonstrating implicit objects: request, response, session.
    Concepts: JSP, Implicit Objects
    Unit: UNIT 4 – JSP
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Implicit Objects Demo</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 30px; }
        table { border-collapse: collapse; width: 60%; }
        th, td { border: 1px solid #ccc; padding: 8px 12px; text-align: left; }
        th { background-color: #4CAF50; color: white; }
        h2 { color: #333; }
    </style>
</head>
<body>

<h2>JSP Implicit Objects Demo</h2>

<%
    // 1. request object – get client info and parameters
    String clientIP  = request.getRemoteAddr();
    String method    = request.getMethod();
    String uri       = request.getRequestURI();
    String userAgent = request.getHeader("User-Agent");

    // 2. session object – store and retrieve session data
    session.setAttribute("username", "Ritesh");
    String sessionUser = (String) session.getAttribute("username");
    String sessionId   = session.getId();

    // 3. response object – set content type (already done via page directive)
    response.setHeader("X-Custom-Header", "JSP-Demo");
%>

<h3>1. request Object</h3>
<table>
    <tr><th>Property</th><th>Value</th></tr>
    <tr><td>Client IP</td>  <td><%= clientIP  %></td></tr>
    <tr><td>HTTP Method</td><td><%= method    %></td></tr>
    <tr><td>Request URI</td><td><%= uri       %></td></tr>
    <tr><td>User Agent</td> <td><%= userAgent %></td></tr>
</table>

<h3>2. session Object</h3>
<table>
    <tr><th>Property</th><th>Value</th></tr>
    <tr><td>Session ID</td>   <td><%= sessionId   %></td></tr>
    <tr><td>Username stored</td><td><%= sessionUser %></td></tr>
</table>

<h3>3. response Object</h3>
<p>Custom header <code>X-Custom-Header: JSP-Demo</code> has been added to the response.</p>
<p>Content-Type set to: <strong>text/html; charset=UTF-8</strong></p>

<h3>4. out Object</h3>
<% out.println("<p>Written using <strong>out</strong> implicit object.</p>"); %>

</body>
</html>
