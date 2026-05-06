import java.util.HashMap;
import java.util.Map;

/**
 * Slip 2 - Question 1
 * Program: HashMap<Integer,String> with rollNo and name – insert and display using entrySet().
 * Concepts: Collections, HashMap, entrySet()
 * Unit: UNIT 2 – Collections, Map, Hashing
 */
public class Main {
    public static void main(String[] args) {
        // Create a HashMap<Integer, String> (rollNo -> name)
        HashMap<Integer, String> students = new HashMap<>();

        // Insert at least 5 entries
        students.put(101, "Amit Sharma");
        students.put(102, "Priya Patel");
        students.put(103, "Rahul Verma");
        students.put(104, "Sneha Joshi");
        students.put(105, "Rohan Desai");

        System.out.println("RollNo\t\tName");
        System.out.println("------\t\t----");

        // Display all entries using entrySet()
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}
