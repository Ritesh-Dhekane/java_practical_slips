/**
 * Slip 23 - Question 2
 * Program: User-defined exception InvalidSalaryException thrown when salary < 10000.
 * Concepts: User-defined Exception, throw, try-catch
 * Unit: UNIT 2 – User-defined Exception, Exception Handling
 */

// User-defined (custom) exception – extends Exception (checked)
class InvalidSalaryException extends Exception {
    private double salary;

    InvalidSalaryException(double salary) {
        super("Invalid salary: Rs. " + salary + ". Salary must be >= Rs. 10,000.");
        this.salary = salary;
    }

    double getSalary() { return salary; }
}

class Employee {
    private int    empId;
    private String name;
    private double salary;

    // Constructor throws InvalidSalaryException if salary < 10000
    Employee(int empId, String name, double salary) throws InvalidSalaryException {
        if (salary < 10000) {
            throw new InvalidSalaryException(salary);
        }
        this.empId  = empId;
        this.name   = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Salary: Rs. " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== InvalidSalaryException Demo ===\n");

        // Test 1: Valid salary
        try {
            Employee e1 = new Employee(101, "Amit Sharma", 35000);
            System.out.print("Employee created: "); e1.display();
        } catch (InvalidSalaryException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println();

        // Test 2: Salary below 10000 – exception thrown
        try {
            Employee e2 = new Employee(102, "Ravi Kumar", 8500);
            e2.display();  // will not reach here
        } catch (InvalidSalaryException ex) {
            System.out.println("Caught InvalidSalaryException!");
            System.out.println("Message : " + ex.getMessage());
            System.out.println("Invalid salary was: Rs. " + ex.getSalary());
        }

        System.out.println();

        // Test 3: Exactly 10000 (boundary) – valid
        try {
            Employee e3 = new Employee(103, "Sneha Joshi", 10000);
            System.out.print("Employee created: "); e3.display();
        } catch (InvalidSalaryException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
