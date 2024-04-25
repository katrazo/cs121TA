import java.util.Random;
import java.util.Scanner;

public class ESP {
    public static void main(String[] args) {
        // Use a Scanner in the console for user input
        Scanner consoleScanner = new Scanner(System.in);
        // Have an instance of the Random class
        Random setColor = new Random();

        // Track number of correct guesses
        int numCorrect = 0;

        // Conduct ten trials
        for (int trial = 1; trial <= 10; trial++) {
            // Prompt
            System.out.println(trial + ". What color has the computer chosen?");
            // User Answer
            String input = consoleScanner.nextLine().toLowerCase();

            /* Random number 0-4
             * 0 = red
             * 1 = green
             * 2 = blue
             * 3 = orange
             * 4 = yellow
             */
            int color = setColor.nextInt(5);

            // The name of the color the computer chose
            String colorName = "";
            // Setting the name based on PC number.
            switch (color) {
                case 0 -> colorName = "red";
                case 1 -> colorName = "green";
                case 2 -> colorName = "blue";
                case 3 -> colorName = "orange";
                case 4 -> colorName = "yellow";
            }

            // Check user guess versus computer answer
            if (colorName.equals(input))
                numCorrect++;

            // After all of that, reveal what the computer chose.
            System.out.println(">The computer chose " + colorName + ".");
        }

        // At the end, show the user their accuracy.
        System.out.println("You got " + numCorrect + " out of 10 correct.");
    }
}
