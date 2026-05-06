import java.util.Map;
import java.util.TreeMap;

/**
 * Slip 12 - Question 1
 * Program: TreeMap<Integer, String> – insert 5 key-value pairs, display sorted by key.
 * Concepts: Collections, TreeMap, sorted Map
 * Unit: UNIT 2 – Collections, Map
 */
public class Main {
    public static void main(String[] args) {
        // TreeMap automatically keeps keys in ascending sorted order
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        // Insert at least 5 elements (intentionally out of order to show sorting)
        studentMap.put(104, "Sneha Joshi");
        studentMap.put(101, "Amit Sharma");
        studentMap.put(103, "Rahul Verma");
        studentMap.put(105, "Rohan Desai");
        studentMap.put(102, "Priya Patel");

        System.out.println("TreeMap – All elements (automatically sorted by key):");
        System.out.println();
        System.out.println("Roll No\t\tName");
        System.out.println("-------\t\t----");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }

        System.out.println();
        System.out.println("First key (lowest) : " + studentMap.firstKey());
        System.out.println("Last key  (highest): " + studentMap.lastKey());
        System.out.println("Total entries      : " + studentMap.size());
    }
}
