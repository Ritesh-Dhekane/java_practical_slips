/**
 * Slip 21 - Question 1
 * Program: static variables and static methods in Person class.
 * Concepts: static members, shared state among objects
 * Unit: UNIT 1 – Class & Objects
 */
class Person {
    String name;
    int    age;

    // static variable – shared by ALL objects of Person
    static int count = 0;
    static String institution = "KES Pratibha Institute";

    Person(String name, int age) {
        this.name = name;
        this.age  = age;
        count++;   // increments shared counter for every new object
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // static method – belongs to class, not to any object
    static void showCount() {
        System.out.println("Total Person objects created: " + count);
    }

    static void showInstitution() {
        System.out.println("Institution: " + institution);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Static Variable & Method Demo ===\n");

        // Call static method before creating any object
        Person.showCount();       // count = 0

        // Create objects
        Person p1 = new Person("Amit",   22);
        Person p2 = new Person("Priya",  25);
        Person p3 = new Person("Rahul",  21);

        p1.display();
        p2.display();
        p3.display();

        System.out.println();

        // All objects share the SAME static variable
        Person.showCount();       // count = 3

        System.out.println("p1.count = " + Person.count);
        System.out.println("p2.count = " + Person.count);
        System.out.println("(Both p1 and p2 see the same count – it is shared!)");

        System.out.println();
        Person.showInstitution();
    }
}
