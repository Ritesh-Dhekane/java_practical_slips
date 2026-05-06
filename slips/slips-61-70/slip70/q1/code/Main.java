/**
 * Slip 70 Q1: Manager extends Employee. Display details with bonus.
 * Unit: UNIT 1 – Inheritance
 */
class Employee {
    int id; String name; double salary;
    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    void display() { System.out.println("ID: " + id + " | Name: " + name + " | Base Salary: Rs." + salary); }
}

class Manager extends Employee {
    double bonus;
    Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    void displayManager() {
        super.display();
        System.out.println("Bonus: Rs." + bonus + " | Total Salary: Rs." + (salary + bonus));
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Manager Details ===");
        Manager m = new Manager(101, "Amit Sharma", 75000, 15000);
        m.displayManager();
    }
}
