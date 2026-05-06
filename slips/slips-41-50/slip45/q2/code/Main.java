/**
 * Slip 45 Q2: Person → Employee, demonstrate super() for base class init.
 * Unit: UNIT 1 – Inheritance, super()
 */
class Person {
    String name; int age;
    Person(String name, int age) { this.name=name; this.age=age; System.out.println("Person constructor called"); }
    void display() { System.out.println("Name: "+name+", Age: "+age); }
}
class Employee extends Person {
    int empId; double salary;
    Employee(String name, int age, int empId, double salary) {
        super(name, age); // calls Person(name, age)
        this.empId=empId; this.salary=salary;
        System.out.println("Employee constructor called");
    }
    void display() { super.display(); System.out.println("EmpID: "+empId+", Salary: Rs."+salary); }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== super() Demo ===\n");
        Employee e = new Employee("Amit Sharma", 28, 101, 55000);
        System.out.println(); e.display();
    }
}
