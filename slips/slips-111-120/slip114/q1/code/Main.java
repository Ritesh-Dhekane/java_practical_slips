class MyThread extends Thread {
    MyThread(String n){super(n);}
    public void run() { for(int i=1;i<=10;i++) System.out.println(getName() + ' ' + i); }
}
public class Main { public static void main(String[] args) { new MyThread("T1").start(); } }
