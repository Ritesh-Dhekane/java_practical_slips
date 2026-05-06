/**
 * Slip 79 Q1: Employee calculate bonus based on salary.
 * Unit: UNIT 1 – Classes & Methods
 */
class Employee {
    String name; double salary, bonus;
    Employee(String n, double s) { name=n; salary=s; }
    void calculateBonus() {
        if (salary < 30000) bonus = salary * 0.15; // 15% bonus
        else if (salary <= 50000) bonus = salary * 0.10; // 10% bonus
        else bonus = salary * 0.05; // 5% bonus
    }
    void display() {
        System.out.println("Name: " + name + " | Original Salary: Rs." + salary);
        System.out.println("Bonus: Rs." + bonus + " | Updated Salary: Rs." + (salary + bonus));
        System.out.println("-------------------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 25000);
        Employee e2 = new Employee("Priya", 45000);
        Employee e3 = new Employee("Rahul", 60000);
        
        e1.calculateBonus(); e2.calculateBonus(); e3.calculateBonus();
        
        System.out.println("=== Employee Bonus Calculation ===");
        e1.display(); e2.display(); e3.display();
    }
}
