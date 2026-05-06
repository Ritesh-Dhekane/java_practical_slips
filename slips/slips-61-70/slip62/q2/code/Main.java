/**
 * Slip 62 Q2: Static keyword demo.
 * Unit: UNIT 1 – static keyword
 */
class Counter {
    int instanceVar = 0; // Each object has its own copy
    static int staticVar = 0; // Shared across all objects
    
    Counter() {
        instanceVar++;
        staticVar++;
        System.out.println("instanceVar: " + instanceVar + " | staticVar: " + staticVar);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== static Keyword Demo ===");
        System.out.println("Creating object c1:");
        Counter c1 = new Counter();
        System.out.println("Creating object c2:");
        Counter c2 = new Counter();
        System.out.println("Creating object c3:");
        Counter c3 = new Counter();
        
        System.out.println("\nExplanation:");
        System.out.println(" - instanceVar resets for every object (always 1).");
        System.out.println(" - staticVar is shared, so it increments across all objects.");
    }
}
