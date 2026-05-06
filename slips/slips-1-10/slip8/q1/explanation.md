# Slip 8 – Q1: JSP Multiplication with Expression Tag

## What the program does
An HTML form accepts two numbers and submits them to `multiply.jsp`.
The JSP reads them in a **scriptlet** `<% %>`, computes the product,
and displays the result using the **JSP expression tag** `<%= %>`.

## Files
| File | Purpose |
|---|---|
| `index.html` | HTML form – two number inputs |
| `multiply.jsp` | JSP – reads params, computes & displays result |

## Java / JSP Concepts Used
- **JSP Scriptlet** `<% ... %>` – Java code to parse and multiply
- **JSP Expression Tag** `<%= ... %>` – outputs variable to HTML
- **request.getParameter()** – reads POST form data
- **Double.parseDouble()** – String to double conversion

## Syllabus Unit
**UNIT 4** – JSP