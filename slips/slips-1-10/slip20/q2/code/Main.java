import java.util.Scanner;

/**
 * Slip 20 - Question 2
 * Program: Reverse the entire sentence entered by the user.
 * Concepts: String manipulation, StringBuilder
 * Unit: UNIT 1 – Class & Objects
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Reverse the entire sentence using StringBuilder
        String reversed = new StringBuilder(sentence).reverse().toString();

        System.out.println("Original  : " + sentence);
        System.out.println("Reversed  : " + reversed);

        sc.close();
    }
}
