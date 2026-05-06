/**
 * Slip 7 - Question 2
 * Program: Create a thread with a custom name; display thread name during execution.
 * Concepts: Multithreading, Thread class, custom thread name
 * Unit: UNIT 2 – Multithreading
 */
class NamedThread extends Thread {

    // Constructor sets a custom thread name via super
    NamedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread Name : " + getName());
        System.out.println("Thread State: " + getState());
        System.out.println("Thread ID   : " + getId());
        System.out.println("Priority    : " + getPriority());
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + getName() + "] Executing step " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("[" + getName() + "] Finished.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread: " + Thread.currentThread().getName());

        NamedThread t1 = new NamedThread("WorkerThread-Alpha");
        NamedThread t2 = new NamedThread("WorkerThread-Beta");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nAll named threads have completed.");
    }
}
