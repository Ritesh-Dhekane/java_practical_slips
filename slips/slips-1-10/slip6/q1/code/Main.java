import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.hasNext() ? sc.next() : "abc";

        try {
            int num = Integer.parseInt(input);
            System.out.println("Successfully converted to integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception Caught: Invalid input. Cannot convert '" + input + "' to integer.");
        }
    }
}
