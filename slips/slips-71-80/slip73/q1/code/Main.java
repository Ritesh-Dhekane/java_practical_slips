import java.util.Scanner;

/**
 * Slip 73 Q1: Convert string to char array and display.
 * Unit: UNIT 1 – String Manipulation
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        char[] charArray = str.toCharArray();
        
        System.out.println("Character Array elements:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("Index " + i + " : " + charArray[i]);
        }
        sc.close();
    }
}
