import java.util.Scanner;

/**
 * Slip 63 Q1: Accept string, count uppercase characters.
 * Unit: UNIT 1 – String Manipulation
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int upperCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upperCount++;
            }
        }
        
        System.out.println("String: " + str);
        System.out.println("Uppercase characters count: " + upperCount);
        sc.close();
    }
}
