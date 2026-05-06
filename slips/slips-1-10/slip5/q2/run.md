# How to Run – Slip 5 Q2 (Servlet Life Cycle)

## Prerequisites
- Apache Tomcat 9.x installed
- `servlet-api.jar` from Tomcat's `lib/` folder

## Project Structure
```
WebApp/
├── WEB-INF/
│   ├── web.xml
│   └── classes/
│       └── LifeCycleServlet.class
└── index.html
```

## Compile
```bash
javac -cp "path/to/tomcat/lib/servlet-api.jar" LifeCycleServlet.java
```

## Deploy
1. Copy compiled `.class` file to `WebApp/WEB-INF/classes/`
2. Copy webapp folder to Tomcat's `webapps/` directory
3. Start Tomcat: `startup.bat` (Windows) or `startup.sh` (Linux)

## Access
```
http://localhost:8080/WebApp/lifecycle
```

## Observe
- Open Tomcat console to see `init()`, `service()`, `destroy()` log messages.
- Refresh the browser and see request count increase.