import java.util.HashSet;

/**
 * Slip 3 - Question 1
 * Program: HashSet – store names, add duplicates, observe unique-only storage.
 * Concepts: Collections, Set, HashSet, Hashing
 * Unit: UNIT 2 – Collections, Set, Hashing
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        // Add elements including duplicates
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");    // duplicate
        names.add("David");
        names.add("Bob");      // duplicate
        names.add("Eve");

        System.out.println("Names added (with duplicates): Alice, Bob, Charlie, Alice, David, Bob, Eve");
        System.out.println();
        System.out.println("HashSet (duplicates removed): " + names);
        System.out.println("Total unique names: " + names.size());
        System.out.println();
        System.out.println("Observation: HashSet does NOT allow duplicate values.");
        System.out.println("             Each element is stored only once.");
    }
}
