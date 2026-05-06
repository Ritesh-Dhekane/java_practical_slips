import java.util.ArrayList;
import java.util.Collections;

/**
 * Slip 4 - Question 1
 * Program: ArrayList of 5 salaries – sort and find second highest.
 * Concepts: Collections, ArrayList, Collections.sort()
 * Unit: UNIT 2 – Collections, ArrayList
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> salaries = new ArrayList<>();

        // Store 5 salaries
        salaries.add(45000.0);
        salaries.add(72000.0);
        salaries.add(38000.0);
        salaries.add(91000.0);
        salaries.add(60000.0);

        System.out.println("Original Salaries: " + salaries);

        // Sort in ascending order
        Collections.sort(salaries);
        System.out.println("Sorted Salaries  : " + salaries);

        // Second highest is at index (size - 2) after sorting
        double secondHighest = salaries.get(salaries.size() - 2);
        System.out.println("Highest Salary   : Rs. " + salaries.get(salaries.size() - 1));
        System.out.println("Second Highest   : Rs. " + secondHighest);
    }
}
