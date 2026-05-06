class Employee {
    void calculateSalary() {
        System.out.println("Employee Salary: Base Salary");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: Base Salary + Bonus");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e;

        e = new Employee();
        e.calculateSalary(); // Calls Employee method

        e = new Manager();
        e.calculateSalary(); // Calls Manager method (Runtime Polymorphism)
    }
}
