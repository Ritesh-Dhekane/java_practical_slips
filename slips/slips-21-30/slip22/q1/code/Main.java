import java.util.Scanner;

/**
 * Slip 22 - Question 1
 * Program: Accept 5 customer names in array; count how many start with a vowel.
 * Concepts: Arrays, String, character check
 * Unit: UNIT 1 – Class & Objects
 */
public class Main {
    public static void main(String[] args) {
        String[] customers = {"Anjali Mehta", "Rahul Sharma", "Uday Patil",
                              "Isha Verma",   "Suresh Nair"};

        System.out.println("Customer Names:");
        for (int i = 0; i < customers.length; i++) {
            System.out.println((i + 1) + ". " + customers[i]);
        }

        // Count names starting with a vowel
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (String name : customers) {
            char firstChar = name.charAt(0);
            if (vowels.indexOf(firstChar) >= 0) {
                count++;
                System.out.println("  → \"" + name + "\" starts with vowel "" + firstChar + """);
            }
        }

        System.out.println("\nTotal names starting with a vowel: " + count);
    }
}
