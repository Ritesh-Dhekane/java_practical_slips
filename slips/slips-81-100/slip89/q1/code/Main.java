class Employee {
    int id; String name;
    Employee() { this(0, "Unknown"); }
    Employee(int id, String name) { this.id=id; this.name=name; }
    void display() { System.out.println(id + ' ' + name); }
}
public class Main { public static void main(String[] args) { new Employee().display(); } }
