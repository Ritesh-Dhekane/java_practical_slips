import java.util.Scanner;
/**
 * Slip 39 - Q2: Accept salary from user, handle invalid input with exception handling.
 * Unit: UNIT 2 – Exception Handling
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = {"50000", "abc", "-100", "75000.50"};
        for (String input : inputs) {
            System.out.print("Input: \"" + input + "\" → ");
            try {
                double salary = Double.parseDouble(input);
                if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative.");
                System.out.println("Valid salary: Rs. " + salary);
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Not a number: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid! " + e.getMessage());
            }
        }
        sc.close();
    }
}
