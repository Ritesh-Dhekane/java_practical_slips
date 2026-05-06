import java.util.Scanner;

/**
 * Slip 75 Q1: Accept number as string. Handle invalid input.
 * Unit: UNIT 2 – Exception Handling
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (as string): ");
        String input = sc.nextLine();
        
        try {
            int num = Integer.parseInt(input);
            System.out.println("Parsed Integer successfully: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! Exception caught: " + e.getMessage());
        }
        sc.close();
    }
}
