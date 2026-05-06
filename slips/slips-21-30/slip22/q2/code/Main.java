/**
 * Slip 22 - Question 2
 * Program: Abstraction using abstract class Vehicle and concrete class Car.
 * Concepts: Abstraction, Abstract Class, Inheritance
 * Unit: UNIT 1 – Abstraction, Abstract Class
 */
abstract class Vehicle {
    String brand;
    int    speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Concrete method – shared implementation
    void showBrand() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + " km/h");
    }

    // Abstract methods – implementation detail hidden (abstraction)
    abstract void start();
    abstract void stop();
    abstract String fuelType();
}

class Car extends Vehicle {
    int    numDoors;
    String model;

    Car(String brand, String model, int speed, int numDoors) {
        super(brand, speed);
        this.model    = model;
        this.numDoors = numDoors;
    }

    @Override
    void start() {
        System.out.println(brand + " " + model + ": Engine started. Vroom!");
    }

    @Override
    void stop() {
        System.out.println(brand + " " + model + ": Engine stopped.");
    }

    @Override
    String fuelType() {
        return "Petrol / Diesel";
    }

    void displayDetails() {
        showBrand();
        System.out.println("Model : " + model);
        System.out.println("Doors : " + numDoors);
        System.out.println("Fuel  : " + fuelType());
    }
}

class ElectricCar extends Vehicle {
    int batteryRange;

    ElectricCar(String brand, int speed, int batteryRange) {
        super(brand, speed);
        this.batteryRange = batteryRange;
    }

    @Override
    void start() {
        System.out.println(brand + ": Electric motor activated silently.");
    }

    @Override
    void stop() {
        System.out.println(brand + ": Motor deactivated.");
    }

    @Override
    String fuelType() {
        return "Electric Battery";
    }

    void displayDetails() {
        showBrand();
        System.out.println("Fuel  : " + fuelType());
        System.out.println("Range : " + batteryRange + " km per charge");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Abstraction – Vehicle & Car ===\n");

        Car c = new Car("Toyota", "Fortuner", 180, 4);
        c.displayDetails();
        c.start();
        c.stop();

        System.out.println();

        ElectricCar ec = new ElectricCar("Tesla", 250, 500);
        ec.displayDetails();
        ec.start();
        ec.stop();

        System.out.println();
        System.out.println("Vehicle reference (Abstraction in action):");
        Vehicle v = new Car("Honda", "City", 160, 4);
        v.start();      // only abstract method called via reference
        System.out.println("Fuel: " + v.fuelType());
    }
}
