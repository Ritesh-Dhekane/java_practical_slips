import java.util.ArrayList;

/**
 * Slip 68 Q2: ArrayList display elements within a given range.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10); nums.add(20); nums.add(30); nums.add(40);
        nums.add(50); nums.add(60); nums.add(70); nums.add(80);
        
        System.out.println("Full ArrayList: " + nums);
        
        int fromIndex = 2; // inclusive (30)
        int toIndex = 6;   // exclusive (70)
        
        System.out.println("SubList from index " + fromIndex + " to " + (toIndex-1) + ":");
        System.out.println(nums.subList(fromIndex, toIndex));
    }
}
