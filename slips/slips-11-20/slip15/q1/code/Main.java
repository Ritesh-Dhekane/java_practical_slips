/**
 * Slip 15 - Question 1
 * Program: Accept 5 integers, copy to another array in reverse order, display.
 * Concepts: Arrays, reverse copy
 * Unit: UNIT 1 – Class & Objects (Arrays)
 */
public class Main {
    public static void main(String[] args) {
        // Original array with 5 integers
        int[] original = {10, 25, 38, 47, 56};
        int   n        = original.length;

        // Copy into another array in reverse order
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = original[n - 1 - i];
        }

        // Display original
        System.out.print("Original Array : ");
        for (int val : original) System.out.print(val + " ");

        // Display reversed
        System.out.print("\nReversed Array : ");
        for (int val : reversed) System.out.print(val + " ");
        System.out.println();
    }
}
