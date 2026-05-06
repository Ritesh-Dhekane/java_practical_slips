import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println('Enter 5 integers:');
        for(int i=0; i<5; i++) list.add(sc.nextInt());
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println('Unique elements: ' + set);
    }
}
