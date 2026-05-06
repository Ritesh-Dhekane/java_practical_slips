/**
 * Slip 55 Q1: Thread that prints numbers in reverse order 10 to 1.
 * Unit: UNIT 2 – Multithreading
 */
class ReverseThread extends Thread {
    public void run() {
        System.out.println("Printing 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
        System.out.println("\nThread finished.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReverseThread t = new ReverseThread();
        t.start();
        t.join();
        System.out.println("Main exits.");
    }
}
