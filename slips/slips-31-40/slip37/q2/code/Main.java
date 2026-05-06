/**
 * Slip 37 - Q2: Thread with custom name, display during execution.
 * Unit: UNIT 2 – Multithreading
 */
class NamedThread extends Thread {
    NamedThread(String name) { super(name); }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("[" + getName() + "] Step " + i);
        System.out.println("[" + getName() + "] finished.");
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        NamedThread t1 = new NamedThread("Worker-Alpha");
        NamedThread t2 = new NamedThread("Worker-Beta");
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Main thread done.");
    }
}
