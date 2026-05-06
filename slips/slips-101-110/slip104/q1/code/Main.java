class MyThread extends Thread {
    public void run() {
        try { for(int i=1; i<=5; i++) { System.out.println(i); Thread.sleep(1000); } }
        catch(Exception e) {}
    }
}
public class Main { public static void main(String[] args) { new MyThread().start(); } }
