# Slip 2 – Q2: Method Overriding – Person & Student

## What the program does
Demonstrates **method overriding** in Java. The base class `Person` defines
`display()`, and the derived class `Student` overrides it to show additional
student-specific fields. Also demonstrates runtime polymorphism via a `Person`
reference pointing to a `Student` object.

## Java Concepts Used
- **Inheritance** – `Student extends Person`
- **Method Overriding** – `@Override display()` in Student
- **super()** – invokes Person's constructor from Student
- **Runtime Polymorphism** – base-class reference calls overridden method

## Syllabus Unit
**UNIT 1** – Inheritance, Polymorphism