public class Main { public static void main(String[] args) { String s="abcde"; int v=0, c=0; for(char x:s.toCharArray()) if("aeiou".indexOf(x)!=-1) v++; else c++; System.out.println(v + ' ' + c); } }
