/**
 * Slip 50 Q2: Thread synchronization demo.
 * Unit: UNIT 2 – Multithreading, synchronized
 */
class Counter {
    private int count = 0;
    synchronized void increment() { count++; }
    int getCount() { return count; }
}
class CounterThread extends Thread {
    Counter c;
    CounterThread(Counter c, String name) { super(name); this.c = c; }
    public void run() {
        for (int i = 0; i < 1000; i++) c.increment();
        System.out.println(getName() + " done. Count so far: " + c.getCount());
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Thread Synchronization Demo ===\n");
        Counter c = new Counter();
        CounterThread t1 = new CounterThread(c, "Thread-1");
        CounterThread t2 = new CounterThread(c, "Thread-2");
        CounterThread t3 = new CounterThread(c, "Thread-3");
        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();
        System.out.println("\nFinal count: " + c.getCount() + " (expected: 3000)");
        System.out.println("Without synchronized, count could be < 3000 due to race conditions.");
    }
}
