import java.util.Scanner;

public class Fruits {
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
        // A regular switch statement
        switch (fruitType) {
            case "strawberry":
                fruitDescription = "A red berry. Did you know that the \"seeds\" on the outside are not actual seeds?";
                break;
            case "orange":
                fruitDescription = "Which came first, the color or the fruit?";
                break;
            case "pineapple":
                fruitDescription = "A yellow tree-fruit with green leaves. It has an enzyme that is mildly harmful to your mouth when eaten.";
                break;
            case "banana":
                fruitDescription = "A yellow/green tree-fruit that ripens quickly. It is an abundant source of potassium and natural sugar.";
                break;
            default:
                fruitDescription = "";
                System.out.println("The input is not a valid fruit from the list.");
                System.exit(-1); // -1 = program ended early due to "error"
        }

        // Print the output
        System.out.println("\n" + fruitType + ":");
        System.out.println(fruitDescription);

        // Explicit calls to end scanner and program
        consoleScanner.close();
        System.exit(0);
    }
}