# Slip 11 – Q2: Runtime Polymorphism – Employee & Manager

## What the program does
Demonstrates **runtime polymorphism**. `Manager extends Employee` and overrides
`display()` and `describe()`. A polymorphic `Employee[]` array holds both
`Employee` and `Manager` objects; the correct overridden method is called at runtime.

## Java Concepts Used
- **Inheritance** – `Manager extends Employee`
- **Method Overriding** – `@Override display()`, `@Override describe()`
- **Runtime Polymorphism** – `Employee` reference → `Manager` object
- **Polymorphic array** – `Employee[] staff = { new Employee(), new Manager(), ... }`

## Syllabus Unit
**UNIT 1** – Polymorphism, Inheritance
