public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" programming"); sb.insert(4, " IS"); sb.delete(4, 7);
        System.out.println(sb);
    }
}
