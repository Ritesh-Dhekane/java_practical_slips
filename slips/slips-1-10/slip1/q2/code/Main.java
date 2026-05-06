import java.util.Scanner;

interface Power {
    double calculate(double x, double y);
}

public class Main {
    public static void main(String[] args) {
        Power p = (x, y) -> Math.pow(x, y);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = sc.hasNextDouble() ? sc.nextDouble() : 2;
        System.out.print("Enter exponent (y): ");
        double y = sc.hasNextDouble() ? sc.nextDouble() : 3;

        System.out.println(x + "^" + y + " = " + p.calculate(x, y));
    }
}
