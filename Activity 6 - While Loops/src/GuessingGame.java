import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {
        // User Input Method: JOptionPane

        // The number that the user is trying to guess.
        /* Math.random() = double from 0.00 to 0.99
         * Math.random() * 100 = double from 0.00 to 99.00
         * Math.random() * 100 + 1 = double from 1.00 to 100.00
         */
        int numToGuess = (int)(Math.random() * 100 + 1);

        // The input from the user. Will be initialized later.
        String input;
        // When necessary, the user input will be parsed as a number.
        int inputNum;

        // The JOptionPane will show up indefinitely, but the message will need to change.
        // The first message is initialized here.
        String message = "Guess a number between 1 and 100, or enter \"q\" if you give up:";
        // The number of attempts it takes the user to correctly guess numToGuess.
        int numOfGuesses = 0;

        // Let the user guess indefinitely
        while (true) {
            // Show the input pane with the message
            input = JOptionPane.showInputDialog(message);
            numOfGuesses++;
            // If the user closes the window or types q
            if (input == null || input.equals("q")) {
                message = String.format("Quitter! The number was %d", numToGuess);
                JOptionPane.showMessageDialog(null, message);
                break;
            }
            // else, the user attempted to guess
            else {
                // Attempt to follow game logic
                try {
                    // Throws Exception
                    inputNum = Integer.parseInt(input);

                    // Continue as normal because above code worked

                    // If the user guesses correctly
                    if (inputNum == numToGuess) {
                        message = String.format("Correct!%nNumber of guesses: %d", numOfGuesses);
                        JOptionPane.showMessageDialog(null, message);
                        break;
                    }
                    // If the user guesses too low
                    else if (inputNum < numToGuess)
                        message = "Too low. Guess again:";
                    // Else, the user guesses too high
                    else
                        message = "Too high. Guess again:";
                } catch (Exception e) {
                    message = "That is not a number. Please guess again:";
                    // Repeats loop
                }
            }
        }

        // Explicit call to end program
        System.exit(0);
    }
}
