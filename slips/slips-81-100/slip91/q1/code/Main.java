import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amit", "Ajay", "Babu"));
        for(String n : names) if(n.startsWith("A")) System.out.println(n);
    }
}
