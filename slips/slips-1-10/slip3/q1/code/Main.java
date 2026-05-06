import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");

        System.out.println("Initial Set: " + set);

        boolean isAdded = set.add("Alice");
        System.out.println("Attempt to insert duplicate 'Alice' successful? " + isAdded);

        System.out.println("Final Set: " + set);
        System.out.println("\nExplanation: HashSet does not allow duplicate elements. The add() method returns false if the element already exists.");
    }
}
