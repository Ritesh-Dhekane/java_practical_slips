/**
 * Slip 67 Q2: Lambda Expression for Area of Square.
 * Unit: UNIT 1/2 – Lambda Expressions (Java 8)
 */
@FunctionalInterface
interface Square {
    double getArea(double side);
}

public class Main {
    public static void main(String[] args) {
        // Lambda expression
        Square sq = (side) -> side * side;
        
        double s = 15.5;
        System.out.println("Side of Square : " + s);
        System.out.println("Area of Square : " + sq.getArea(s));
    }
}
