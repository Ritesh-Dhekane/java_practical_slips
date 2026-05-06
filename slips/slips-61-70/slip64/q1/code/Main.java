import java.util.Arrays;
import java.util.Collections;

/**
 * Slip 64 Q1: Sort integer array in descending order.
 * Unit: UNIT 1 – Arrays
 */
public class Main {
    public static void main(String[] args) {
        // Use Integer instead of int to allow Collections.reverseOrder()
        Integer[] arr = {45, 12, 89, 33, 71, 5, 99};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
}
