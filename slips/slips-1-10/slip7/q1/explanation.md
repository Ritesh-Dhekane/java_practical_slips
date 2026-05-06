# Slip 7 – Q1: Servlet – Welcome Employee

## What the program does
An HTML form accepts an **employee name** and submits it (POST) to
`WelcomeServlet`. The servlet reads the `empName` parameter and responds
with a personalized "Welcome <Employee Name>" HTML message.

## Files
| File | Purpose |
|---|---|
| `index.html` | HTML form with input for employee name |
| `WelcomeServlet.java` | Servlet reading form data and sending HTML response |

## Java Concepts Used
- **Servlet** – `extends HttpServlet`
- **doPost()** – handles HTTP POST form submission
- **request.getParameter()** – reads form field value
- **PrintWriter** – generates HTML response
- **@WebServlet** – maps servlet to URL

## Syllabus Unit
**UNIT 3** – Servlets