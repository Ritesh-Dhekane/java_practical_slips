# How to Run – Slip 10 Q2 (Servlet Life Cycle)

## Prerequisites
- Apache Tomcat 9.x
- `servlet-api.jar` from Tomcat `lib/`

## Project Structure
```
LifecycleApp/
├── WEB-INF/
│   ├── web.xml
│   └── classes/
│       └── LifeCycleDemoServlet.class
└── index.html
```

## Compile
```bash
javac -cp "path/to/tomcat/lib/servlet-api.jar" LifeCycleDemoServlet.java
```

## Deploy & Run
1. Copy to Tomcat `webapps/`
2. Start Tomcat
3. Open: `http://localhost:8080/LifecycleApp/lifecycle`
4. Observe init() in console; refresh to see request count increase
5. Stop Tomcat to trigger destroy()