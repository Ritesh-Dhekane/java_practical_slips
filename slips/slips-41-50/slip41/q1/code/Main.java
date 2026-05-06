import java.util.ArrayList;
/**
 * Slip 41 Q1: ArrayList – count numbers greater than 30.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10); nums.add(45); nums.add(30); nums.add(55);
        nums.add(22); nums.add(67); nums.add(8); nums.add(33);
        System.out.println("ArrayList: " + nums);
        int count = 0;
        for (int n : nums) if (n > 30) { count++; System.out.println("  > 30: " + n); }
        System.out.println("Count of numbers > 30: " + count);
    }
}
