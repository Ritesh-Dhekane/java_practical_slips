// Mocking Servlet to compile purely with standard JDK
interface Servlet {
    void init();
    void service();
    void destroy();
}

class MyServlet implements Servlet {
    public void init() {
        System.out.println("init() - Called once when Servlet is created.");
    }
    public void service() {
        System.out.println("service() - Called for every request.");
    }
    public void destroy() {
        System.out.println("destroy() - Called once when Servlet is stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Servlet Life Cycle Demonstration ---");
        Servlet s = new MyServlet();
        s.init();
        s.service();
        s.service();
        s.destroy();
    }
}
