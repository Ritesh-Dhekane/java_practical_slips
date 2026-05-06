/**
 * Slip 16 - Question 2
 * Program: Method Overloading – add() method in Calculator class.
 * Concepts: Method Overloading, Polymorphism
 * Unit: UNIT 1 – Polymorphism
 */
class Calculator {

    // Overloaded add() methods – differ in parameter types/count

    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // add an int and a double
    double add(int a, double b) {
        return a + b;
    }

    // concatenate two strings
    String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== Method Overloading – Calculator.add() ===\n");

        System.out.println("add(10, 20)           = " + calc.add(10, 20));
        System.out.println("add(10, 20, 30)        = " + calc.add(10, 20, 30));
        System.out.println("add(5.5, 3.2)          = " + calc.add(5.5, 3.2));
        System.out.println("add(10, 3.14)          = " + calc.add(10, 3.14));
        System.out.println("add(\"Hello\", \" World\") = " + calc.add("Hello", " World"));

        System.out.println();
        System.out.println("Same method name 'add', different parameters – that is Method Overloading.");
        System.out.println("Java selects the correct version at COMPILE time (static polymorphism).");
    }
}
