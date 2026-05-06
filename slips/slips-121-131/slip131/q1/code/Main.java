import java.util.*;
class E { String n,d; E(String x,String y){n=x;d=y;} }
public class Main { public static void main(String[] args) { List<E> l=Arrays.asList(new E('R',"IT"), new E('S',"HR")); for(E e:l) if(e.d.equals("IT")) System.out.println(e.n); } }
