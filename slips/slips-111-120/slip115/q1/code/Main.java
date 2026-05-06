public class Main {
    public static void main(String[] args) {
        try { String s=null; s.length(); } catch(NullPointerException e){System.out.println('Caught null');}
    }
}
