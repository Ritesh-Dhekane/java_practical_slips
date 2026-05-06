/**
 * Slip 45 Q1: Two threads – even and odd numbers 1-20.
 * Unit: UNIT 2 – Multithreading
 */
class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers (1-20):"); 
        for (int i=2;i<=20;i+=2) System.out.println("  Even: "+i);
    }
}
class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers (1-20):");
        for (int i=1;i<=20;i+=2) System.out.println("  Odd: "+i);
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenThread e = new EvenThread(); OddThread o = new OddThread();
        e.start(); o.start(); e.join(); o.join();
        System.out.println("Both threads completed.");
    }
}
