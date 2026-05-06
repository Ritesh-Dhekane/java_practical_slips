import java.util.LinkedList;
import java.util.Scanner;

/**
 * Slip 14 - Question 1
 * Program: LinkedList<String> – add 5 elements, remove user-specified element, display.
 * Concepts: Collections, LinkedList, remove()
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        // Add 5 elements
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Nashik");
        cities.add("Nagpur");
        cities.add("Kolhapur");

        System.out.println("Initial LinkedList: " + cities);

        // Accept element to remove from user
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter city name to remove: ");
        String toRemove = sc.nextLine().trim();

        // Remove the element
        if (cities.remove(toRemove)) {
            System.out.println("\"" + toRemove + "\" removed successfully.");
        } else {
            System.out.println("\"" + toRemove + "\" not found in the list.");
        }

        System.out.println("\nRemaining elements: " + cities);
        System.out.println("Size after removal : " + cities.size());
        sc.close();
    }
}
