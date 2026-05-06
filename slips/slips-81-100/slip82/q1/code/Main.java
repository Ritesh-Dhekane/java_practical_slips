import java.util.*;
class Student {
    int roll; String name; int[] marks;
    Student(int r, String n, int[] m) { roll=r; name=n; marks=m; }
    double getPct() { return (marks[0]+marks[1]+marks[2])/3.0; }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, 'A', new int[]{80,90,85}));
        students.add(new Student(2, 'B', new int[]{60,70,65}));
        for(Student s : students) if(s.getPct() >= 75) System.out.println(s.name + ' secured distinction');
    }
}
