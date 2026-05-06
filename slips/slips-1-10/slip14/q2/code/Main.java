/**
 * Slip 14 - Question 2
 * Program: Constructor overloading in a Person class.
 * Concepts: Constructors, Constructor Overloading
 * Unit: UNIT 1 – Class & Objects
 */
class Person {
    String name;
    int    age;
    String city;

    // Constructor 1 – no arguments (default)
    Person() {
        this.name = "Unknown";
        this.age  = 0;
        this.city = "Not specified";
    }

    // Constructor 2 – name only
    Person(String name) {
        this.name = name;
        this.age  = 0;
        this.city = "Not specified";
    }

    // Constructor 3 – name and age
    Person(String name, int age) {
        this.name = name;
        this.age  = age;
        this.city = "Not specified";
    }

    // Constructor 4 – all parameters
    Person(String name, int age, String city) {
        this.name = name;
        this.age  = age;
        this.city = city;
    }

    void display() {
        System.out.println("Name : " + name + " | Age : " + age + " | City : " + city);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Constructor Overloading in Person ===\n");

        Person p1 = new Person();                              // calls Constructor 1
        Person p2 = new Person("Ravi");                       // calls Constructor 2
        Person p3 = new Person("Anjali", 22);                 // calls Constructor 3
        Person p4 = new Person("Suresh", 35, "Pune");         // calls Constructor 4

        System.out.print("p1 (no-arg)        : "); p1.display();
        System.out.print("p2 (name)          : "); p2.display();
        System.out.print("p3 (name, age)     : "); p3.display();
        System.out.print("p4 (name, age, city): "); p4.display();
    }
}
