/**
 * Slip 38 - Q2: Different types of constructors – default, parameterized, copy.
 * Unit: UNIT 1 – Class & Objects
 */
class Book {
    String title; String author; double price;
    // Default constructor
    Book() { title="Unknown"; author="Unknown"; price=0; }
    // Parameterized constructor
    Book(String t, String a, double p) { title=t; author=a; price=p; }
    // Copy constructor
    Book(Book other) { title=other.title; author=other.author; price=other.price; }
    void display(String label) {
        System.out.println(label + ": " + title + " by " + author + " – Rs." + price);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Types of Constructors ===\n");
        Book b1 = new Book();                             // default
        Book b2 = new Book("Java Complete","Herbert",550); // parameterized
        Book b3 = new Book(b2);                           // copy
        b1.display("Default      "); b2.display("Parameterized");
        b3.display("Copy         ");
        System.out.println("\nb3 is a copy of b2. Changing b3 won't affect b2.");
        b3.price = 999;
        b2.display("b2 after b3 change"); b3.display("b3 after change   ");
    }
}
