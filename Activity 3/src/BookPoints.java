import java.util.Scanner;

public class BookPoints {
    public static void main(String[] args) {

        // User Input Method
        Scanner userInput = new Scanner(System.in);

        // Number of books the user purchased
        // If your code says "numOfBooks might not have been initialized," initialize it arbitrarily here.
        int numOfBooks;

        // Prompt
        System.out.print("\nPlease enter the number of books you purchased: ");
        // User Answer
        numOfBooks = Integer.parseInt(userInput.nextLine());

        // "Award" points based on how many books the user purchased.
        if (numOfBooks == 0) // alternatively, if (numOfBooks <= 0)
            System.out.println("You earned 0 points.");
        else if (numOfBooks == 1)
            System.out.println("You earned 5 points.");
        else if (numOfBooks == 2)
            System.out.println("You earned 15 points.");
        else if (numOfBooks == 3)
            System.out.println("You earned 30 points.");
        else if (numOfBooks >= 4) // alternatively, else [if above alternative is also used]
            System.out.println("You earned 60 points!");
    }
}
