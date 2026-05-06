import java.util.Scanner;

/**
 * Slip 61 Q1: Customer class, accept 5, display names length > 5.
 * Unit: UNIT 1 – Class & Objects
 */
class Customer {
    int custId; String name, email;
    Customer(int id, String n, String e) { custId=id; name=n; email=e; }
    void display() { System.out.println("ID: " + custId + " | Name: " + name + " | Email: " + email); }
}

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
            new Customer(1, "Amit", "amit@mail"),
            new Customer(2, "Siddharth", "sid@mail"),
            new Customer(3, "Priya", "priya@mail"),
            new Customer(4, "Aishwarya", "aish@mail"),
            new Customer(5, "Ravi", "ravi@mail")
        };
        
        System.out.println("Customers with name length > 5:");
        for (Customer c : customers) {
            if (c.name.length() > 5) {
                c.display();
            }
        }
    }
}
