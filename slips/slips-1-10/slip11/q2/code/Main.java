/**
 * Slip 11 - Question 2
 * Program: Runtime polymorphism via method overriding – Employee and Manager.
 * (Variation: focuses on display() + describe() methods)
 * Concepts: Inheritance, Polymorphism, Method Overriding
 * Unit: UNIT 1 – Polymorphism, Inheritance
 */
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name   = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("[ Employee ]");
        System.out.println("  Name   : " + name);
        System.out.println("  Salary : Rs. " + salary);
    }

    void describe() {
        System.out.println(name + " is an employee.");
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void display() {
        System.out.println("[ Manager ]");
        System.out.println("  Name       : " + name);
        System.out.println("  Salary     : Rs. " + salary);
        System.out.println("  Department : " + department);
    }

    @Override
    void describe() {
        System.out.println(name + " is a manager of the " + department + " department.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Direct Object Calls ===");
        Employee e = new Employee("Arun Joshi", 40000);
        e.display();
        e.describe();

        System.out.println();

        Manager m = new Manager("Pooja Sharma", 85000, "IT");
        m.display();
        m.describe();

        System.out.println();
        System.out.println("=== Runtime Polymorphism (Employee reference → Manager object) ===");

        // Polymorphic array
        Employee[] staff = {
            new Employee("Ravi Kumar", 38000),
            new Manager("Sneha Nair", 92000, "Finance"),
            new Manager("Ajay Verma", 78000, "HR")
        };

        for (Employee emp : staff) {
            emp.display();   // overridden method called at runtime
            emp.describe();
            System.out.println();
        }
    }
}
