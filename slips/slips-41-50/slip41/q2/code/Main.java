/**
 * Slip 41 Q2: Demonstrate join() and yield() in multithreading.
 * Unit: UNIT 2 – Multithreading
 */
class JoinThread extends Thread {
    JoinThread(String name) { super(name); }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - step " + i);
            Thread.yield(); // hint to scheduler to give other threads a chance
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== join() and yield() Demo ===\n");
        JoinThread t1 = new JoinThread("Thread-A");
        JoinThread t2 = new JoinThread("Thread-B");
        t1.start();
        t1.join(); // main waits for t1 to finish before starting t2
        System.out.println("Thread-A finished (join). Starting Thread-B...\n");
        t2.start();
        t2.join();
        System.out.println("\nBoth threads done. Main exits.");
        System.out.println("\njoin()  – calling thread waits until target thread completes.");
        System.out.println("yield() – hints scheduler to let other same-priority threads run.");
    }
}
