/**
 * Slip 62 Q1: Employee array. Find minimum salary.
 * Unit: UNIT 1 – Arrays & Classes
 */
class Employee {
    int empId; String name; double salary;
    Employee(int id, String n, double s) { empId=id; name=n; salary=s; }
    void display() { System.out.println("ID: " + empId + " | Name: " + name + " | Salary: Rs." + salary); }
}

public class Main {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee(101, "Amit", 55000),
            new Employee(102, "Priya", 45000),
            new Employee(103, "Rahul", 60000),
            new Employee(104, "Sneha", 42000),
            new Employee(105, "Rohan", 50000)
        };
        
        System.out.println("All Employees:");
        Employee minEmp = emps[0];
        for (Employee e : emps) {
            e.display();
            if (e.salary < minEmp.salary) minEmp = e;
        }
        
        System.out.println("\nEmployee with Minimum Salary:");
        minEmp.display();
    }
}
