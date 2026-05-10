# Multithreading Super Slip - How to Run

## Compile
```bash
javac Main.java
```

## Run
```bash
java Main
```

## What to observe
- two different thread creation styles
- scheduling differences between threads
- how `join()` blocks the main thread
- how synchronization protects the shared counter
- how producer and consumer coordinate with `wait()` and `notifyAll()`
