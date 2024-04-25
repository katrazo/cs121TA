import java.util.Scanner;

public class MonthlyBudget {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        double budget = 0;
        double expenses = 0;

        System.out.print("Enter your budget for the month: $");
        budget = Double.parseDouble(consoleScanner.nextLine());

        System.out.println();

        while(true) {
            System.out.print("Enter an expense amount or \"q\" to quit: $");
            String input = consoleScanner.nextLine();

            if (input.equals("q"))
                break;

            expenses += Double.parseDouble(input);
        }

        System.out.println();
        System.out.printf("Budget: $%.2f%n", budget);
        System.out.printf("Expenses: $%.2f%n", expenses);

        String overUnder;
        if (expenses > budget)
            overUnder = "Over";
        else
            overUnder = "Under";

        System.out.printf("%s budget by $%.2f", overUnder, Math.abs(expenses - budget));
    }
}