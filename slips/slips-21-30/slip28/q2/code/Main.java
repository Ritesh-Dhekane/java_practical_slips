/**
 * Slip 28 - Question 2
 * Program: Interface Shape implemented by Circle and Rectangle – display areas.
 * Concepts: Interface, Polymorphism
 * Unit: UNIT 1 – Interface
 */
interface Shape {
    double area();
    double perimeter();
    void   display();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) { this.radius = radius; }

    @Override
    public double area()      { return Math.PI * radius * radius; }

    @Override
    public double perimeter() { return 2 * Math.PI * radius; }

    @Override
    public void display() {
        System.out.printf("Circle    | Radius    : %.2f | Area : %.2f | Perimeter : %.2f%n",
                          radius, area(), perimeter());
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width  = width;
    }

    @Override
    public double area()      { return length * width; }

    @Override
    public double perimeter() { return 2 * (length + width); }

    @Override
    public void display() {
        System.out.printf("Rectangle | L=%.2f W=%.2f | Area : %.2f | Perimeter : %.2f%n",
                          length, width, area(), perimeter());
    }
}

class Triangle implements Shape {
    double a, b, c;   // sides

    Triangle(double a, double b, double c) { this.a=a; this.b=b; this.c=c; }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));  // Heron's formula
    }

    @Override
    public double perimeter() { return a + b + c; }

    @Override
    public void display() {
        System.out.printf("Triangle  | Sides %.2f,%.2f,%.2f | Area : %.2f | Perimeter : %.2f%n",
                          a, b, c, area(), perimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Interface Shape – Area & Perimeter ===\n");
        System.out.println(String.format("%-10s%-30s%-15s%-15s", "Shape","Details","Area","Perimeter"));
        System.out.println("-".repeat(70));

        Shape[] shapes = {
            new Circle(7.0),
            new Rectangle(10.0, 5.0),
            new Triangle(3, 4, 5)
        };

        for (Shape s : shapes) {
            s.display();
        }
    }
}
