class Emp {
    void bonus(int s){ System.out.println(s*0.1); }
    void bonus(int s, double p){ System.out.println(s*p); }
}
public class Main { public static void main(String[] args) { new Emp().bonus(1000); } }
