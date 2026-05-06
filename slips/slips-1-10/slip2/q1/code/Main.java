import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo; this.name = name; this.marks = marks;
    }
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(101, new Student(101, "Alice", 65));
        map.put(102, new Student(102, "Bob", 75));
        map.put(103, new Student(103, "Charlie", 80));

        System.out.println("Students with marks > 70:");
        for(Student s : map.values()) {
            if(s.marks > 70) {
                System.out.println(s);
            }
        }
    }
}
