package Bank;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 50000.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InsufficientFundsException("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
