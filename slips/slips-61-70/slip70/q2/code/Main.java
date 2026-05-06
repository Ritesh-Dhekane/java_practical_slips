import java.util.ArrayList;
import java.util.Collections;

/**
 * Slip 70 Q2: ArrayList of strings, sort alphabetically.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        
        System.out.println("Original ArrayList:");
        System.out.println(fruits);
        
        // Built-in method to sort alphabetically
        Collections.sort(fruits);
        
        System.out.println("\nSorted ArrayList (Alphabetical):");
        System.out.println(fruits);
    }
}
