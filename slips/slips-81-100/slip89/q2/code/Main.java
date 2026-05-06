class FactThread extends Thread {
    public void run() { int f=1; for(int i=1;i<=5;i++) f*=i; System.out.println('Fact: ' + f); }
}
class EvenThread extends Thread {
    public void run() { for(int i=2;i<=10;i+=2) System.out.print(i + ' '); }
}
public class Main { public static void main(String[] args) { new FactThread().start(); new EvenThread().start(); } }
