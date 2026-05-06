<%--
    Slip 21 - Question 2
    JSP page: Demonstrates all 3 JSP Scripting Elements:
      1. Scriptlet  <% %>
      2. Expression <%= %>
      3. Declaration <%! %>
    Unit: UNIT 4 – JSP
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%--
    DECLARATION: <%! %>
    Used to declare methods and instance variables at class level.
    These are available throughout the JSP page.
--%>
<%!
    int visitCount = 0;   // instance variable

    // Method declared at class level
    String greet(String name) {
        return "Hello, " + name + "! Welcome to JSP scripting elements demo.";
    }

    int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Scripting Elements</title>
    <style>
        body { font-family: Arial; margin: 30px; background: #f5f5f5; }
        .card { background: white; padding: 20px; border-radius: 8px; margin: 15px 0;
                box-shadow: 0 2px 6px rgba(0,0,0,0.1); }
        h2 { color: #1a237e; } h3 { color: #1565c0; margin-top:0; }
        code { background:#e8eaf6; padding: 2px 6px; border-radius:3px; }
    </style>
</head>
<body>
<h2>JSP Scripting Elements Demo</h2>

<%-- 1. SCRIPTLET: <% %> - Java code executed on server --%>
<div class="card">
    <h3>1. Scriptlet &lt;% %&gt;</h3>
    <p>Contains Java code executed each time the page is requested.</p>
    <%
        visitCount++;
        String user = "Student";
        int num = 5;
    %>
    <p>Visit count: <strong><%= visitCount %></strong></p>
    <p>User: <strong><%= user %></strong></p>
</div>

<%-- 2. EXPRESSION: <%= %> - Outputs value directly to response --%>
<div class="card">
    <h3>2. Expression Tag &lt;%= %&gt;</h3>
    <p>Evaluates an expression and outputs it directly into HTML.</p>
    <p>Greeting : <strong><%= greet(user) %></strong></p>
    <p>Date/Time: <strong><%= new java.util.Date() %></strong></p>
</div>

<%-- 3. DECLARATION: <%! %> already shown above - result used here --%>
<div class="card">
    <h3>3. Declaration Tag &lt;%! %&gt;</h3>
    <p>Declares class-level variables and methods (shown at top of JSP).</p>
    <p>Factorial of <%= num %>: <strong><%= factorial(num) %></strong></p>
    <p>The <code>greet()</code> and <code>factorial()</code> methods were declared using <code>&lt;%! %&gt;</code>.</p>
</div>

</body>
</html>
