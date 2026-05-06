<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%-- Slip 68 Q1: JSP current system date & time. Unit: UNIT 4 --%>
<!DOCTYPE html>
<html><head><title>System Date</title>
<style>body{font-family:Arial;margin:40px;text-align:center}.time{font-size:36px;color:#0277bd;font-weight:bold}</style>
</head><body>
    <h2>Current System Date and Time</h2>
    <div class="time">
        <%= new Date() %>
    </div>
</body></html>
