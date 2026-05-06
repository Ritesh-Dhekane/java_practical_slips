/**
 * Slip 48 Q2: Demonstrate 'this' keyword – 5 uses.
 * Unit: UNIT 1 – this keyword
 */
class Student {
    String name; int rollNo;
    // 1. this to resolve ambiguity
    Student(String name, int rollNo) { this.name = name; this.rollNo = rollNo; }
    // 2. this() to call another constructor
    Student() { this("Default", 0); }
    // 3. this to pass current object
    void print(Student s) { System.out.println("Received: " + s.name); }
    void callPrint() { print(this); }
    // 4. this to return current object (method chaining)
    Student setName(String name) { this.name = name; return this; }
    void display() { System.out.println("Name: " + name + ", Roll: " + rollNo); }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 'this' Keyword Demo ===\n");
        System.out.println("1. this.field – resolve ambiguity:");
        Student s1 = new Student("Amit", 101); s1.display();
        System.out.println("\n2. this() – constructor chaining:");
        Student s2 = new Student(); s2.display();
        System.out.println("\n3. this as argument:");
        s1.callPrint();
        System.out.println("\n4. return this – method chaining:");
        s1.setName("Rahul").display();
    }
}
