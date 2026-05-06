/**
 * Slip 76 Q2: Customer class + static count.
 * Note: Same as Slip 69 Q2.
 * Unit: UNIT 1 – static keyword
 */
class Customer {
    String name, mobile, address;
    static int objectCount = 0;
    
    Customer(String n, String m, String a) {
        name=n; mobile=m; address=a;
        objectCount++;
    }
    void display() {
        System.out.println("Customer: " + name + " | Mobile: " + mobile + " | Address: " + address);
        System.out.println("  -> Total customers created so far: " + objectCount);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Customer Object Counter ===");
        Customer c1 = new Customer("Amit", "9876543210", "Pune"); c1.display();
        Customer c2 = new Customer("Priya", "9123456789", "Mumbai"); c2.display();
        Customer c3 = new Customer("Rahul", "9988776655", "Delhi"); c3.display();
        
        System.out.println("\nFinal Count = " + Customer.objectCount);
    }
}
