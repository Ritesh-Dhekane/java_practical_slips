public class Main {
    public static void main(String[] args) {
        try { int x = Integer.parseInt('abc'); }
        catch(NumberFormatException e) { System.out.println('Num format'); }
        catch(Exception e) { System.out.println('Error'); }
    }
}
