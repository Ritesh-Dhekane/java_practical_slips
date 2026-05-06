import java.util.ArrayList;
import java.util.Collections;

/**
 * Slip 1 - Question 1
 * Program: ArrayList of integers – add, sort, and display.
 * Concepts: Collections, ArrayList, Collections.sort()
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add at least 5 elements
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(3);
        numbers.add(56);
        numbers.add(29);

        System.out.println("Original List: " + numbers);

        // Sort the list using built-in method
        Collections.sort(numbers);

        // Display the sorted list
        System.out.println("Sorted List:   " + numbers);
    }
}
