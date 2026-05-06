import java.util.ArrayList;
import java.util.Scanner;

/**
 * Slip 23 - Question 1
 * Program: ArrayList of integers – display numbers within a user-given range.
 * Concepts: Collections, ArrayList, range filtering
 * Unit: UNIT 2 – Collections, ArrayList
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5); numbers.add(12); numbers.add(34); numbers.add(7);
        numbers.add(89); numbers.add(21); numbers.add(45); numbers.add(3);
        numbers.add(67); numbers.add(15);

        System.out.println("ArrayList: " + numbers);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter lower bound: ");
        int low  = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int high = sc.nextInt();

        System.out.println("\nNumbers between " + low + " and " + high + " (inclusive):");
        ArrayList<Integer> inRange = new ArrayList<>();
        for (int n : numbers) {
            if (n >= low && n <= high) inRange.add(n);
        }

        if (inRange.isEmpty()) System.out.println("No numbers found in that range.");
        else System.out.println(inRange);

        sc.close();
    }
}
