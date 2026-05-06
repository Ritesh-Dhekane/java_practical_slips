# Slip 17 – Q2: Checked vs Unchecked Exceptions

## What the program does
Demonstrates the two categories of Java exceptions:
1. **Checked** – `IOException` (file not found); compiler forces handling via `try-catch` or `throws`
2. **Unchecked** – `ArithmeticException` (÷ by zero), `NullPointerException`, `ArrayIndexOutOfBoundsException`; no compiler enforcement

## Java Concepts Used
- **try-catch** – exception handling block
- **IOException** – checked exception (extends Exception)
- **RuntimeException** subclasses – unchecked (ArithmeticException, NPE, AIOOBE)
- **throws** – declares checked exception in method signature

## Syllabus Unit
**UNIT 2** – Exception Handling
