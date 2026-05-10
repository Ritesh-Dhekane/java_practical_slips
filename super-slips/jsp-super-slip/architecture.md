# JSP Super Slip - Architecture

## Folder structure
```text
jsp-super-slip/
├── index.jsp
├── process.jsp
├── summary.jsp
├── header.jspf
├── WEB-INF/
│   └── web.xml
├── explanation.md
├── run.md
└── architecture.md
```

## Request flow
```text
Browser -> index.jsp -> process.jsp -> summary.jsp
```

## Responsibilities
- `index.jsp`: accepts user input
- `process.jsp`: converts request parameters into derived values
- `summary.jsp`: final formatted output
- `header.jspf`: shared presentation fragment

## Reuse value for normal slips
Use this project as the reference for:
- JSP form handling slips
- JSP expression-tag slips
- JSP implicit-object slips
- multi-page JSP navigation slips
