import java.util.Scanner;
import java.util.Vector;

/**
 * Slip 17 - Question 1
 * Program: Vector of employee names – search for user-specified name.
 * Concepts: Collections, Vector, contains()
 * Unit: UNIT 2 – Collections, Vector
 */
public class Main {
    public static void main(String[] args) {
        Vector<String> employees = new Vector<>();
        employees.add("Amit Sharma");
        employees.add("Priya Patel");
        employees.add("Rahul Verma");
        employees.add("Sneha Joshi");
        employees.add("Rohan Desai");

        System.out.println("Employee List (Vector): " + employees);
        System.out.println("Total employees: " + employees.size());

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee name to search: ");
        String searchName = sc.nextLine().trim();

        if (employees.contains(searchName)) {
            int index = employees.indexOf(searchName);
            System.out.println("\"" + searchName + "\" FOUND at index " + index + ".");
        } else {
            System.out.println("\"" + searchName + "\" NOT FOUND in the employee list.");
        }

        sc.close();
    }
}
