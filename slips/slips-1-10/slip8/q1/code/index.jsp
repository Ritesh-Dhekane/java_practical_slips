<%@ page language="java" %>
<html>
<body>
    <%
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        int res = 0;
        if(n1 != null && n2 != null) {
            res = Integer.parseInt(n1) * Integer.parseInt(n2);
        }
    %>
    <h3>Multiplication: <%= res %></h3>
</body>
</html>
