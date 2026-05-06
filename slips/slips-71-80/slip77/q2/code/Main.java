/**
 * Slip 77 Q2: Abstract class Vehicle with abstract method start().
 * Unit: UNIT 1 – Abstract classes
 */
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started with a key... Vroom Vroom!");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started with a self-start button... Vroom!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Vehicle ===");
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        myCar.start();
        myBike.start();
    }
}
