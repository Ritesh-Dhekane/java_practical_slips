public class Main {
    public static void main(String[] args) {
        System.out.println("--- Servlet Life Cycle ---");
        System.out.println("1. init(): Called exactly once by the container when the servlet is instantiated.");
        System.out.println("2. service(): Called by the container to allow the servlet to respond to a request. (Can be called many times).");
        System.out.println("3. destroy(): Called exactly once when the servlet is taken out of service.");
    }
}
