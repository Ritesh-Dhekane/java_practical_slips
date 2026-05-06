import java.util.Scanner;

/**
 * Slip 53 Q1: String – Count vowels.
 * Unit: UNIT 1 – String Manipulation
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        System.out.println("Number of vowels present: " + vowels);
        sc.close();
    }
}
