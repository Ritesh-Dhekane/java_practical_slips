public class Main {
    public static void main(String[] args) {
        try {
            int[] a = new int[2]; a[2] = 10/0;
        } catch(ArithmeticException e) { System.out.println('Div by zero');
        } catch(ArrayIndexOutOfBoundsException e) { System.out.println('Out of bounds'); }
    }
}
