/**
 * Slip 15 - Question 2
 * Program: Types of Inheritance in Java – Single, Multilevel, Hierarchical.
 * Note: Java does NOT support Multiple Inheritance via classes (use interfaces).
 * Concepts: Inheritance
 * Unit: UNIT 1 – Inheritance
 */

// ===== 1. SINGLE INHERITANCE =====
class Animal {
    void eat() { System.out.println("Animal eats food."); }
}

class Dog extends Animal {   // Dog inherits from Animal (single)
    void bark() { System.out.println("Dog barks."); }
}

// ===== 2. MULTILEVEL INHERITANCE =====
class GrandParent {
    void grandMethod() { System.out.println("GrandParent: grandMethod()"); }
}

class Parent extends GrandParent {
    void parentMethod() { System.out.println("Parent: parentMethod()"); }
}

class Child extends Parent {   // Child → Parent → GrandParent (multilevel)
    void childMethod() { System.out.println("Child: childMethod()"); }
}

// ===== 3. HIERARCHICAL INHERITANCE =====
class Vehicle {
    void fuel() { System.out.println("Vehicle runs on fuel."); }
}

class Car extends Vehicle {    // Both Car and Bike inherit from Vehicle (hierarchical)
    void drive() { System.out.println("Car: drive()"); }
}

class Bike extends Vehicle {
    void ride() { System.out.println("Bike: ride()"); }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Single Inheritance ===");
        Dog dog = new Dog();
        dog.eat();   // inherited
        dog.bark();  // own

        System.out.println();
        System.out.println("=== 2. Multilevel Inheritance ===");
        Child c = new Child();
        c.grandMethod();
        c.parentMethod();
        c.childMethod();

        System.out.println();
        System.out.println("=== 3. Hierarchical Inheritance ===");
        Car  car  = new Car();
        Bike bike = new Bike();
        car.fuel();  car.drive();
        bike.fuel(); bike.ride();

        System.out.println();
        System.out.println("Note: Java does NOT support Multiple Inheritance via classes.");
        System.out.println("      Use interfaces to achieve multiple inheritance.");
    }
}
