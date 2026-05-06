import java.util.Scanner;

/**
 * Slip 80 Q1: Reverse each word in a sentence.
 * Unit: UNIT 1 – String Manipulation
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
        }
        
        System.out.println("Reversed Words: " + reversedSentence.toString().trim());
        sc.close();
    }
}
