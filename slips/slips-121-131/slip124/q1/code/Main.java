class Counter { int c=0; synchronized void inc(){c++;} }
class T extends Thread { Counter c; T(Counter x){c=x;} public void run(){c.inc();} }
public class Main { public static void main(String[] args) { Counter c=new Counter(); new T(c).start(); } }
