public class Main { public static void main(String[] args) { String s='a#b$'; int c=0; for(char x:s.toCharArray()) if(!Character.isLetterOrDigit(x)) c++; System.out.println(c); } }
