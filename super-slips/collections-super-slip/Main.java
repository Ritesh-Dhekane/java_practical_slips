import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        demonstrateArrayList();
        demonstrateVector();
        demonstrateHashSet();
        demonstrateTreeSet();
        demonstrateHashMap();
    }

    private static void demonstrateArrayList() {
        System.out.println("=== ArrayList Demo ===");
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Pune", "Mumbai", "Nashik", "Nagpur", "Kolhapur");
        System.out.println("Original list: " + cities);

        Collections.sort(cities);
        System.out.println("Sorted list:   " + cities);
        System.out.println("Contains Pune? " + cities.contains("Pune"));
        System.out.println("Index of Nagpur: " + cities.indexOf("Nagpur"));
        System.out.println();
    }

    private static void demonstrateVector() {
        System.out.println("=== Vector Demo ===");
        Vector<String> employees = new Vector<>();
        employees.add("Amit Sharma");
        employees.add("Priya Patel");
        employees.add("Rahul Verma");

        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println("Employee: " + iterator.next());
        }
        System.out.println("Vector size: " + employees.size());
        System.out.println();
    }

    private static void demonstrateHashSet() {
        System.out.println("=== HashSet Demo ===");
        HashSet<Integer> numbers = new HashSet<>();
        Collections.addAll(numbers, 20, 40, 20, 60, 80, 40);
        System.out.println("Unique numbers: " + numbers);
        System.out.println("Search 60: " + numbers.contains(60));
        System.out.println();
    }

    private static void demonstrateTreeSet() {
        System.out.println("=== TreeSet Demo ===");
        TreeSet<Integer> marks = new TreeSet<>();
        Collections.addAll(marks, 75, 92, 68, 80, 75, 88);
        System.out.println("Sorted unique marks: " + marks);
        System.out.println("Lowest mark: " + marks.first());
        System.out.println("Highest mark: " + marks.last());
        System.out.println();
    }

    private static void demonstrateHashMap() {
        System.out.println("=== HashMap Demo ===");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Amit");
        students.put(102, "Priya");
        students.put(103, "Rohan");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Contains key 102? " + students.containsKey(102));
        System.out.println("Contains value Amit? " + students.containsValue("Amit"));
        System.out.println();
    }
}
