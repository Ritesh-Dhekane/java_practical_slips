class TableThread extends Thread {
    int n; TableThread(int n){this.n=n;}
    public void run() { for(int i=1;i<=10;i++) System.out.println(n*i); }
}
public class Main { public static void main(String[] args) { new TableThread(5).start(); } }
