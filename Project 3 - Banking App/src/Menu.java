import java.util.Scanner;

public class Menu {
    private Scanner consoleScanner = new Scanner(System.in);
    private Bank bank = new Bank();

    public void runMenu() {
        // Customer/Bank Menu
        int input = 0;
        while (input != 4) {
            System.out.printf("%n********* MENU *********%n%n" +
                    "Please make a selection:%n" +
                    "1) Access Account%n" +
                    "2) Open a New Account%n" +
                    "3) Close All Accounts%n" +
                    "4) Exit%n" +
                    ">> ");
            try {
                input = Integer.parseInt(consoleScanner.nextLine());

                switch (input) {
                    case 1 -> accessAccount();
                    case 2 -> openNewAccount();
                    case 3 -> closeAllAccounts();
                    case 4 -> System.out.printf("Thank you for using BSU Banking App.%nGoodbye. Exiting ...");
                    default -> System.out.println("Invalid entry.");
                }
            } catch (NumberFormatException e) {
                System.err.println("That is not a number. Going back to menu...");
            }
        }
    }

    private void accessAccount() {
        System.out.println("Please enter your PIN:");
        Customer customerInQuestion = bank.getCustomer(consoleScanner.nextLine());
        if (customerInQuestion == null) {
            System.out.println("PIN is not valid.");
            return;
        }
        System.out.println("***Active Accounts***");
        System.out.println(customerInQuestion.getAllAccountsInfo());

        System.out.println("Please Enter the account number of the account you would like to access:");
        Account accountInQuestion = customerInQuestion.getAccount(Integer.parseInt(consoleScanner.nextLine()));
        if (accountInQuestion == null) {
            System.out.println("Account number is not valid.");
            return;
        }

        // Account Menu
        int input = 0;

        while (input != 5) {
            System.out.printf("%nPlease make a selection:%n" +
                    "1) Make a deposit%n" +
                    "2) Make a withdrawal%n" +
                    "3) See account balance%n" +
                    "4) Close account%n" +
                    "5) Exit%n" +
                    ">> ");
            input = Integer.parseInt(consoleScanner.nextLine());
            switch (input) {
                case 1 -> {
                    System.out.print("Please enter deposit amount: ");
                    accountInQuestion.deposit(Integer.parseInt(consoleScanner.nextLine()));
                }
                case 2 -> {
                    System.out.print("Please enter withdrawal amount: ");
                    accountInQuestion.withdraw(Integer.parseInt(consoleScanner.nextLine()));
                }
                case 3 -> System.out.println(accountInQuestion);
                case 4 -> {
                    customerInQuestion.removeAccount(accountInQuestion);
                    System.out.printf("Account %d removed.%n", accountInQuestion.getAccountNumber());
                }
                case 5 -> System.out.println("Exiting. Returning to Main Menu...");
                default -> System.out.println("Invalid entry.");
            }
        }
    }

    private void openNewAccount() {
        System.out.printf("Are you a new customer?%n" +
                "1) Yes%n" +
                "2) No%n");
        int input = Integer.parseInt(consoleScanner.nextLine());

        double initialDeposit;
        Customer customerInQuestion;

        switch (input) {
            case 1 -> customerInQuestion = createNewCustomer();
            case 2 -> {
                System.out.println("Please enter PIN:");
                customerInQuestion = bank.getCustomer(consoleScanner.nextLine());
                if (customerInQuestion == null) {
                    System.out.println("PIN is not valid.");
                    return;
                }
            }
            default -> {
                System.out.println("Invalid entry. Returning to menu...");
                return;
            }
        }
        // If the code has made it this far, then the input was recognized (as 1 or 2) and the customer isn't null.
        System.out.println("Please enter deposit amount:");
        initialDeposit = Double.parseDouble(consoleScanner.nextLine());

        Account newAccount = new Account(initialDeposit);
        customerInQuestion.addAccount(newAccount);
        System.out.printf("New Account Opened: %d%n", newAccount.getAccountNumber());
    }

    private void closeAllAccounts() {
        System.out.println("Please enter your PIN:");
        Customer customerInQuestion = bank.getCustomer(consoleScanner.nextLine());
        if (customerInQuestion == null) {
            System.out.println("PIN is not valid.");
            return;
        }
        bank.removeCustomer(customerInQuestion);
        System.out.println("You have been removed from the bank registry.");
    }

    private Customer createNewCustomer() {
        System.out.println("Please enter your first name:");
        String firstName = consoleScanner.nextLine();
        System.out.println("Please enter your last name:");
        String lastName = consoleScanner.nextLine();
        System.out.println("Please enter a 4-digit PIN:");
        String pin = consoleScanner.nextLine();

        Customer newCustomer = new Customer(firstName, lastName, pin);
        bank.addCustomer(newCustomer);

        System.out.printf("New Customer Created: %s", newCustomer);
        return newCustomer;
    }
}
