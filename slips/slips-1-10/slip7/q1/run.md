# How to Run – Slip 7 Q1 (Servlet)

## Prerequisites
- Apache Tomcat 9.x

## Project Structure
```
WelcomeApp/
├── index.html
└── WEB-INF/
    ├── web.xml
    └── classes/
        └── WelcomeServlet.class
```

## Compile
```bash
javac -cp "tomcat/lib/servlet-api.jar" WelcomeServlet.java
```

## Deploy & Run
1. Place compiled files in `WelcomeApp/WEB-INF/classes/`
2. Copy `WelcomeApp/` to Tomcat `webapps/`
3. Start Tomcat
4. Open: `http://localhost:8080/WelcomeApp/index.html`
5. Enter employee name and click Submit