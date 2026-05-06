# Slip 9 – Q1: JSP + JDBC – Retrieve Student Records

## What the program does
A JSP page connects to a **MySQL database** using JDBC, queries all rows from
the `student` table, and displays them in an HTML table.

## Files
| File | Purpose |
|---|---|
| `students.jsp` | JSP page – JDBC connection, query, display |
| `setup.sql` | SQL script to create DB, table, and insert sample data |

## Java / JSP Concepts Used
- **JDBC Steps**: Load Driver → Connect → Statement → ResultSet → Close
- **Class.forName()** – loads MySQL JDBC driver
- **DriverManager.getConnection()** – connects to DB
- **Statement.executeQuery()** – runs `SELECT * FROM student`
- **ResultSet** – iterates over result rows
- **JSP Scriptlet** – Java code embedded in JSP

## Syllabus Unit
**UNIT 4** – JSP, JDBC