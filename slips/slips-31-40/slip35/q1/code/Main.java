import java.util.Scanner;
/**
 * Slip 35 - Q1: Thread extends Thread – display multiplication table.
 * Unit: UNIT 2 – Multithreading
 */
class TableThread extends Thread {
    int number;
    TableThread(int n) { super("Table-" + n); this.number = n; }
    @Override
    public void run() {
        System.out.println(getName() + " started:");
        for (int i = 1; i <= 10; i++)
            System.out.println("  " + number + " x " + i + " = " + (number*i));
        System.out.println(getName() + " finished.\n");
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int num = sc.nextInt();
        TableThread t = new TableThread(num);
        t.start();
        t.join();
        System.out.println("Main thread completed.");
        sc.close();
    }
}
