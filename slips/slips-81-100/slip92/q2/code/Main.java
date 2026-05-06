class Student {
    int roll; String name;
    Student() { roll=0; name='None'; }
    Student(int r, String n) { roll=r; name=n; }
    void display() { System.out.println(roll + ' ' + name); }
}
public class Main { public static void main(String[] args) { new Student(1, 'R').display(); } }
