public class Main {
    public static void main(String[] args) {
        try { String s = null; s.length(); } catch(NullPointerException e) { System.out.println('Null pointer');
        } catch(Exception e) { System.out.println('Exception'); }
    }
}
