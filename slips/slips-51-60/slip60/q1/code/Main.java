/**
 * Slip 60 Q1: Employee array, display using loop.
 * Unit: UNIT 1 – Class & Arrays
 */
class Employee {
    int empId; String name; double salary;
    Employee(int id, String n, double s) { empId=id; name=n; salary=s; }
    void display() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Salary: Rs." + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(101, "Amit", 50000),
            new Employee(102, "Priya", 65000),
            new Employee(103, "Rahul", 55000)
        };
        System.out.println("=== Employee Details ===");
        for (Employee e : employees) {
            e.display();
        }
    }
}
