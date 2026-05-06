import java.util.HashSet;

/**
 * Slip 72 Q1: Identify and display duplicate elements in an array.
 * Unit: UNIT 1 – Arrays
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 50, 10, 60, 30};
        
        System.out.print("Array: ");
        for(int a : arr) System.out.print(a + " ");
        
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        System.out.println("\n\nDuplicate elements: " + duplicates);
    }
}
