<%--
    Slip 27 - Question 2
    JSP page: Explain JSP Directives – page, include, taglib.
    This page demonstrates each directive with explanatory output.
    Unit: UNIT 4 – JSP
--%>

<%-- PAGE DIRECTIVE: provides JSP page-level settings --%>
<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="java.util.Date"
         errorPage="error.jsp"
         isErrorPage="false"
         session="true"
         buffer="8kb" %>

<%-- INCLUDE DIRECTIVE: includes another file at translation time --%>
<%-- <%@ include file="header.html" %> --%>

<%-- TAGLIB DIRECTIVE: declares a tag library --%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Directives</title>
    <style>
        body{font-family:Arial;margin:30px;background:#fffde7}
        .card{background:white;padding:20px;border-radius:8px;margin:15px 0;box-shadow:0 2px 6px rgba(0,0,0,0.1)}
        h2{color:#e65100}h3{color:#bf360c;margin-top:0}
        pre{background:#fff3e0;padding:10px;border-radius:4px;overflow:auto}
    </style>
</head>
<body>
<h2>JSP Directives Demo</h2>

<div class="card">
    <h3>1. Page Directive – <code>&lt;%@ page %&gt;</code></h3>
    <p>Provides page-level settings applied at translation time.</p>
    <pre>&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.Date" errorPage="error.jsp" session="true" %&gt;</pre>
    <p>Current date via imported class: <b><%= new Date() %></b></p>
    <p>Session active: <b><%= session != null %></b></p>
</div>

<div class="card">
    <h3>2. Include Directive – <code>&lt;%@ include file="..." %&gt;</code></h3>
    <p>Includes the content of another file at <b>translation time</b> (static include).</p>
    <pre>&lt;%@ include file="header.html" %&gt;</pre>
    <p>Used for common headers, footers, and navigation bars.</p>
    <p><em>Different from &lt;jsp:include&gt; which includes at request time (dynamic include).</em></p>
</div>

<div class="card">
    <h3>3. Taglib Directive – <code>&lt;%@ taglib %&gt;</code></h3>
    <p>Declares a custom or JSTL tag library for use in the page.</p>
    <pre>&lt;%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %&gt;</pre>
    <p>After declaration, you can use tags like <code>&lt;c:forEach&gt;</code>, <code>&lt;c:if&gt;</code>, etc.</p>
</div>

</body>
</html>
