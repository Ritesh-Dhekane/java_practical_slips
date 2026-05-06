# Slip 8 – Q2: Runtime Polymorphism – Employee & Manager

## What the program does
Demonstrates **runtime polymorphism** (dynamic dispatch). `Manager extends Employee`
and overrides `showInfo()` and `work()`. When an `Employee` reference holds a
`Manager` object, the overridden (Manager's) methods are called at runtime.

## Java Concepts Used
- **Inheritance** – `Manager extends Employee`
- **Method Overriding** – `@Override showInfo()`, `@Override work()`
- **Runtime Polymorphism** – `Employee ref = new Manager(...)` → calls Manager's methods
- **super()** – initializes Employee fields from Manager's constructor

## Syllabus Unit
**UNIT 1** – Polymorphism, Inheritance