/**
 * Slip 9 - Question 2
 * Program: Differentiate between Interface and Abstract Class with code examples.
 * Concepts: Interface, Abstract Class, Inheritance, Abstraction
 * Unit: UNIT 1 – Interface, Abstract Class, Abstraction
 */

// ===== ABSTRACT CLASS EXAMPLE =====
abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Concrete method – shared implementation
    void displayBrand() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    // Abstract method – subclass must implement
    abstract void fuelType();
}

class Car extends Vehicle {
    Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelType() {
        System.out.println(brand + " uses Petrol/Diesel.");
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelType() {
        System.out.println(brand + " uses Electric Battery.");
    }
}

// ===== INTERFACE EXAMPLE =====
interface Printable {
    void print();   // implicitly public abstract
}

interface Scannable {
    void scan();
}

// A class can implement MULTIPLE interfaces (unlike abstract class – single inheritance)
class MultifunctionPrinter implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("MultifunctionPrinter: Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("MultifunctionPrinter: Scanning document...");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Abstract Class Demo =====");
        Vehicle v1 = new Car("Toyota", 180);
        Vehicle v2 = new ElectricCar("Tesla", 250);

        v1.displayBrand(); v1.fuelType();
        v2.displayBrand(); v2.fuelType();

        System.out.println();
        System.out.println("===== Interface Demo =====");
        MultifunctionPrinter mfp = new MultifunctionPrinter();
        mfp.print();
        mfp.scan();

        System.out.println();
        System.out.println("===== Key Differences =====");
        System.out.println("Abstract Class: can have constructors, fields, concrete methods.");
        System.out.println("Interface     : all methods abstract by default (Java 7); "
                         + "supports multiple implementation.");
    }
}
