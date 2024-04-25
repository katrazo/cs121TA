public class Account {
    private double balance;
    private int accountNumber;
    private static int numOfAccounts = 1000;

    public Account(double initialDeposit) {
        accountNumber = numOfAccounts;
        balance = initialDeposit;
        numOfAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("You have deposited $%.2f.%nYou now have a balance of $%.2f.%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.printf("You have insufficient funds.%n");
        else {
            balance -= amount;
            System.out.printf("You have withdrawn $%.2f.%nYou now have a balance of $%.2f.%n", amount, balance);
        }
    }

    @Override
    public String toString() {
        return String.format("Account %d Balance: $%.2f.%n", accountNumber, balance);
    }

    // Getters and Setters (remove unused)
    public int getAccountNumber() {
        return accountNumber;
    }
}
