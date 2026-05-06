/**
 * Slip 3 - Question 2
 * Program: Abstract class Person with abstract showDetails(); implemented by Employee.
 * Concepts: Abstraction, Abstract Class, Inheritance
 * Unit: UNIT 1 – Abstract Class, Abstraction, Inheritance
 */
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method – must be implemented by subclass
    abstract void showDetails();

    // Concrete method shared by all subclasses
    void printSeparator() {
        System.out.println("---------------------------");
    }
}

class Employee extends Person {
    int empId;
    String department;
    double salary;

    Employee(int empId, String name, int age, String department, double salary) {
        super(name, age);
        this.empId = empId;
        this.department = department;
        this.salary = salary;
    }

    // Implementing abstract method
    @Override
    void showDetails() {
        printSeparator();
        System.out.println("Employee Details");
        printSeparator();
        System.out.println("ID         : " + empId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("Salary     : Rs. " + salary);
        printSeparator();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Suresh Kumar", 30, "IT", 55000.00);
        Employee e2 = new Employee(1002, "Meena Patil", 27, "HR", 42000.00);

        e1.showDetails();
        System.out.println();
        e2.showDetails();
    }
}
