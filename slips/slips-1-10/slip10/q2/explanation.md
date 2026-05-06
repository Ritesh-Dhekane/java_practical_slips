# Slip 10 – Q2: Servlet Life Cycle

## What the program does
Demonstrates all three phases of the Servlet Life Cycle:
- **`init()`** – called once; records initialization time
- **`doGet()`** – called on every GET request; increments and shows request count
- **`destroy()`** – called once at shutdown; logs total requests served

Both server console and browser output show the lifecycle in action.

## Java Concepts Used
- **Servlet Life Cycle** – `init()`, `service()` → `doGet()`, `destroy()`
- **@WebServlet** – URL mapping annotation
- **ServletConfig** – access servlet configuration
- **PrintWriter** – HTML response generation
- **Instance variable** – `requestCount` shared across requests

## Syllabus Unit
**UNIT 3** – Servlets, Servlet Life Cycle