public class Main {
    public static void main(String[] args) {
        String s = 'Hello 123 @#';
        int d=0, sp=0;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) d++;
            else if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) sp++;
        }
        System.out.println('Digits: ' + d + ' Special: ' + sp);
    }
}
