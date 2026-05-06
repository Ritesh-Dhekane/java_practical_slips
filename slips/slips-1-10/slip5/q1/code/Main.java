class NumberThread implements Runnable {
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try { Thread.sleep(100); } catch(Exception e){}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new NumberThread());
        t.setName("NumberPrinterThread");
        t.start();
    }
}
