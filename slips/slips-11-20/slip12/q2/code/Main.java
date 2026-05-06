/**
 * Slip 12 - Question 2
 * Program: Demonstrate the 'final' keyword with variables, methods, and classes.
 * Concepts: final variable, final method, final class
 * Unit: UNIT 1 – Class & Objects
 */

// final CLASS – cannot be extended/inherited
final class Constants {
    // final VARIABLE – value cannot be changed after initialization
    static final double PI  = 3.14159265;
    static final int MAX_SIZE = 100;

    void display() {
        System.out.println("Constants: PI = " + PI + ", MAX_SIZE = " + MAX_SIZE);
    }
}

// This would cause compile error: class Sub extends Constants {}

class Shape {
    // final METHOD – cannot be overridden in subclass
    final double computeCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Shape class – non-final method, can be overridden.");
    }
}

class Circle extends Shape {
    // computeCircleArea() CANNOT be overridden here – it is final in Shape

    @Override
    void display() {
        System.out.println("Circle class – overrides display() from Shape.");
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. final VARIABLE
        System.out.println("=== 1. final Variable ===");
        final int MAX = 50;
        System.out.println("MAX = " + MAX);
        // MAX = 100;  // ERROR: cannot assign value to final variable

        // 2. final in class
        System.out.println();
        System.out.println("=== 2. final Class ===");
        Constants c = new Constants();
        c.display();
        System.out.println("Constants.PI = " + Constants.PI);
        System.out.println("Constants class is final – it cannot be extended.");

        // 3. final METHOD
        System.out.println();
        System.out.println("=== 3. final Method ===");
        Shape   s  = new Shape();
        Circle  ci = new Circle();

        double area = s.computeCircleArea(7.0);
        System.out.printf("Area of circle (r=7): %.2f%n", area);
        System.out.println("computeCircleArea() is final – cannot be overridden.");

        s.display();
        ci.display();    // non-final display() is overridden
    }
}
