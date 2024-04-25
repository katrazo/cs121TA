import java.util.Scanner;

public class FruitsEnhanced {
    public static void main(String[] args) {
        // User Input Method: Scanner in the Console
        Scanner consoleScanner = new Scanner(System.in);
        // Actual User Input: The type of fruit
        String fruitType;
        // The description of the above fruit, which is initialized in the below switch statement in accordance with input.
        String fruitDescription;

        // Initialize fruit based on user input
        // Prompt
        System.out.println("\nWhat type of fruit are you in? Pick one from the list:");
        System.out.println("[Strawberry, Orange, Pineapple, Banana]");
        // User Answer
        fruitType = consoleScanner.nextLine().toLowerCase(); // makes user input case-insensitive

        // Set up output based on user input
        // An enhanced switch statement
        fruitDescription = switch (fruitType) {
            case "strawberry" -> "A red berry. Did you know that the \"seeds\" on the outside are not actual seeds?";
            case "orange" -> "Which came first, the color or the fruit?";
            case "pineapple" -> "A yellow tree-fruit with green leaves. It has an enzyme that is mildly harmful to your mouth when eaten.";
            case "banana" -> "A yellow/green tree-fruit that ripens quickly. It is an abundant source of potassium and natural sugar.";
            default -> "The input is not a valid fruit from the list."; // This is all the default case can include. Anything else ultimately leads to an error.
        };

        // Print the output
        System.out.println("\n" + fruitType + ":");
        System.out.println(fruitDescription);

        // Explicit calls to end scanner and program
        consoleScanner.close();
        System.exit(0);
    }
}