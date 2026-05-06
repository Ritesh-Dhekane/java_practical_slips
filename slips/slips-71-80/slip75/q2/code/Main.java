/**
 * Slip 75 Q2: Two threads - one prints numbers, one prints squares.
 * Unit: UNIT 2 – Multithreading
 */
class SquareThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumberThread t1 = new NumberThread();
        SquareThread t2 = new SquareThread();
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("Both threads completed.");
    }
}
