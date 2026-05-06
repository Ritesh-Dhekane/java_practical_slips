import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5,2,5,1);
        Collections.sort(l); System.out.println(l);
        System.out.println(new HashSet<>(l));
    }
}
