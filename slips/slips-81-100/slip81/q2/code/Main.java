class Employee {
    String name;
    Employee() { this.name = 'Unknown'; }
    Employee(String name) { this.name = name; }
    void display() { System.out.println('Name: ' + name); }
}
public class Main {
    public static void main(String[] args) {
        new Employee().display();
        new Employee('Ritesh').display();
    }
}
