import java.util.TreeSet;

/**
 * Slip 51 Q1: TreeSet – store integers, display in sorted order.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        int[] data = {50, 10, 30, 20, 60, 40};
        System.out.print("Input data: ");
        for (int d : data) {
            System.out.print(d + " ");
            ts.add(d);
        }
        System.out.println("\nTreeSet (Sorted automatically): " + ts);
    }
}
