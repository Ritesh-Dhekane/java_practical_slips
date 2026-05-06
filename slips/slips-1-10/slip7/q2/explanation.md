# Slip 7 – Q2: Thread with Custom Name

## What the program does
Creates two threads (`WorkerThread-Alpha`, `WorkerThread-Beta`) by extending `Thread`.
Each thread prints its **custom name**, state, ID, and priority, then loops 5 steps.
The `main` thread waits for both using `join()`.

## Java Concepts Used
- **Thread class** – `extends Thread`
- **super(name)** – sets custom thread name in constructor
- **getName()** – retrieves thread name during execution
- **getId()**, **getPriority()**, **getState()** – thread introspection
- **Thread.sleep()** – simulates work
- **join()** – synchronize main thread

## Syllabus Unit
**UNIT 2** – Multithreading