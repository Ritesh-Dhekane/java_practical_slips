/**
 * Slip 25 - Question 1
 * Program: Multiple exception handling using multiple catch blocks.
 * Concepts: Exception Handling, multiple catch
 * Unit: UNIT 2 – Exception Handling
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Multiple Exception Handling Demo ===\n");

        // Test 1: ArithmeticException
        System.out.println("--- Test 1: ArithmeticException ---");
        try {
            int result = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught generic Exception.");
        } finally {
            System.out.println("finally block executed.");
        }

        System.out.println();

        // Test 2: ArrayIndexOutOfBoundsException
        System.out.println("--- Test 2: ArrayIndexOutOfBoundsException ---");
        try {
            int[] arr = new int[3];
            arr[10] = 99;   // out of bounds
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("finally block executed.");
        }

        System.out.println();

        // Test 3: NumberFormatException
        System.out.println("--- Test 3: NumberFormatException ---");
        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught generic Exception.");
        } finally {
            System.out.println("finally block executed.");
        }

        System.out.println();

        // Test 4: NullPointerException
        System.out.println("--- Test 4: NullPointerException ---");
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException.");
        } finally {
            System.out.println("finally block executed.");
        }
    }
}
