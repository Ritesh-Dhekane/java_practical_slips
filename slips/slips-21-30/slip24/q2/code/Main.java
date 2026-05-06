/**
 * Slip 24 - Question 2
 * Program: Manager class with managerId, name, department – parameterized constructor.
 * Concepts: Class & Objects, Constructor, Object creation
 * Unit: UNIT 1 – Class & Objects
 */
class Manager {
    int    managerId;
    String name;
    String department;

    // Parameterized constructor
    Manager(int managerId, String name, String department) {
        this.managerId  = managerId;
        this.name       = name;
        this.department = department;
    }

    void display() {
        System.out.println("================================");
        System.out.println("Manager Details");
        System.out.println("================================");
        System.out.println("Manager ID : " + managerId);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("================================");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Manager objects using parameterized constructor
        Manager m1 = new Manager(301, "Anil Sharma",   "IT");
        Manager m2 = new Manager(302, "Sunita Patel",  "Finance");
        Manager m3 = new Manager(303, "Rajesh Verma",  "HR");

        m1.display();
        System.out.println();
        m2.display();
        System.out.println();
        m3.display();
    }
}
