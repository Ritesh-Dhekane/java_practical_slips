/**
 * Slip 65 Q1: Thread prints squares from 1 to 10.
 * Unit: UNIT 2 – Multithreading
 */
class SquareThread extends Thread {
    public void run() {
        System.out.println("Squares from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "² = " + (i * i));
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SquareThread t = new SquareThread();
        t.start();
        t.join();
        System.out.println("Done.");
    }
}
