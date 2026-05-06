# Slip 19 – Q2: Thread Priority

## What the program does
Creates 3 threads with `MIN_PRIORITY(1)`, `NORM_PRIORITY(5)`, and `MAX_PRIORITY(10)`.
Each thread prints its name, priority, and executes 3 steps. Demonstrates that
higher-priority threads are preferred for CPU scheduling (JVM/OS-dependent).

## Java Concepts Used
- **Thread Priority** – `setPriority()`, `getPriority()`
- **Thread.MIN_PRIORITY / NORM_PRIORITY / MAX_PRIORITY** – constants 1, 5, 10
- **extends Thread** – custom thread by subclassing
- **join()** – main thread waits for all to complete

## Syllabus Unit
**UNIT 2** – Multithreading
