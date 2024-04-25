import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin; // type String because leading 0's will create a malformed int
    List<Account> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccount(int accountNumber) {
        Account toReturn = null;
        for (Account currentAccount : accounts) {
            if (currentAccount.getAccountNumber() == accountNumber) {
                toReturn = currentAccount;
                break;
            }
        }
        return toReturn;
    }

    public String getAllAccountsInfo() {
        StringBuilder allAccounts = new StringBuilder();
        for (Account account : accounts) {
            allAccounts.append(account);
        }
        return allAccounts.toString();
    }

    @Override
    public String toString() {
        return String.format("Customer %s %s PIN: %s%n", firstName, lastName, pin);
    }

    // Getters and Setters (remove unused)
    public String getPin() {
        return pin;
    }
}
