/**
 * Slip 26 - Question 2
 * Program: Demonstrate throw and throws keywords in Java.
 * Concepts: throw, throws, Exception Handling
 * Unit: UNIT 2 – Exception Handling
 */

// Custom exception
class AgeException extends Exception {
    AgeException(String msg) { super(msg); }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // "throws" declares that this method can throw an exception
    void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            // "throw" creates and throws the exception object
            throw new IllegalArgumentException("Withdrawal amount must be positive. Got: " + amount);
        }
        if (amount > balance) {
            throw new Exception("Insufficient balance. Balance: Rs." + balance + ", Requested: Rs." + amount);
        }
        balance -= amount;
        System.out.println("Withdrawn Rs." + amount + " | Remaining balance: Rs." + balance);
    }
}

class Voter {
    // "throws" in method signature – caller must handle
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age " + age + " is below 18. Not eligible to vote.");
        }
        System.out.println("Age " + age + " is valid. Eligible to vote.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== throw and throws Demo ===\n");

        // Demo 1: BankAccount
        BankAccount acc = new BankAccount(5000);
        try {
            acc.withdraw(2000);        // valid
            acc.withdraw(10000);       // throws Exception – insufficient balance
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println();

        // Demo 2: Age validation with custom exception
        int[] ages = {21, 15, 18};
        for (int age : ages) {
            try {
                Voter.validateAge(age);
            } catch (AgeException e) {
                System.out.println("AgeException: " + e.getMessage());
            }
        }
    }
}
