/**
 * Slip 19 - Question 2
 * Program: Thread priority – create multiple threads with different priorities.
 * Concepts: Multithreading, Thread Priority
 * Unit: UNIT 2 – Multithreading
 */
class PriorityTask extends Thread {
    PriorityTask(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread: " + getName()
            + " | Priority: " + getPriority()
            + " | State: " + getState());

        for (int i = 1; i <= 3; i++) {
            System.out.println("  [" + getName() + "] step " + i);
        }
        System.out.println("  [" + getName() + "] finished.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Thread Priority Demo ===\n");
        System.out.println("Priority Constants:");
        System.out.println("  MIN_PRIORITY  = " + Thread.MIN_PRIORITY);
        System.out.println("  NORM_PRIORITY = " + Thread.NORM_PRIORITY);
        System.out.println("  MAX_PRIORITY  = " + Thread.MAX_PRIORITY);
        System.out.println();

        // Create threads with different priorities
        PriorityTask low    = new PriorityTask("LowPriority",    Thread.MIN_PRIORITY);  // 1
        PriorityTask normal = new PriorityTask("NormalPriority", Thread.NORM_PRIORITY); // 5
        PriorityTask high   = new PriorityTask("HighPriority",   Thread.MAX_PRIORITY);  // 10

        // Start all threads
        low.start();
        normal.start();
        high.start();

        low.join();
        normal.join();
        high.join();

        System.out.println("\nAll threads completed.");
        System.out.println("Note: High priority thread gets more CPU time but order is JVM-dependent.");
    }
}
