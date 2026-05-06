/**
 * Slip 40 - Q1: Manager class – parameterized constructor, display details.
 * Unit: UNIT 1 – Class & Objects
 */
class Manager {
    int managerId; String name, department;
    Manager(int id, String n, String d) { managerId=id; name=n; department=d; }
    void display() {
        System.out.println("ID: " + managerId + " | Name: " + name + " | Dept: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager(401, "Sunita Rao", "IT");
        Manager m2 = new Manager(402, "Kiran Mehta", "Finance");
        Manager m3 = new Manager(403, "Rajesh Verma", "HR");
        System.out.println("=== Manager Details ===");
        m1.display(); m2.display(); m3.display();
    }
}
