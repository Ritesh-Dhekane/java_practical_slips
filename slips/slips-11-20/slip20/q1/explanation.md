# Slip 20 – Q1: JSP + JDBC – Insert Multiple Employee Records

## What the program does
A JSP page that connects to MySQL via JDBC and inserts **5 employee records**
using a `PreparedStatement`. Also creates the table if it doesn't exist.
Displays the inserted records in an HTML table.

## Files
| File | Purpose |
|---|---|
| `insertEmployees.jsp` | JSP – JDBC connection, batch insert, display |
| `setup.sql` | SQL – database and table creation |

## Java / JSP Concepts Used
- **JDBC** – 5-step pattern (load driver, connect, statement, execute, close)
- **PreparedStatement** – prevents SQL injection, efficient for repeated inserts
- **JSP Scriptlet + Expression** – Java logic + HTML rendering
- **2D String array** – holds employee data for batch insert

## Syllabus Unit
**UNIT 4** – JSP, JDBC
