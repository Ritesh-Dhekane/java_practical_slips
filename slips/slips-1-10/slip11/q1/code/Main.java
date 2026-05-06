import java.util.ArrayList;
import java.util.Scanner;

/**
 * Slip 11 - Question 1
 * Program: ArrayList of department names; accept user input and check if it exists.
 * Concepts: Collections, ArrayList, contains(), user input
 * Unit: UNIT 2 – Collections, ArrayList
 */
public class Main {
    public static void main(String[] args) {
        // Store department names in an ArrayList
        ArrayList<String> departments = new ArrayList<>();
        departments.add("IT");
        departments.add("HR");
        departments.add("Finance");
        departments.add("Marketing");
        departments.add("Operations");

        System.out.println("Available Departments: " + departments);
        System.out.println();

        // Accept a department name from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department name to search: ");
        String input = sc.nextLine().trim();

        // Check whether it exists in the list
        if (departments.contains(input)) {
            System.out.println("\"" + input + "\" department EXISTS in the list.");
        } else {
            System.out.println("\"" + input + "\" department does NOT exist in the list.");
        }

        sc.close();
    }
}
