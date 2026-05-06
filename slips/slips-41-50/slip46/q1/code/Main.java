/**
 * Slip 46 Q1: Multiple exceptions – ArithmeticException & ArrayIndexOutOfBounds.
 * Unit: UNIT 2 – Exception Handling
 */
public class Main {
    public static void main(String[] args) {
        // ArithmeticException
        try { int r = 50/0; }
        catch (ArithmeticException e) { System.out.println("ArithmeticException: " + e.getMessage()); }
        // ArrayIndexOutOfBoundsException
        try { int[] a = {1,2,3}; System.out.println(a[10]); }
        catch (ArrayIndexOutOfBoundsException e) { System.out.println("ArrayIndexOutOfBounds: " + e.getMessage()); }
        System.out.println("Program continues after exceptions.");
    }
}
