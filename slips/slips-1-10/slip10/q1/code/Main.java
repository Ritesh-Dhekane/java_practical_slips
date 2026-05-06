class Employee {
    private int empId;
    private String name;

    // Getters and Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(101);
        e.setName("Alice");
        e.display();
    }
}
