/**
 * Slip 79 Q2: Customer chaining with this().
 * Unit: UNIT 1 – Constructor Chaining
 */
class Customer {
    int id; String name, city;
    
    // Default constructor
    Customer() {
        this(0, "Unknown", "Unknown"); // calls fully parameterized constructor
        System.out.println("Default constructor called.");
    }
    
    // Partially parameterized constructor
    Customer(int id, String name) {
        this(id, name, "Not specified"); // calls fully parameterized constructor
        System.out.println("Partial constructor called.");
    }
    
    // Fully parameterized constructor
    Customer(int id, String name, String city) {
        this.id = id; this.name = name; this.city = city;
        System.out.println("Full constructor initializing values.");
    }
    
    void display() {
        System.out.println("Customer ID: " + id + " | Name: " + name + " | City: " + city + "\n");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Constructor Chaining Demo ===");
        
        Customer c1 = new Customer();
        c1.display();
        
        Customer c2 = new Customer(101, "Amit Sharma");
        c2.display();
        
        Customer c3 = new Customer(102, "Priya Patel", "Pune");
        c3.display();
    }
}
