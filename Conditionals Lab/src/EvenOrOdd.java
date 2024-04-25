import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // User Input Method: Console Scanner
        Scanner userInput = new Scanner(System.in);
        // The number the user inputs, to be checked if even or odd.
        int evenOrOdd;

        // Prompt
        System.out.printf("%nPlease enter a number: ");
        // User Answer
        evenOrOdd = Integer.parseInt(userInput.nextLine());

        // Check if even or odd
        if (evenOrOdd % 2 == 0) // if even
            System.out.println("Your number is even.");
        else // else (it must be odd, by deduction)
            System.out.println("Your number is odd.");

        // Explicit calls to end scanner and program
        userInput.close();
        System.exit(0);
    }
}