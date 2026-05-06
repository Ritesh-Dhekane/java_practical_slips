import java.util.Arrays;

/**
 * Slip 30 - Question 1
 * Program: Accept employee names in an array, sort alphabetically and display.
 * Concepts: Arrays, String sorting, Arrays.sort()
 * Unit: UNIT 1 – Class & Objects
 */
public class Main {
    public static void main(String[] args) {
        String[] employees = {"Rahul Sharma", "Anjali Mehta", "Vikram Nair",
                              "Priya Patel",  "Suresh Joshi"};

        System.out.println("Original Order:");
        for (int i = 0; i < employees.length; i++)
            System.out.println("  " + (i+1) + ". " + employees[i]);

        Arrays.sort(employees);

        System.out.println("\nAlphabetically Sorted:");
        for (int i = 0; i < employees.length; i++)
            System.out.println("  " + (i+1) + ". " + employees[i]);
    }
}
