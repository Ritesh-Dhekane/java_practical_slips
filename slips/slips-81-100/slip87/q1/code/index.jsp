<%@ page language="java" %>
<html><body>
    <form>
        Name: <input name="name"> Salary: <input name="sal"> <input type="submit">
    </form>
    <% if(request.getParameter("sal") != null) { %>
        Annual: <%= Double.parseDouble(request.getParameter("sal")) * 12 %>
    <% } %>
</body></html>
