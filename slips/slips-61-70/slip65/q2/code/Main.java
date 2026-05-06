/**
 * Slip 65 Q2: Lambda Expression for Area of Triangle.
 * Unit: UNIT 1/2 – Lambda Expressions (Java 8)
 */
@FunctionalInterface
interface Triangle {
    double getArea(double base, double height);
}

public class Main {
    public static void main(String[] args) {
        // Lambda expression to calculate triangle area
        Triangle triangleArea = (base, height) -> 0.5 * base * height;
        
        double b = 10.0;
        double h = 5.0;
        System.out.println("Base   : " + b);
        System.out.println("Height : " + h);
        System.out.println("Area of Triangle = " + triangleArea.getArea(b, h));
    }
}
