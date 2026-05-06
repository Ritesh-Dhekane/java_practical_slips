<%@ page language='java' %>
<%
    int a = 10, b = 5; String op = request.getParameter('op');
    if('sub'.equals(op)) out.println(a-b); else out.println(a*b);
%>
