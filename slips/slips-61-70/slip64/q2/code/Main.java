/**
 * Slip 64 Q2: Person with static object count.
 * Unit: UNIT 1 – static keyword
 */
class Person {
    String name; int age;
    static int objectCount = 0;
    
    Person(String name, int age) {
        this.name = name; this.age = age;
        objectCount++;
    }
    
    void display() {
        System.out.println("  Person: " + name + ", Age: " + age + " | Total objects so far: " + objectCount);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Object Counter Demo ===");
        Person p1 = new Person("Amit", 25); p1.display();
        Person p2 = new Person("Priya", 30); p2.display();
        Person p3 = new Person("Rahul", 22); p3.display();
        
        System.out.println("\nFinal total count: " + Person.objectCount);
    }
}
