/**
 * Slip 2 - Question 2
 * Program: Method overriding – Person (base) and Student (derived) with display().
 * Concepts: Inheritance, Polymorphism, Method Overriding
 * Unit: UNIT 1 – Inheritance, Polymorphism
 */
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Base class method
    void display() {
        System.out.println("=== Person Details ===");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person {
    int rollNo;
    double percentage;

    Student(String name, int age, int rollNo, double percentage) {
        super(name, age);          // call Person constructor
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    // Overriding display() method
    @Override
    void display() {
        System.out.println("=== Student Details ===");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Percentage : " + percentage + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ramesh Gupta", 40);
        p.display();

        System.out.println();

        Student s = new Student("Anjali Mehta", 21, 201, 87.5);
        s.display();

        System.out.println();

        // Runtime polymorphism: Person reference -> Student object
        Person ref = new Student("Vikram Nair", 22, 202, 91.0);
        System.out.println("--- Calling display() via Person reference ---");
        ref.display();   // Student's display() is called
    }
}
