import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(10, 50, 30, 60));
        l.removeIf(n -> n < 40); System.out.println(l);
    }
}
