class A { void d(){System.out.println("A");} }
class B extends A { void d(){System.out.println("B");} }
public class Main { public static void main(String[] args) { A x=new B(); x.d(); } }
