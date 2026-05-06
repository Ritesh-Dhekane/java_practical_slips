/**
 * Slip 36 - Q1: NullPointerException handling.
 * Unit: UNIT 2 – Exception Handling
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== NullPointerException Demo ===\n");
        // Test 1
        try {
            String s = null;
            System.out.println("Length: " + s.length());
        } catch (NullPointerException e) {
            System.out.println("Test 1 – Caught NullPointerException: " + e.getMessage());
            System.out.println("  Cause: tried to call method on null reference.\n");
        }
        // Test 2
        try {
            String[] arr = new String[3];
            System.out.println(arr[0].toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Test 2 – Caught NullPointerException: " + e.getMessage());
            System.out.println("  Cause: array element is null by default.\n");
        }
        // Test 3 – safe code
        String name = "Java";
        if (name != null) System.out.println("Safe access: " + name.length());
    }
}
