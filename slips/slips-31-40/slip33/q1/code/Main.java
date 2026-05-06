import java.util.ArrayList;
import java.util.Scanner;
/**
 * Slip 33 - Q1: ArrayList of cities – display those starting with a given letter.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mumbai"); cities.add("Pune"); cities.add("Nagpur");
        cities.add("Nashik"); cities.add("Kolhapur"); cities.add("Nanded");
        cities.add("Pimpri"); cities.add("Aurangabad");
        System.out.println("All Cities: " + cities);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter starting letter: ");
        char ch = sc.nextLine().toUpperCase().charAt(0);
        System.out.println("Cities starting with "" + ch + "":");
        for (String c : cities)
            if (Character.toUpperCase(c.charAt(0)) == ch)
                System.out.println("  - " + c);
        sc.close();
    }
}
