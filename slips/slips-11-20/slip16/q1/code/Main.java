/**
 * Slip 16 - Question 1
 * Program: Student class with marks of 3 subjects – calculate total and percentage.
 * Concepts: Class & Objects, methods
 * Unit: UNIT 1 – Class & Objects
 */
class Student {
    String name;
    int    rollNo;
    double sub1, sub2, sub3;

    Student(String name, int rollNo, double sub1, double sub2, double sub3) {
        this.name   = name;
        this.rollNo = rollNo;
        this.sub1   = sub1;
        this.sub2   = sub2;
        this.sub3   = sub3;
    }

    double getTotal() {
        return sub1 + sub2 + sub3;
    }

    double getPercentage() {
        return (getTotal() / 300.0) * 100;
    }

    String getGrade() {
        double pct = getPercentage();
        if      (pct >= 75) return "Distinction";
        else if (pct >= 60) return "First Class";
        else if (pct >= 50) return "Second Class";
        else if (pct >= 40) return "Pass";
        else                return "Fail";
    }

    void display() {
        System.out.println("--------------------------------------------------");
        System.out.printf("Name        : %-15s Roll No : %d%n", name, rollNo);
        System.out.printf("Marks       : %.0f | %.0f | %.0f%n", sub1, sub2, sub3);
        System.out.printf("Total       : %.0f / 300%n", getTotal());
        System.out.printf("Percentage  : %.2f%%%n", getPercentage());
        System.out.printf("Grade       : %s%n", getGrade());
        System.out.println("--------------------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Amit Sharma",  101, 85, 78, 92),
            new Student("Priya Patel",  102, 60, 55, 70),
            new Student("Rahul Verma",  103, 45, 38, 50),
        };

        System.out.println("===== Student Result Card =====\n");
        for (Student s : students) {
            s.display();
        }
    }
}
