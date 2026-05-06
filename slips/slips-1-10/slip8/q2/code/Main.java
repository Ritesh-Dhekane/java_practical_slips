/**
 * Slip 8 - Question 2
 * Program: Runtime polymorphism via method overriding – Employee and Manager classes.
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

    // Base class method
    void showInfo() {
        System.out.println("---- Employee ----");
        System.out.println("Name   : " + name);
        System.out.println("Salary : Rs. " + salary);
    }

    // Base class method for work description
    void work() {
        System.out.println(name + " performs regular employee tasks.");
    }
}

class Manager extends Employee {
    String department;
    int teamSize;

    Manager(String name, double salary, String department, int teamSize) {
        super(name, salary);
        this.department = department;
        this.teamSize   = teamSize;
    }

    // Override showInfo()
    @Override
    void showInfo() {
        System.out.println("---- Manager ----");
        System.out.println("Name       : " + name);
        System.out.println("Salary     : Rs. " + salary);
        System.out.println("Department : " + department);
        System.out.println("Team Size  : " + teamSize);
    }

    // Override work()
    @Override
    void work() {
        System.out.println(name + " manages the " + department + " department (" + teamSize + " members).");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Kavita Rao", 35000);
        Manager  m = new Manager("Anil Sharma", 75000, "IT", 8);

        // Direct calls
        e.showInfo();
        System.out.println();
        m.showInfo();

        System.out.println();

        // Runtime Polymorphism: Employee reference → Manager object
        Employee ref = new Manager("Deepa Nair", 80000, "Finance", 5);
        System.out.println("--- Runtime Polymorphism ---");
        ref.showInfo();   // calls Manager's showInfo()
        System.out.println();
        ref.work();       // calls Manager's work()
    }
}
