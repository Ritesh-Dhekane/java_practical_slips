# Servlet Super Slip - How to Run

## Prerequisites
- JDK 17 or compatible JDK
- Apache Tomcat 9 or later
- `CATALINA_HOME` pointing to your Tomcat folder

## Compile
From inside `super-slips/servlet-super-slip/`:

```bash
javac -cp "%CATALINA_HOME%\lib\servlet-api.jar" -d WEB-INF\classes src\StudentServlet.java
```

If you are using Linux or macOS:

```bash
javac -cp "$CATALINA_HOME/lib/servlet-api.jar" -d WEB-INF/classes src/StudentServlet.java
```

## Deploy
1. Copy the complete `servlet-super-slip/` folder into Tomcat `webapps/`.
2. Start Tomcat.
3. Open:
   - `http://localhost:8080/servlet-super-slip/`
   - `http://localhost:8080/servlet-super-slip/student`

## Expected learning outcomes
- understand how servlet compilation differs from normal Java compilation
- understand the role of `WEB-INF/classes`
- see how form data reaches servlet code through request parameters
