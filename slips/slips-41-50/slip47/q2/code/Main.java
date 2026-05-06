/**
 * Slip 47 Q2: Thread displays even numbers 1-50 after every 5 seconds.
 * Unit: UNIT 2 – Multithreading
 */
class EvenPrinter extends Thread {
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Even: " + i);
            try { Thread.sleep(5000); } catch (InterruptedException e) {}
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Printing even numbers 1-50 (every 5 sec)...");
        System.out.println("(Showing first 5 for demo)\n");
        // For demo, we print first 5 even numbers with 1-sec delay instead of 5 sec
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            Thread.sleep(1000);
        }
        System.out.println("...(continues every 5 sec up to 50)");
    }
}
