import java.util.*;

class Employee implements Comparable<Employee> {
    int empId;
    String name;
    double salary;
    public Employee(int empId, String name, double salary) {
        this.empId = empId; this.name = name; this.salary = salary;
    }
    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }
    public String toString() {
        return "ID: " + empId + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Alice", 50000));
        list.add(new Employee(2, "Bob", 40000));
        list.add(new Employee(3, "Charlie", 60000));
        list.add(new Employee(4, "David", 35000));
        list.add(new Employee(5, "Eve", 45000));

        Collections.sort(list);

        System.out.println("Employees sorted by salary:");
        for(Employee e : list) {
            System.out.println(e);
        }
    }
}
