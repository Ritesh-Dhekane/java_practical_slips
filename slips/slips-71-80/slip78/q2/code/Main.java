/**
 * Slip 78 Q2: Interface Payment. Implement in CashPayment and OnlinePayment.
 * Unit: UNIT 1 – Interfaces
 */
interface Payment {
    void pay(double amount);
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " in CASH.");
    }
}

class OnlinePayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via ONLINE transfer (UPI).");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Payment Interface Demo ===");
        Payment p1 = new CashPayment();
        Payment p2 = new OnlinePayment();
        
        p1.pay(500.0);
        p2.pay(1250.75);
    }
}
