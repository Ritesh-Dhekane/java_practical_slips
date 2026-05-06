import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try { System.out.print('Salary: '); double s = sc.nextDouble(); System.out.println(s); }
        catch(Exception e) { System.out.println('Numeric only'); }
    }
}
