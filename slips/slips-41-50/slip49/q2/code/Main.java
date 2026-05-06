import java.util.ArrayList; import java.util.LinkedList;
/**
 * Slip 49 Q2: ArrayList and LinkedList – add elements and display.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Java"); al.add("Python"); al.add("C++");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Spring"); ll.add("Hibernate"); ll.add("JSP");
        System.out.println("ArrayList : " + al);
        System.out.println("LinkedList: " + ll);
        al.add(1, "Kotlin"); ll.addFirst("Servlet"); ll.addLast("JDBC");
        System.out.println("\nAfter modifications:");
        System.out.println("ArrayList : " + al);
        System.out.println("LinkedList: " + ll);
    }
}
