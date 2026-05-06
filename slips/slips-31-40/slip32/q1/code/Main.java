/**
 * Slip 32 - Q1: Student array – find student with highest marks.
 * Unit: UNIT 1 – Class & Objects
 */
class Student {
    int rollNo, marks; String name;
    Student(int r, String n, int m) { rollNo=r; name=n; marks=m; }
    void display() { System.out.printf("  %d | %-15s | %d%n", rollNo, name, marks); }
}
public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1,"Amit",85), new Student(2,"Priya",91),
            new Student(3,"Rahul",78), new Student(4,"Sneha",95),
            new Student(5,"Rohan",88)
        };
        System.out.println("All Students:");
        for (Student s : students) s.display();
        Student top = students[0];
        for (Student s : students) if (s.marks > top.marks) top = s;
        System.out.println("\nHighest Marks:");
        top.display();
    }
}
