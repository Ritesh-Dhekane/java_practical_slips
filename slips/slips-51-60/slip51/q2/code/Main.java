/**
 * Slip 51 Q2: Student class – marks of 6 subjects, calculate percentage.
 * Unit: UNIT 1 – Class & Objects
 */
class Student {
    String name; int roll_no; String cls;
    int[] marks = new int[6];
    Student(String n, int r, String c, int m1, int m2, int m3, int m4, int m5, int m6) {
        name=n; roll_no=r; cls=c;
        marks[0]=m1; marks[1]=m2; marks[2]=m3; marks[3]=m4; marks[4]=m5; marks[5]=m6;
    }
    double per() {
        int total = 0;
        for (int m : marks) total += m;
        return (total / 600.0) * 100;
    }
    void display() {
        System.out.printf("Roll: %-2d | Name: %-12s | Class: %-4s | Percentage: %.2f%%\n", roll_no, name, cls, per());
    }
}
public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Amit", 1, "MCA", 80, 85, 90, 75, 88, 92),
            new Student("Priya", 2, "MCA", 70, 75, 80, 65, 78, 82),
            new Student("Rahul", 3, "MCA", 90, 95, 85, 88, 92, 90),
            new Student("Sneha", 4, "MCA", 60, 65, 70, 55, 68, 72),
            new Student("Rohan", 5, "MCA", 85, 90, 80, 85, 88, 95)
        };
        System.out.println("=== Student Percentages ===");
        for (Student s : students) s.display();
    }
}
