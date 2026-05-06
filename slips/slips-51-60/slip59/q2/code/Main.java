/**
 * Slip 59 Q2: Person with aadhar, name, address & display().
 * Unit: UNIT 1 – Class & Objects
 */
class Person {
    String aadhar, name, address;
    Person(String a, String n, String addr) { aadhar=a; name=n; address=addr; }
    void display() {
        System.out.println("Aadhar: " + aadhar + " | Name: " + name + " | Address: " + address);
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("1234-5678-9012", "Amit Sharma", "Pune");
        Person p2 = new Person("9876-5432-1098", "Priya Patel", "Mumbai");
        System.out.println("=== Person Details ===");
        p1.display(); p2.display();
    }
}
