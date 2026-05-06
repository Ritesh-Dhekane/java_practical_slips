class Person { private String name; public String getName(){return name;} public void setName(String n){name=n;} }
public class Main { public static void main(String[] args) { Person p = new Person(); p.setName("R"); System.out.println(p.getName()); } }
