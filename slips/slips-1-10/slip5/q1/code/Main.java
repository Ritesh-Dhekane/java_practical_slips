/**
 * Slip 5 - Question 1
 * Program: Multithreading using Runnable – print numbers 1-10 with thread name.
 * Concepts: Multithreading, Runnable interface, Thread naming
 * Unit: UNIT 2 – Multithreading
 */
class NumberPrinter implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread started: " + threadName);
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + " -> " + i);
            try {
                Thread.sleep(100); // small delay to simulate real thread execution
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("Thread finished: " + threadName);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getName());
        System.out.println();

        // Create Runnable and Thread with a custom name
        Runnable task = new NumberPrinter();
        Thread t = new Thread(task, "NumberThread-1");

        // Start the thread
        t.start();

        try {
            t.join(); // wait for thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAll threads completed.");
    }
}
