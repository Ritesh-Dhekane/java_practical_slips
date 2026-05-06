/**
 * Slip 18 - Question 2
 * Program: Method overloading – overloaded add() method in Calculator class.
 * Concepts: Method Overloading, Compile-time Polymorphism
 * Unit: UNIT 1 – Polymorphism
 */
class Calculator {

    // add(int, int)
    int add(int a, int b) {
        System.out.println("Called: add(int, int)");
        return a + b;
    }

    // add(double, double)
    double add(double a, double b) {
        System.out.println("Called: add(double, double)");
        return a + b;
    }

    // add(int, int, int)
    int add(int a, int b, int c) {
        System.out.println("Called: add(int, int, int)");
        return a + b + c;
    }

    // add(long, long)
    long add(long a, long b) {
        System.out.println("Called: add(long, long)");
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== Method Overloading – Calculator ===\n");

        int    r1 = calc.add(5, 10);
        System.out.println("Result: " + r1);

        System.out.println();
        double r2 = calc.add(3.5, 2.5);
        System.out.println("Result: " + r2);

        System.out.println();
        int    r3 = calc.add(1, 2, 3);
        System.out.println("Result: " + r3);

        System.out.println();
        long   r4 = calc.add(1000000000L, 2000000000L);
        System.out.println("Result: " + r4);
    }
}
