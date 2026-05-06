<%--
    Slip 27 - Question 1
    JSP page: Display Employee details using JSP implicit objects.
    Concepts: JSP Implicit Objects – request, session, application, out, pageContext
    Unit: UNIT 4 – JSP
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Info – JSP Implicit Objects</title>
    <style>
        body { font-family: Arial; margin: 30px; background: #fafafa; }
        h2 { color: #1a237e; }
        table { border-collapse: collapse; width: 70%; background: white; margin-top: 10px; }
        th { background: #283593; color: white; padding: 10px; text-align: left; }
        td { border: 1px solid #ddd; padding: 8px 12px; }
        td:first-child { font-weight: bold; background: #e8eaf6; }
    </style>
</head>
<body>
<h2>Employee Details – JSP Implicit Objects</h2>

<%
    // Store employee details in session (simulating login context)
    session.setAttribute("empName",  "Amit Sharma");
    session.setAttribute("empId",    "E-1001");
    session.setAttribute("dept",     "IT");
    session.setAttribute("salary",   "55000");

    // Store company info in application scope
    application.setAttribute("company", "KES Pratibha Institute");
%>

<table>
    <tr><th colspan="2">Employee Information</th></tr>
    <tr><td>Employee Name</td> <td><%= session.getAttribute("empName")  %></td></tr>
    <tr><td>Employee ID  </td> <td><%= session.getAttribute("empId")    %></td></tr>
    <tr><td>Department   </td> <td><%= session.getAttribute("dept")     %></td></tr>
    <tr><td>Salary       </td> <td>Rs. <%= session.getAttribute("salary") %></td></tr>
    <tr><th colspan="2">Request Information</th></tr>
    <tr><td>Method       </td> <td><%= request.getMethod() %></td></tr>
    <tr><td>URI          </td> <td><%= request.getRequestURI() %></td></tr>
    <tr><td>Remote Host  </td> <td><%= request.getRemoteHost() %></td></tr>
    <tr><th colspan="2">Application Information</th></tr>
    <tr><td>Company      </td> <td><%= application.getAttribute("company") %></td></tr>
    <tr><td>Server Info  </td> <td><%= application.getServerInfo() %></td></tr>
</table>

<br/>
<p>Implicit objects used: <b>request, response, session, application, out, pageContext</b></p>
</body>
</html>
