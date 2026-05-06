<%@ page language='java' %>
<html><body>
    <form>
        <input name='n1'> + <input name='n2'> <input type='submit'>
    </form>
    <% if(request.getParameter('n1') != null) { %>
        Result: <%= Integer.parseInt(request.getParameter('n1')) + Integer.parseInt(request.getParameter('n2')) %>
    <% } %>
</body></html>
