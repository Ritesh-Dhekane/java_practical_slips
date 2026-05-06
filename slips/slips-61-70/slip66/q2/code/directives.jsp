<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Page Directive --%>
<%@ page import="java.util.Date" %>
<%-- Slip 66 Q2: JSP page and include directives. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>JSP Directives Demo</title>
<style>body{font-family:Arial;margin:40px}.box{border:2px dashed #1976d2;padding:20px;background:#e3f2fd}</style>
</head><body>
    <h2>JSP Directives Demonstration</h2>
    
    <p>1. <b>Page Directive:</b> Used to import java.util.Date at the top.</p>
    <p>Current Date via import: <%= new Date() %></p>
    
    <p>2. <b>Include Directive:</b> Including a static file 'header.html' below.</p>
    
    <div class="box">
        <%@ include file="header.html" %>
    </div>
</body></html>
