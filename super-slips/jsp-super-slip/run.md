# JSP Super Slip - How to Run

## Prerequisites
- Apache Tomcat 9 or later

## Deploy
1. Copy `jsp-super-slip/` into Tomcat `webapps/`.
2. Start Tomcat.
3. Open `http://localhost:8080/jsp-super-slip/`

## What to test
- submit the form from `index.jsp`
- verify that `process.jsp` calculates the result
- open `summary.jsp` and confirm the session values are displayed

## Learning note
This project is intentionally JSP-heavy so students can see how classic syllabus-style JSP applications are structured before moving logic into servlets or Java classes.
