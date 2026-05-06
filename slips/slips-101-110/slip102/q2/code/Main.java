class Emp { int id; String n; }
class Mgr extends Emp { String dept; Mgr(int i, String s, String d){id=i;n=s;dept=d;} }
public class Main { public static void main(String[] args) { Mgr m = new Mgr(1,'R','IT'); System.out.println(m.n + ' ' + m.dept); } }
