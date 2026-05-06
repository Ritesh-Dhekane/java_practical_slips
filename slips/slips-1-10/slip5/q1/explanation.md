# Slip 5 – Q1: Multithreading with Runnable

## What the program does
Implements multithreading using the `Runnable` interface. Creates a named thread
`NumberThread-1` that prints numbers 1 to 10. The main thread waits for it using
`join()`.

## Java Concepts Used
- **Runnable interface** – `implements Runnable`, override `run()`
- **Thread class** – `new Thread(task, "ThreadName")`
- **Thread naming** – `Thread.currentThread().getName()`
- **Thread.sleep()** – pause execution
- **join()** – main thread waits for this thread to finish

## Syllabus Unit
**UNIT 2** – Multithreading