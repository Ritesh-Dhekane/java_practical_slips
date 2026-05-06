/**
 * Slip 74 Q1: Thread prints Fibonacci series up to 10 terms.
 * Unit: UNIT 2 – Multithreading
 */
class FiboThread extends Thread {
    public void run() {
        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.println("Fibonacci Series up to " + count + " terms:");
        System.out.print(n1 + " " + n2);
        
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        FiboThread t = new FiboThread();
        t.start();
    }
}
