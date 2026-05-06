import java.util.HashMap;
import java.util.Map;
/**
 * Slip 34 - Q1: HashMap – display using keySet() and values().
 * Unit: UNIT 2 – Collections, Map
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Amit"); map.put(102,"Priya"); map.put(103,"Rahul");
        map.put(104,"Sneha"); map.put(105,"Rohan");
        System.out.println("Using keySet():");
        for (Integer key : map.keySet())
            System.out.println("  Key: " + key + " → Value: " + map.get(key));
        System.out.println("\nUsing values():");
        System.out.println("  " + map.values());
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<Integer,String> e : map.entrySet())
            System.out.println("  " + e.getKey() + " = " + e.getValue());
    }
}
