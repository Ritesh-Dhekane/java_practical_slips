/**
 * Slip 43 Q1: Accept 5 names, reverse each and display.
 * Unit: UNIT 1 – String manipulation
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {"Amit", "Priya", "Rahul", "Sneha", "Rohan"};
        System.out.println("Original → Reversed:");
        for (String name : names)
            System.out.println("  " + name + " → " + new StringBuilder(name).reverse());
    }
}
