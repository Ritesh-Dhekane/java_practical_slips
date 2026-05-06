/**
 * Slip 31 - Q1: Employee array – display IT department only.
 * Unit: UNIT 1 – Class & Objects
 */
class Employee {
    int empId; String name, department;
    Employee(int id, String n, String d) { empId=id; name=n; department=d; }
    void display() { System.out.printf("  %d | %-15s | %s%n", empId, name, department); }
}
public class Main {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee(101,"Amit Sharma","IT"), new Employee(102,"Priya Patel","HR"),
            new Employee(103,"Rahul Verma","IT"), new Employee(104,"Sneha Joshi","Finance"),
            new Employee(105,"Rohan Desai","IT")
        };
        System.out.println("All Employees:");
        System.out.println("  ID  | Name            | Dept");
        for (Employee e : emps) e.display();
        System.out.println("\nIT Department Only:");
        for (Employee e : emps) if ("IT".equals(e.department)) e.display();
    }
}
