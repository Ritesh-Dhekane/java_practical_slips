class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Thread is running. Name: " + this.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("MySpecialThread");
        t1.start();
    }
}
