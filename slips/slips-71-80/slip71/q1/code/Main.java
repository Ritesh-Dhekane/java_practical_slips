import java.util.HashMap;

/**
 * Slip 71 Q1: Employee with department. Count employees in each department.
 * Unit: UNIT 1 – Classes & Arrays
 */
class Employee {
    String name, department;
    Employee(String n, String d) { name=n; department=d; }
}

public class Main {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee("Amit", "IT"),
            new Employee("Priya", "HR"),
            new Employee("Rahul", "IT"),
            new Employee("Sneha", "Finance"),
            new Employee("Rohan", "HR"),
            new Employee("Neha", "IT")
        };
        
        HashMap<String, Integer> deptCount = new HashMap<>();
        
        for (Employee e : emps) {
            deptCount.put(e.department, deptCount.getOrDefault(e.department, 0) + 1);
        }
        
        System.out.println("=== Employee Department Count ===");
        for (String dept : deptCount.keySet()) {
            System.out.println("Department: " + dept + " | Count: " + deptCount.get(dept));
        }
    }
}
