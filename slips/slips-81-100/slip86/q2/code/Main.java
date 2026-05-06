class Customer {
    static int count = 0; String name;
    Customer(String n) { name=n; count++; }
}
public class Main {
    public static void main(String[] args) {
        new Customer('A'); new Customer('B');
        System.out.println('Total: ' + Customer.count);
    }
}
