/**
 * Slip 44 Q1: Merge two integer arrays into one and display.
 * Unit: UNIT 1 – Arrays
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {10, 20, 30}, b = {40, 50, 60, 70};
        int[] merged = new int[a.length + b.length];
        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        System.out.print("Array 1: "); for (int v : a) System.out.print(v + " ");
        System.out.print("\nArray 2: "); for (int v : b) System.out.print(v + " ");
        System.out.print("\nMerged : "); for (int v : merged) System.out.print(v + " ");
        System.out.println();
    }
}
