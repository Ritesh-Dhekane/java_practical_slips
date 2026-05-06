import java.io.FileInputStream;
import java.io.IOException;

/**
 * Slip 17 - Question 2
 * Program: Checked and Unchecked Exceptions demonstration.
 * Concepts: Exception Handling, Checked vs Unchecked exceptions
 * Unit: UNIT 2 – Exception Handling
 */
public class Main {

    // ===== CHECKED EXCEPTION =====
    // Must be declared with throws or caught with try-catch
    static void checkedExample() throws IOException {
        System.out.println("--- Checked Exception (IOException) ---");
        try {
            // Trying to read a non-existent file → throws IOException
            FileInputStream fis = new FileInputStream("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
            System.out.println("IOException is CHECKED – compiler forces you to handle it.");
        }
    }

    // ===== UNCHECKED EXCEPTION =====
    // Extends RuntimeException – NOT required to declare with throws
    static void uncheckedExample() {
        System.out.println("\n--- Unchecked Exception (ArithmeticException) ---");
        try {
            int result = 10 / 0;   // ArithmeticException: / by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
            System.out.println("ArithmeticException is UNCHECKED – compiler does NOT force handling.");
        }

        System.out.println("\n--- Unchecked Exception (NullPointerException) ---");
        try {
            String s = null;
            System.out.println(s.length());  // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        System.out.println("\n--- Unchecked Exception (ArrayIndexOutOfBoundsException) ---");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);   // index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("=== Checked vs Unchecked Exceptions ===\n");
        checkedExample();
        uncheckedExample();

        System.out.println();
        System.out.println("Summary:");
        System.out.println("CHECKED   – IOException, SQLException, FileNotFoundException");
        System.out.println("UNCHECKED – ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException");
    }
}
