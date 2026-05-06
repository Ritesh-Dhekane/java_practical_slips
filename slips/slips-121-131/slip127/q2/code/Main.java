class A { A(){System.out.println('A');} }
class B extends A { B(){super(); System.out.println('B');} B(int x){this();} }
public class Main { public static void main(String[] args) { new B(1); } }
