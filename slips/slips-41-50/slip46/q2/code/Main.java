/**
 * Slip 46 Q2: Employee with static count, default & parameterized constructors.
 * Unit: UNIT 1 – static, constructors
 */
class Employee {
    String name, designation; double salary;
    static int count = 0;
    Employee() { name="Unknown"; designation="N/A"; salary=0; count++; System.out.println("Default constructor. Count: "+count); }
    Employee(String n, String d, double s) { name=n; designation=d; salary=s; count++; System.out.println("Param constructor. Count: "+count); }
    void display() { System.out.println("  "+name+" | "+designation+" | Rs."+salary); }
    static void showCount() { System.out.println("Total objects: " + count); }
}
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(); e1.display();
        Employee e2 = new Employee("Amit","Manager",75000); e2.display();
        Employee e3 = new Employee("Priya","Developer",60000); e3.display();
        Employee.showCount();
    }
}
