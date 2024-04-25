import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        // User Input Method: Console Scanner
        Scanner consoleScanner = new Scanner(System.in);

        int oddRounds;          // The number of rounds to play. Should be odd.
        int player1wins = 0;    // The number of rounds Player 1 wins.
        int player2wins = 0;    // The number of rounds Player 2 wins.

        System.out.print("Enter an odd number of rounds: ");
        oddRounds = Integer.parseInt(consoleScanner.nextLine());

        // While rounds isn't odd
        while (oddRounds % 2 == 0) {
            System.out.print("That is not an odd number. Please try again: ");
            oddRounds = Integer.parseInt(consoleScanner.nextLine());
        }

        // Begin rounds
        for (int round = 1;  round <= oddRounds; round++) {
            System.out.println("\n-=-=- Round " + round + " -=-=-");

            // --- Players Assign Variables to their Characters ---
            System.out.println("--- Player 1 ---");
            System.out.print("Enter your character's name [word]: ");                   // Prompt
            String playerName1 = consoleScanner.nextLine();                             // Player 1's character's name
            System.out.print("Enter your character's HP [number]: ");                   // Prompt
            int hp1 = Integer.parseInt(consoleScanner.nextLine());                      // Player 1's hit points
            System.out.print("Enter your character's Special Move name [word]: ");      // Prompt
            String moveName1 = consoleScanner.nextLine();                               // Player 1's move name
            System.out.print("Enter \"" + moveName1 + "\"'s attack power [number]: ");  // Prompt
            int attackPower1 = Integer.parseInt(consoleScanner.nextLine());             // Player 1's move's attack power
            System.out.print("Enter your character's attack speed [number]: ");         // Prompt
            int attackSpeed1 = Integer.parseInt(consoleScanner.nextLine());             // Player 1's attack speed

            System.out.println("--- Player 2 ---");
            System.out.print("Enter your character's name [word]: ");                   // Prompt
            String playerName2 = consoleScanner.nextLine();                             // Player 2's character's name
            System.out.print("Enter your character's HP [number]: ");                   // Prompt
            int hp2 = Integer.parseInt(consoleScanner.nextLine());                      // Player 2's hit points
            System.out.print("Enter your character's Special Move name [word]: ");      // Prompt
            String moveName2 = consoleScanner.nextLine();                               // Player 2's move name
            System.out.print("Enter \"" + moveName2 + "\"'s attack power [number]: ");  // Prompt
            int attackPower2 = Integer.parseInt(consoleScanner.nextLine());             // Player 2's move's attack power
            System.out.print("Enter your character's attack speed [number]: ");         // Prompt
            int attackSpeed2 = Integer.parseInt(consoleScanner.nextLine());             // Player 2's attack speed

            // Actual turns take place
            // While neither character is dead
            while (hp1 > 0 && hp2 > 0) {
                if (attackSpeed1 > attackSpeed2) { // Player 1 is faster
                    // Player 1 attacks first
                    hp2 -= attackPower1;
                    // If Player 1 didn't kill player 2
                    if (hp2 > 0) {
                        // Player 2 attacks second
                        hp1 -= attackPower2;
                    }
                }
                else if (attackSpeed2 > attackSpeed1) { // Player 2 is faster
                    // Player 2 attacks first
                    hp1 -= attackPower2;
                    // If Player 2 didn't kill Player 1
                    if (hp1 > 0) {
                        // Player 1 attacks second
                        hp2 -= attackPower1;
                    }
                }
                else { // (attackSpeed1 == attackSpeed2)
                    Random whoGoesFirst = new Random();
                    int whoseTurn = whoGoesFirst.nextInt(2) + 1; // 1-2
                    if (whoseTurn == 1) { // Player 1 is picked
                        // Player 1 attacks first
                        hp2 -= attackPower1;
                        // If Player 1 didn't kill player 2
                        if (hp2 > 0) {
                            // Player 2 attacks second
                            hp1 -= attackPower2;
                        }
                    }
                    else { // Player 2 is picked (whoseTurn == 2)
                        // Player 2 attacks first
                        hp1 -= attackPower2;
                        // If Player 2 didn't kill Player 1
                        if (hp1 > 0) {
                            // Player 1 attacks second
                            hp2 -= attackPower1;
                        }
                    }
                }
            } // End of while-loop -- someone died

            // If player 1 died
            if (hp1 <= 0) {
                System.out.println(playerName2 + " wins!");
                player2wins++;
            }
            // Else, player 2 died
            else {
                System.out.println(playerName1 + " wins!");
                player1wins++;
            }
        } // End of for-loop -- rounds are over

        // Print game stats
        System.out.println("=========================");
        System.out.println("       Game Over!!");
        System.out.println("=========================");
        System.out.println("Player 1's wins: " + player1wins);
        System.out.println("Player 2's wins: " + player2wins);

        // If player 1 has more wins
        if (player1wins > player2wins) {
            System.out.println("Player 1 wins the game!!!");
        }
        // Else, player 2 has more because there's an odd number of rounds so no chance of a tie
        else {
            System.out.println("Player 2 wins the game!!!");
        }
    }
}
