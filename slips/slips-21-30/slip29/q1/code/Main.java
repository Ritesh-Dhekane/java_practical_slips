/**
 * Slip 29 - Question 1
 * Program: Manager extends Employee; adds bonus attribute; displays all details.
 * Concepts: Inheritance, super(), method override
 * Unit: UNIT 1 – Inheritance
 */
class Employee {
    protected int    empId;
    protected String name;
    protected String department;
    protected double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId      = empId;
        this.name       = name;
        this.department = department;
        this.salary     = salary;
    }

    void display() {
        System.out.println("Emp ID     : " + empId);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : Rs. " + salary);
    }
}

class Manager extends Employee {
    private double bonus;          // additional attribute

    Manager(int empId, String name, String department, double salary, double bonus) {
        super(empId, name, department, salary);   // call Employee constructor
        this.bonus = bonus;
    }

    double getTotalPackage() {
        return salary + bonus;
    }

    @Override
    void display() {
        System.out.println("=== Manager Details ===");
        super.display();           // display base Employee fields
        System.out.println("Bonus      : Rs. " + bonus);
        System.out.println("Total Pkg  : Rs. " + getTotalPackage());
        System.out.println("=======================");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager(501, "Sunita Rao",   "IT",      85000, 15000);
        Manager m2 = new Manager(502, "Kiran Mehta",  "Finance", 92000, 18000);

        m1.display();
        System.out.println();
        m2.display();
    }
}
