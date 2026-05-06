import java.util.ArrayList;

/**
 * Slip 13 - Question 1
 * Program: Accept 5 student names in an ArrayList, convert to uppercase, display.
 * Concepts: Collections, ArrayList, String.toUpperCase()
 * Unit: UNIT 2 – Collections, ArrayList
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Store 5 student names
        names.add("anjali mehta");
        names.add("rahul sharma");
        names.add("priya patel");
        names.add("vikram nair");
        names.add("sneha joshi");

        System.out.println("Original Names: " + names);

        // Convert all names to uppercase
        ArrayList<String> upperNames = new ArrayList<>();
        for (String name : names) {
            upperNames.add(name.toUpperCase());
        }

        System.out.println("Uppercase Names: " + upperNames);

        System.out.println("\nFormatted Output:");
        for (int i = 0; i < upperNames.size(); i++) {
            System.out.println((i + 1) + ". " + upperNames.get(i));
        }
    }
}
