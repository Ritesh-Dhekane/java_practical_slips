# Slip 19 – Q1: JSP – Display Customer Name & City

## What the program does
An HTML form accepts **customer name** and **city** and submits them to `display.jsp`.
The JSP page reads the parameters using the `request` implicit object and displays
them in a table using **JSP expression tags** `<%= %>`.

## Files
| File | Purpose |
|---|---|
| `index.html` | HTML form – name + city input |
| `display.jsp` | JSP – reads & displays using expression tags |

## Java / JSP Concepts Used
- **JSP Expression Tag** `<%= %>` – outputs `request.getParameter(...)` to HTML
- **request implicit object** – reads POST form parameters
- **JSP scriptlet-free** – uses expression tags only (clean approach)

## Syllabus Unit
**UNIT 4** – JSP
