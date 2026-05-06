<%--
    Slip 19 - Question 1
    JSP page: Accept customer name and city from POST, display using expression tags.
    Concepts: JSP, Expression Tag, request implicit object
    Unit: UNIT 4 – JSP
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Details</title>
    <style>
        body { font-family: Arial; margin: 50px; background: #f3f4f6; }
        .card { background: white; padding: 30px; border-radius: 8px; width: 350px;
                box-shadow: 0 2px 8px rgba(0,0,0,0.1); }
        h2 { color: #7c3aed; }
        table { width: 100%; border-collapse: collapse; margin-top: 10px; }
        td { padding: 8px 12px; border: 1px solid #e5e7eb; }
        td:first-child { font-weight: bold; color: #555; background: #f9fafb; }
    </style>
</head>
<body>
<div class="card">
    <h2>Customer Details</h2>
    <table>
        <tr>
            <td>Customer Name</td>
            <td><%= request.getParameter("custName") %></td>
        </tr>
        <tr>
            <td>City</td>
            <td><%= request.getParameter("city") %></td>
        </tr>
    </table>
    <br/>
    <a href="index.html">&#8592; Go Back</a>
</div>
</body>
</html>
