# Multithreading Super Slip - Explanation

## What this project demonstrates
- `Runnable` vs `Thread`
- `sleep()` and `join()`
- thread priorities
- synchronization with `synchronized`
- inter-thread communication using `wait()` and `notifyAll()`

## Learning sections inside the code
- section 1: creating threads in two common ways
- section 2: priority values and `join()`
- section 3: shared-data protection with synchronization
- section 4: producer-consumer style communication

## Thread lifecycle idea
- new
- runnable
- running
- blocked/waiting/timed waiting
- terminated

## Common mistakes
- updating shared state without synchronization
- assuming thread priority guarantees execution order
- forgetting to handle `InterruptedException`
- calling `wait()` / `notify()` outside synchronized code
