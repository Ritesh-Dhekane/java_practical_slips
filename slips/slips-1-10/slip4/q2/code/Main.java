/**
 * Slip 4 - Question 2
 * Program: Interface Shape with area(); implemented by Circle and Rectangle.
 * Concepts: Interface, Abstraction, Polymorphism
 * Unit: UNIT 1 – Interface, Abstraction
 */
interface Shape {
    // Abstract method – must be implemented by all shapes
    double area();

    // Default method
    default void displayArea() {
        System.out.println("Area = " + area());
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayArea() {
        System.out.printf("Circle   (radius=%.1f) : Area = %.2f%n", radius, area());
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void displayArea() {
        System.out.printf("Rectangle(%.1f x %.1f)   : Area = %.2f%n", length, width, area());
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(7.0);
        Shape r = new Rectangle(5.0, 8.0);

        System.out.println("=== Shape Area Calculator ===");
        c.displayArea();
        r.displayArea();

        // Polymorphism: Shape array
        System.out.println("\n--- Using Shape array ---");
        Shape[] shapes = { new Circle(3.5), new Rectangle(4.0, 6.0) };
        for (Shape s : shapes) {
            s.displayArea();
        }
    }
}
