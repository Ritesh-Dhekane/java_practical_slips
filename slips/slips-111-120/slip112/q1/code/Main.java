import java.util.*;
class Cust { String n, c; Cust(String x, String y){n=x;c=y;} }
public class Main {
    public static void main(String[] args) {
        ArrayList<Cust> l = new ArrayList<>(Arrays.asList(new Cust('A', 'Pune'), new Cust('B', 'Mumbai')));
        for(Cust x : l) if(x.c.equals('Pune')) System.out.println(x.n);
    }
}
