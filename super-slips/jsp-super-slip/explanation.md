# JSP Super Slip - Explanation

## What this project demonstrates
- JSP directives using `<%@ page %>` and include fragments
- form submission from `index.jsp` to `process.jsp`
- request parameter reading inside JSP
- JSP expressions `<%= ... %>`
- JSP scriptlets `<% ... %>`
- session usage across multiple JSP pages

## File roles
- `index.jsp`: entry page and form
- `process.jsp`: parameter processing and session storage
- `summary.jsp`: final display page
- `header.jspf`: reusable included styling fragment
- `WEB-INF/web.xml`: welcome page declaration

## JSP lifecycle basics
1. A JSP is requested.
2. Tomcat translates the JSP into a servlet.
3. The generated servlet is compiled.
4. That servlet executes and produces the HTML response.

## Form-to-JSP workflow
1. User fills the form on `index.jsp`
2. `process.jsp` reads the form data
3. Important values are saved into the session
4. `summary.jsp` reads the session values and shows the final output

## Common mistakes
- mixing too much Java logic into JSP pages
- forgetting to handle `null` request parameters
- confusing request scope and session scope
- forgetting that JSPs are server-side, not plain static HTML files
