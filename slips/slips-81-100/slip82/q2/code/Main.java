import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList('Banana', 'Apple', 'Cherry'));
        Collections.sort(list);
        System.out.println(list);
    }
}
