# Servlet Super Slip - Explanation

## What this project demonstrates
- realistic servlet project structure for Tomcat
- HTML form submission to a servlet
- `GET` and `POST` handling
- request parameter reading
- dynamic HTML response generation
- servlet lifecycle methods: `init()`, request handlers, and `destroy()`

## Why these files exist
- `index.html`: front-end entry point with a form
- `src/StudentServlet.java`: business logic and response generation
- `WEB-INF/web.xml`: servlet registration, URL mapping, and welcome file
- `WEB-INF/classes/`: target folder for compiled `.class` files

## Request/Response workflow
1. The browser opens `index.html`.
2. The user fills the form and submits it to `/student`.
3. Tomcat reads `web.xml` and routes the request to `StudentServlet`.
4. The servlet reads parameters using `request.getParameter(...)`.
5. The servlet writes a styled HTML response using `PrintWriter`.
6. Tomcat sends that HTML back to the browser.

## Servlet lifecycle summary
- `init()`: runs once when the servlet is loaded
- `doGet()` / `doPost()`: run for each request
- `destroy()`: runs when Tomcat unloads the servlet

## Common mistakes
- forgetting to include `servlet-api.jar` during compilation
- putting `.class` files outside `WEB-INF/classes`
- mismatching the HTML form action and servlet mapping
- using `POST` without setting request character encoding for text data
- trying to browse `WEB-INF` directly in the browser
