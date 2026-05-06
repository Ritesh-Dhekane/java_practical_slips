<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%-- Slip 31 Q2: JSP – Display current date and time. Unit: UNIT 4 – JSP --%>
<!DOCTYPE html>
<html><head><title>Date & Time</title>
<style>body{font-family:Arial;margin:50px;text-align:center;background:#e8eaf6}
.card{background:white;display:inline-block;padding:40px;border-radius:12px;box-shadow:0 4px 12px rgba(0,0,0,0.15)}
h2{color:#283593}.dt{font-size:22px;color:#333;margin:20px 0}</style></head>
<body><div class="card">
<h2>Current Date &amp; Time</h2>
<div class="dt"><%= new Date() %></div>
</div></body></html>
