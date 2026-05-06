import java.util.ArrayList;
import java.util.Scanner;

/**
 * Slip 72 Q2: ArrayList of cities, display starting with given letter.
 * Unit: UNIT 2 – Collections
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Pune"); cities.add("Mumbai"); cities.add("Delhi");
        cities.add("Patna"); cities.add("Chennai"); cities.add("Panaji");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cities: " + cities);
        System.out.print("Enter starting letter: ");
        String letter = sc.next().toUpperCase();
        
        System.out.println("Cities starting with '" + letter + "':");
        boolean found = false;
        for (String city : cities) {
            if (city.toUpperCase().startsWith(letter)) {
                System.out.println(" - " + city);
                found = true;
            }
        }
        if (!found) System.out.println("No cities found.");
        sc.close();
    }
}
