interface Shape {
    void area();
}

class Circle implements Shape {
    double r = 5;
    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }
}

class Rectangle implements Shape {
    double l = 4, w = 5;
    public void area() {
        System.out.println("Area of Rectangle: " + (l * w));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        c.area();
        Shape r = new Rectangle();
        r.area();
    }
}
