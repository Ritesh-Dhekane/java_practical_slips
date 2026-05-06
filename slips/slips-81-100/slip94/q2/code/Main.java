abstract class Shape { abstract void area(); }
class Circle extends Shape { void area() { System.out.println("Circle Area"); } }
class Rectangle extends Shape { void area() { System.out.println("Rect Area"); } }
public class Main { public static void main(String[] args) { Shape s = new Circle(); s.area(); s = new Rectangle(); s.area(); } }
