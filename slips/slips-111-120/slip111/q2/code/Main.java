class AgeException extends Exception { AgeException(String m){super(m);} }
public class Main {
    public static void main(String[] args) {
        try { int a=15; if(a<18) throw new AgeException("Too young"); }
        catch(Exception e){System.out.println(e.getMessage());}
    }
}
