# How to Run – Slip 6 Q2 (JSP Implicit Objects)

## Prerequisites
- Apache Tomcat 9.x installed

## Deploy
1. Create a web application folder `ImplicitDemo/`
2. Place `implicitObjects.jsp` in the root of `ImplicitDemo/`
3. Copy to Tomcat `webapps/` directory

## Access
```
http://localhost:8080/ImplicitDemo/implicitObjects.jsp
```

## Observe
- `request` info: IP, method, URI, User-Agent
- `session` info: session ID, stored username
- `response` custom header (visible in browser dev tools → Network)
- `out` object output at bottom of page