// Interface vs Abstract Class
interface Drawable {
    void draw(); // implicitly public abstract
}

abstract class Shape {
    String color;
    Shape(String color) { this.color = color; }
    abstract void area(); // can have constructors and state
}

class Circle extends Shape implements Drawable {
    Circle() { super("Red"); }
    public void draw() { System.out.println("Drawing Circle"); }
    public void area() { System.out.println("Area of " + color + " Circle"); }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract classes can have state and constructors. Interfaces cannot (prior to Java 8 default methods).");
        Circle c = new Circle();
        c.draw();
        c.area();
    }
}
