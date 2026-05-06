/**
 * Slip 13 - Question 2
 * Program: Differentiate Interface vs Abstract Class with code example.
 * Concepts: Interface, Abstract Class, Inheritance, Abstraction
 * Unit: UNIT 1 – Interface, Abstract Class, Abstraction
 */

// ===== ABSTRACT CLASS =====
// Can have: constructor, concrete methods, instance variables
abstract class Animal {
    String name;

    Animal(String name) {        // Constructor allowed
        this.name = name;
    }

    // Concrete method – shared by all subclasses
    void breathe() {
        System.out.println(name + " breathes air.");
    }

    // Abstract method – subclass MUST implement
    abstract void sound();
}

class Dog extends Animal {
    Dog(String name) { super(name); }

    @Override
    void sound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) { super(name); }

    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

// ===== INTERFACE =====
// All methods are public and abstract by default (Java 7)
// A class can implement MULTIPLE interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Duck implements TWO interfaces (multiple interface implementation)
class Duck implements Flyable, Swimmable {
    String name;
    Duck(String name) { this.name = name; }

    @Override
    public void fly()  { System.out.println(name + " can fly!");  }

    @Override
    public void swim() { System.out.println(name + " can swim!"); }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Abstract Class Demo =====");
        Animal d = new Dog("Bruno");
        Animal c = new Cat("Whiskers");
        d.breathe(); d.sound();
        c.breathe(); c.sound();

        System.out.println();
        System.out.println("===== Interface Demo (Multiple) =====");
        Duck duck = new Duck("Donald");
        duck.fly();
        duck.swim();

        System.out.println();
        System.out.println("===== Key Differences =====");
        System.out.println("Abstract Class : Has constructor, can have concrete methods, single inheritance.");
        System.out.println("Interface      : No constructor, all abstract, supports multiple implementation.");
    }
}
