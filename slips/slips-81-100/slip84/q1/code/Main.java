class PrimeThread extends Thread {
    public void run() {
        for(int i=2; i<=50; i++) {
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++) if(i%j==0) { isPrime=false; break; }
            if(isPrime) System.out.print(i + ' ');
        }
    }
}
public class Main { public static void main(String[] args) { new PrimeThread().start(); } }
