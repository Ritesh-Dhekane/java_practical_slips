import java.util.HashSet;
/**
 * Slip 42 Q1: HashSet – store integers, display unique count.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] data = {10, 20, 30, 20, 40, 10, 50, 30, 60};
        System.out.print("Input: ");
        for (int d : data) { System.out.print(d + " "); set.add(d); }
        System.out.println("\nHashSet (unique): " + set);
        System.out.println("Total unique elements: " + set.size());
    }
}
