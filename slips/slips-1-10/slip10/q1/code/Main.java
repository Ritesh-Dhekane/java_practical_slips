/**
 * Slip 10 - Question 1
 * Program: Employee class demonstrating Encapsulation – private fields, getters & setters.
 * Concepts: Encapsulation, Access Modifiers, Getter/Setter, Data Hiding
 * Unit: UNIT 1 – Encapsulation
 */
class Employee {
    // Private fields – hidden from outside (data hiding)
    private int    empId;
    private String name;
    private String department;
    private double salary;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(int empId, String name, String department, double salary) {
        this.empId      = empId;
        this.name       = name;
        this.department = department;
        setSalary(salary); // use setter so validation is applied
    }

    // ===== GETTERS =====
    public int    getEmpId()      { return empId;      }
    public String getName()       { return name;       }
    public String getDepartment() { return department; }
    public double getSalary()     { return salary;     }

    // ===== SETTERS (with basic validation) =====
    public void setEmpId(int empId) {
        if (empId > 0) this.empId = empId;
        else System.out.println("Invalid Employee ID.");
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) this.name = name;
        else System.out.println("Name cannot be empty.");
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Salary cannot be negative.");
    }

    // Display employee details using getters
    public void displayDetails() {
        System.out.println("---------------------------");
        System.out.println("Employee ID  : " + getEmpId());
        System.out.println("Name         : " + getName());
        System.out.println("Department   : " + getDepartment());
        System.out.println("Salary       : Rs. " + getSalary());
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create employee using constructor
        Employee e1 = new Employee(1001, "Sanjay Patil", "IT", 65000.00);
        e1.displayDetails();

        System.out.println();

        // Create employee using setters
        Employee e2 = new Employee();
        e2.setEmpId(1002);
        e2.setName("Meena Kulkarni");
        e2.setDepartment("HR");
        e2.setSalary(48000.00);
        e2.displayDetails();

        System.out.println();

        // Modify salary using setter
        System.out.println("Updating salary for " + e1.getName() + "...");
        e1.setSalary(70000.00);
        System.out.println("New Salary: Rs. " + e1.getSalary());

        System.out.println();

        // Validation test
        System.out.println("Testing negative salary validation:");
        e2.setSalary(-500);   // should print error
    }
}
