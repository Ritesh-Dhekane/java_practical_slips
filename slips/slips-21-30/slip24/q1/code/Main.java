/**
 * Slip 24 - Question 1
 * Program: Two threads – one prints 1-5, another prints 6-10.
 * Concepts: Multithreading, Thread class
 * Unit: UNIT 2 – Multithreading
 */
class Thread1 extends Thread {
    Thread1() { super("Thread-1 (1-5)"); }

    @Override
    public void run() {
        System.out.println(getName() + " started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " → " + i);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        System.out.println(getName() + " finished.");
    }
}

class Thread2 extends Thread {
    Thread2() { super("Thread-2 (6-10)"); }

    @Override
    public void run() {
        System.out.println(getName() + " started.");
        for (int i = 6; i <= 10; i++) {
            System.out.println(getName() + " → " + i);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        System.out.println(getName() + " finished.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread: " + Thread.currentThread().getName());

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nBoth threads completed.");
    }
}
