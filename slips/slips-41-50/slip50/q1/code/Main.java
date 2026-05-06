/**
 * Slip 50 Q1: Person class – constructor, display.
 * Unit: UNIT 1 – Class & Objects
 */
class Person {
    String name, address; int age; String phone;
    Person(String n, int a, String addr, String ph) { name=n; age=a; address=addr; phone=ph; }
    void display() {
        System.out.println("Name: "+name+", Age: "+age+", Address: "+address+", Phone: "+phone);
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Amit Sharma", 25, "Pune", "9876543210");
        Person p2 = new Person("Priya Patel", 30, "Mumbai", "9123456789");
        p1.display(); p2.display();
    }
}
