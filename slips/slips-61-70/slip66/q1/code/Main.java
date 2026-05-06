import java.util.Scanner;

/**
 * Slip 66 Q1: Employee class. Exception if age < 18.
 * Unit: UNIT 2 – Exception Handling
 */
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

class Employee {
    String name; int age;
    Employee(String n, int a) throws InvalidAgeException {
        if (a < 18) throw new InvalidAgeException("Age " + a + " is less than 18. Invalid employee age.");
        name = n; age = a;
    }
    void display() { System.out.println("Employee: " + name + ", Age: " + age); }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();
        
        try {
            Employee emp = new Employee(name, age);
            emp.display();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
