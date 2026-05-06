import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Slip 71 Q2: Compare ArrayList and LinkedList.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();
        
        // Add elements
        al.add("Java"); al.add("Python"); al.add("C++");
        ll.add("Java"); ll.add("Python"); ll.add("C++");
        
        System.out.println("ArrayList : " + al);
        System.out.println("LinkedList: " + ll);
        
        // Remove element
        al.remove("Python");
        ll.remove("Python");
        
        System.out.println("\nAfter Removal:");
        System.out.println("ArrayList : " + al);
        System.out.println("LinkedList: " + ll);
        
        System.out.println("\nComparison:");
        System.out.println("- ArrayList uses dynamic array. Faster for search/access.");
        System.out.println("- LinkedList uses doubly linked list. Faster for insertions/deletions.");
    }
}
