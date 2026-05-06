import java.util.ArrayList;

/**
 * Slip 52 Q1: ArrayList – remove elements less than 40.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] data = {10, 50, 30, 80, 25, 90, 35, 45, 100};
        for (int d : data) list.add(d);
        System.out.println("Original ArrayList: " + list);
        // Remove elements < 40 using removeIf (Java 8+)
        list.removeIf(n -> n < 40);
        System.out.println("Updated ArrayList (removed < 40): " + list);
    }
}
