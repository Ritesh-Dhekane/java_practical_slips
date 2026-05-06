/**
 * Slip 60 Q2: Person class with 3 constructors. Demonstrate this() and keyword.
 * Note: Same logic as Slip 56 Q1.
 * Unit: UNIT 1 – Class & Objects
 */
class Person {
    String aadhar, name, address;
    
    // Constructor 1: Default
    Person() {
        this("Unknown Aadhar", "Unknown Name", "Unknown Address");
        System.out.println("Default constructor called this(...)");
    }
    
    // Constructor 2: Partially parameterized
    Person(String aadhar, String name) {
        this(aadhar, name, "Not Provided");
        System.out.println("Partial constructor called this(...)");
    }
    
    // Constructor 3: Fully parameterized
    Person(String aadhar, String name, String address) {
        // "this" keyword to resolve naming ambiguity
        this.aadhar = aadhar;
        this.name = name;
        this.address = address;
        System.out.println("Full constructor initializing attributes.");
    }
    
    void display() {
        System.out.println("  Name: " + name + " | Aadhar: " + aadhar + " | Address: " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== this() and this Demo ===");
        
        System.out.println("\nCreating p1 (Default):");
        Person p1 = new Person();
        p1.display();
        
        System.out.println("\nCreating p2 (Partial):");
        Person p2 = new Person("1234-5678", "Amit Sharma");
        p2.display();
        
        System.out.println("\nCreating p3 (Full):");
        Person p3 = new Person("9876-5432", "Priya Patel", "Pune");
        p3.display();
    }
}
