# Servlet Super Slip - Architecture

## Folder structure
```text
servlet-super-slip/
├── index.html
├── src/
│   └── StudentServlet.java
├── WEB-INF/
│   ├── web.xml
│   └── classes/
├── explanation.md
├── run.md
└── architecture.md
```

## Component responsibilities
- `index.html`: collects student details from the user
- `StudentServlet.java`: controller + response renderer
- `web.xml`: deployment descriptor and URL mapping
- `WEB-INF/classes/`: compiled servlet bytecode location used by Tomcat

## Request flow
```text
Browser -> index.html -> POST /student -> StudentServlet -> HTML response -> Browser
```

## Reuse value for normal slips
Use this project as the reference for:
- servlet form submission slips
- request parameter slips
- welcome-message servlet slips
- servlet lifecycle slips
- servlet deployment structure questions
