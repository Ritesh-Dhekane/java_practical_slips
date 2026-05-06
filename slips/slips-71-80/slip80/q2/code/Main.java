/**
 * Slip 80 Q2: Person extended to Student. Use super().
 * Unit: UNIT 1 – Inheritance, super()
 */
class Person {
    String name; int age;
    Person(String name, int age) {
        this.name = name; this.age = age;
        System.out.println("Person (Base) Constructor called.");
    }
    void displayPerson() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

class Student extends Person {
    String course; int marks;
    Student(String name, int age, String course, int marks) {
        super(name, age); // Initialize base class attributes
        this.course = course; this.marks = marks;
        System.out.println("Student (Derived) Constructor called.");
    }
    void displayStudent() {
        displayPerson();
        System.out.println("Course: " + course + " | Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Student Details using super() ===");
        Student s = new Student("Amit Sharma", 22, "MCA", 85);
        System.out.println();
        s.displayStudent();
    }
}
