class Emp { String n; Emp(String s){n=s;} }
class Mgr extends Emp { Mgr(String s){super(s);} }
public class Main { public static void main(String[] args) { System.out.println(new Mgr('R').n); } }
