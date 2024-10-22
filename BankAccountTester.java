package Bank;

public class BankAccountTester {
        public static void main(String[] args) {
            BankAccount account = new BankAccount();

            System.out.println("Initial balance: " + account.getBalance());

            try {
                account.deposit(15000);
                account.withdraw(30000);
                account.withdraw(60000);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }

            try {
                account.withdraw(-500);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }


