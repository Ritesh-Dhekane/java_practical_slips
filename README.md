# Java Practical Slip Solutions – MCA Semester II

## Description
This repository contains solutions for Java practical slips based on the Savitribai Phule Pune University (SPPU) syllabus for MCA Semester II.

It covers the following core and advanced Java topics:
* OOP (Object-Oriented Programming)
* Collections
* Multithreading
* Exception Handling
* Servlets
* JSP & JDBC
* Spring MVC

## Folder Structure
* `slips/`: Contains the actual code solutions. It is organized by groups (e.g., `slips-1-10`), then by individual slip numbers (e.g., `slip1`), and finally by question numbers (e.g., `q1`, `q2`). Each question folder contains:
  * `code/Main.java`: The Java source code.
  * `output.txt`: Expected program output.
  * `explanation.md`: Brief conceptual explanation.
  * `run.md`: Instructions to execute the program.
* `common/`: Contains common setup and configuration guides for Java, Servlets, JSP, and JDBC.
* `web-viewer/`: Contains the HTML, CSS, and JS files for the interactive frontend viewer.
* `data/`: Contains `slips.json`, which acts as the database for the frontend viewer.
* `index.html`: The entry point for the Web Viewer.

## How to Run Programs
For core Java programs, navigate to the `code/` directory of the specific question and use the following commands:
```bash
javac Main.java
java Main
```

For advanced topics (Servlets/JSP/JDBC):
* Our `Main.java` files contain console-runnable mocks of the web components to allow quick compilation and local verification without a server.
* The actual web components (like `index.jsp`) are provided alongside the code and can be deployed directly into an Apache Tomcat `webapps` folder. Check `run.md` inside each specific question for tailored instructions.

## How to Use Web Viewer
1. Open the `index.html` file located in the root directory in any modern web browser.
2. Use the search bar to filter by topics or slip names.
3. Click on a group to view its slips, and click on a slip to view the problem statement, code, explanation, and output side-by-side.
4. Use the "Copy" button on the code blocks to quickly grab the code.

## Syllabus Mapping (Unit 1–5)
* **Unit 1**: Class & Objects, Inheritance, Polymorphism, Abstraction, Encapsulation, Abstract Class, Interface, Lambda Expressions
* **Unit 2**: Collections (ArrayList, Vector, Set, Map), Multithreading (Lifecycle, Priority, Synchronization), Exception Handling
* **Unit 3**: Servlets
* **Unit 4**: JSP, JDBC
* **Unit 5**: Spring MVC (Future Slips)

## Disclaimer
These solutions are strictly for learning and exam preparation purposes. Please ensure you understand the concepts and logic before implementing them in your actual practical exams.
