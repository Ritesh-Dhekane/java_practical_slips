import java.util.Scanner;

/**
 * Slip 58 Q2: InsufficientFundException.
 * Unit: UNIT 2 – User-defined Exception
 */
class InsufficientFundException extends Exception {
    InsufficientFundException(String msg) { super(msg); }
}

class Account {
    double balance = 5000.00;
    void withdraw(double amt) throws InsufficientFundException {
        if (amt > balance) {
            throw new InsufficientFundException("Insufficient funds! Available amount for withdrawal: Rs. " + balance);
        }
        balance -= amt;
        System.out.println("Withdrawal successful! Remaining balance: Rs. " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        System.out.println("Current Balance: Rs. " + acc.balance);
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        
        try {
            acc.withdraw(amt);
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
