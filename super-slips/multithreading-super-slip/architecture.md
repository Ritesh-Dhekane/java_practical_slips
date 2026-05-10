# Multithreading Super Slip - Architecture

## Folder structure
```text
multithreading-super-slip/
├── Main.java
├── explanation.md
├── run.md
└── architecture.md
```

## Internal design
- `PriorityThread`: thread-subclass example
- `CounterTask`: runnable example
- `SynchronizedCounter`: shared resource protected with `synchronized`
- `SharedBuffer`: wait/notify communication example

## Flow
```text
Main -> Runnable vs Thread demo
     -> Priority + join demo
     -> Synchronization demo
     -> wait/notify demo
```

## Reuse value for normal slips
Use this project as the reference for:
- thread priority slips
- synchronization slips
- `join()` and `sleep()` slips
- producer-consumer explanation needs
