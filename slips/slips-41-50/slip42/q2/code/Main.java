/**
 * Slip 42 Q2: this() and super() demo.
 * Unit: UNIT 1 – Constructor chaining
 */
class Animal {
    String type;
    Animal(String type) { this.type = type; System.out.println("Animal(" + type + ") via super()"); }
}
class Dog extends Animal {
    String breed;
    Dog() { this("Labrador"); System.out.println("Dog() called this(\"Labrador\")"); }
    Dog(String breed) { super("Dog"); this.breed = breed; System.out.println("Dog(" + breed + ") called super(\"Dog\")"); }
    void display() { System.out.println("Type: " + type + ", Breed: " + breed); }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== this() and super() Demo ===\n");
        System.out.println("--- new Dog() ---");
        Dog d1 = new Dog(); d1.display();
        System.out.println("\n--- new Dog(\"Pug\") ---");
        Dog d2 = new Dog("Pug"); d2.display();
        System.out.println("\nthis() – calls another constructor in SAME class.");
        System.out.println("super() – calls constructor of PARENT class.");
    }
}
