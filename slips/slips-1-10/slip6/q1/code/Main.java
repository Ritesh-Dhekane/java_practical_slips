import java.util.Scanner;

/**
 * Slip 6 - Question 1
 * Program: Accept a number as string, convert to int, handle invalid input.
 * Concepts: Exception Handling, NumberFormatException, try-catch-finally
 * Unit: UNIT 2 – Exception Handling
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        try {
            // Try to convert the string to integer
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
            System.out.println("Square of the number: " + (number * number));

        } catch (NumberFormatException e) {
            // Handles invalid input like letters or special characters
            System.out.println("Error: \"" + input + "\" is not a valid integer.");
            System.out.println("Exception: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Program execution complete.");
            sc.close();
        }
    }
}
