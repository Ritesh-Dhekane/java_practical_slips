/**
 * Slip 1 - Question 2
 * Program: Lambda Expression to compute x raised to y (x^y).
 * Concepts: Lambda Expressions, Functional Interface
 * Unit: UNIT 1 – Lambda Expressions
 */
public class Main {

    // Functional interface for power operation
    @FunctionalInterface
    interface Power {
        double compute(double x, double y);
    }

    public static void main(String[] args) {
        // Lambda expression: x raised to y
        Power power = (x, y) -> Math.pow(x, y);

        double x = 2, y = 10;
        System.out.println("x = " + (int) x + ", y = " + (int) y);
        System.out.println("x^y = " + x + "^" + (int) y + " = " + power.compute(x, y));

        x = 3; y = 4;
        System.out.println("\nx = " + (int) x + ", y = " + (int) y);
        System.out.println("x^y = " + x + "^" + (int) y + " = " + power.compute(x, y));

        x = 5; y = 3;
        System.out.println("\nx = " + (int) x + ", y = " + (int) y);
        System.out.println("x^y = " + x + "^" + (int) y + " = " + power.compute(x, y));
    }
}
