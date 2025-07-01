import java.util.*;

public class Account {
    private double balance;
    private List<String> transactionHistory;

    public Account() {
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            transactionHistory.add("Failed withdrawal attempt: $" + amount);
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrew: $" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
    
    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (String t : transactionHistory) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(400);
        account.deposit(1000);
        
        System.out.println("Current Balance: $" + account.getBalance());
        account.printTransactionHistory();
    }
}
