import java.util.Scanner;

/**
 * Slip 57 Q2: Accept name & age. If < 18, throw NotEligibleException.
 * Unit: UNIT 2 – User-defined Exception
 */
class NotEligibleException extends Exception {
    NotEligibleException(String msg) { super(msg); }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        
        try {
            if (age < 18) throw new NotEligibleException(name + ", age " + age + " is not eligible.");
            System.out.println(name + ", you are eligible.");
        } catch (NotEligibleException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        sc.close();
    }
}
