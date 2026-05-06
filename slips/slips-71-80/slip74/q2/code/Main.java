/**
 * Slip 74 Q2: Explain use of join() method in threads.
 * Unit: UNIT 2 – Multithreading
 */
class SampleThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== join() Method Explanation ===");
        SampleThread t1 = new SampleThread(); t1.setName("Thread-1");
        SampleThread t2 = new SampleThread(); t2.setName("Thread-2");
        
        t1.start();
        System.out.println("Main thread is waiting for Thread-1 to finish using t1.join()...");
        t1.join(); // Main waits here
        
        System.out.println("Thread-1 has finished. Main thread resumes.");
        System.out.println("Starting Thread-2...");
        t2.start();
    }
}
