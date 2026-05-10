<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jspf" %>
<%
    Integer visits = (Integer) session.getAttribute("jspHomeVisits");
    if (visits == null) {
        visits = 0;
    }
    visits++;
    session.setAttribute("jspHomeVisits", visits);
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Super Slip - Home</title>
</head>
<body>
<div class="wrapper">
    <h1>JSP Super Slip</h1>
    <p>This reference app demonstrates JSP directives, scriptlets, expressions, includes, session usage, and page-to-page flow.</p>

    <div class="info">
        Session visit count for this page:
        <strong><%= visits %></strong>
    </div>

    <form action="process.jsp" method="post">
        <div class="field">
            <label for="studentName">Student Name</label>
            <input type="text" id="studentName" name="studentName" required>
        </div>

        <div class="field">
            <label for="city">City</label>
            <input type="text" id="city" name="city" required>
        </div>

        <div class="field">
            <label for="marks">Marks</label>
            <input type="number" id="marks" name="marks" min="0" max="100" required>
        </div>

        <div class="field">
            <label for="technology">Favorite Technology</label>
            <select id="technology" name="technology">
                <option value="Java">Java</option>
                <option value="JSP">JSP</option>
                <option value="Servlet">Servlet</option>
                <option value="JDBC">JDBC</option>
            </select>
        </div>

        <button type="submit">Submit to process.jsp</button>
    </form>
</div>
</body>
</html>
