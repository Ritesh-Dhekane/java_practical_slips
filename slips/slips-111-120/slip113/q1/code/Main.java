public class Main {
    public static void main(String[] args) {
        String s = 'abc 123'; int c=0, d=0, sp=0;
        for(char x : s.toCharArray()) { if(Character.isDigit(x)) d++; else if(x==' ') sp++; else c++; }
        System.out.println(c + ' ' + d + ' ' + sp);
    }
}
