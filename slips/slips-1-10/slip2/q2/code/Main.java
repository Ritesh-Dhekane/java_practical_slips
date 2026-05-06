class Person {
    void display() {
        System.out.println("This is Person class");
    }
}
class Student extends Person {
    @Override
    void display() {
        System.out.println("This is Student class overriding Person's display()");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();

        Person p2 = new Student(); // Dynamic method dispatch
        p2.display();
    }
}
