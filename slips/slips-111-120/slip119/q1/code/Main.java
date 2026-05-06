class Person { String n="R"; } class Emp extends Person { int id=1; } class Dev extends Emp { String lang="Java"; }
public class Main { public static void main(String[] args) { Dev d=new Dev(); System.out.println(d.n + ' ' + d.lang); } }
