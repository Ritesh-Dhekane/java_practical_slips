# Project Summary

## What Has Been Implemented So Far
* Designed the complete folder structure to neatly segregate slips, common configurations, JSON metadata, and web UI.
* Parsed and mapped the syllabus to carefully create code solutions for the practical exams.
* Created an interactive, dark-themed, and responsive web viewer that reads from a structured JSON dataset (`data/slips.json`) to display questions, code, explanation, and output side-by-side.
* Simulated web environment classes (Servlets) in standard Java files to guarantee compilation consistency across all solutions.

## Which Slips Are Completed
* **Slips 1 to 10** (Total 20 questions) have been fully coded, verified, and successfully compiled.

## Which Topics Are Covered
* **Unit 1**: Encapsulation, Polymorphism, Method Overriding, Abstract Classes, Interfaces, Lambda Expressions.
* **Unit 2**: Collections (ArrayList, HashMap, HashSet), Multithreading (Runnable, Thread, Naming), Exception Handling.
* **Unit 3**: Servlets (Lifecycle, Forms).
* **Unit 4**: JSP (Implicit Objects, Expression Tags), JDBC (Connection, Retrieval).

## What Remains Pending
* **Slips 11 to 130** are remaining and will need to be progressively implemented.
* **Unit 5 (Spring MVC)** solutions will appear in later slips.

## Assumptions Made
* We assumed the student is running on a standard JDK without external libraries (like `servlet-api.jar`) globally configured, so we provided internal Java mocks in `Main.java` to make Servlet solutions compile successfully using `javac Main.java`.
* For database tasks (JDBC), it is assumed the user has a local MySQL database named `testdb` with a table `Student`, using root credentials.

## Limitations
* The Servlet mock approach in `Main.java` is purely for demonstrating theoretical logic and compilation checks. Real deployment must still happen via an application server like Apache Tomcat using the actual `.jsp` files or properly packaged Servlet `.class` files.
