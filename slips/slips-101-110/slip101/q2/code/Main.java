class Person {
    static int count=0; String name;
    void test() { int local=10; System.out.println(name + ' ' + local + ' ' + count); }
    Person(String n){name=n; count++;}
}
public class Main { public static void main(String[] args) { new Person('A').test(); new Person('B').test(); } }
