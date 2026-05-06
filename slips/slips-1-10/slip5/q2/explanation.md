# Slip 5 – Q2: Servlet Life Cycle

## What the program does
Demonstrates all three Servlet life cycle methods:
- **`init()`** – called once when the servlet is first loaded
- **`service()`** / `doGet()` – called on every HTTP request; tracks request count
- **`destroy()`** – called once when the server shuts down or servlet is removed

## Java Concepts Used
- **Servlet** – `extends HttpServlet`
- **Servlet Life Cycle** – `init()`, `service()`, `destroy()`
- **@WebServlet annotation** – maps servlet to URL `/lifecycle`
- **HttpServletRequest / HttpServletResponse** – request/response objects
- **PrintWriter** – write HTML response

## Syllabus Unit
**UNIT 3** – Servlets, Servlet Life Cycle