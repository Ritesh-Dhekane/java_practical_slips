abstract class Person {
    abstract void showDetails();
}

class Employee extends Person {
    String name = "John Doe";
    int empId = 1001;

    @Override
    void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Employee();
        p.showDetails();
    }
}
