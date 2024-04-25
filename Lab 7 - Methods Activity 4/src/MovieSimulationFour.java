import java.util.Random;
import java.util.Scanner;

// Prompt: Modify the code to include a method called selectSeats(), allowing seat selection, checking for
// availability, and updating theater seat availability.

/**
 * Copied from my Activity 14.
 * [Documentation present in Activity 14 has been removed here to highlight new things changed/added.]
 * [Documentation methodology based on Canvas assignment, linked below]
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748042">Lab 7 on Canvas</a>
 */
public class MovieSimulationFour {
    // Move Scanner instantiation to the first line in the class—outside any method. Make it static
    // so that the same scanner can be used in any method.
    static Scanner consoleScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] movieNames = {"Jumanji","Matrix","Star Wars","Oppenheimer"};
        String[] movieTypes = {"2D","3D","2D","Drama/Historical"};
        double[] moviePrices = {15.25,20.15,18.11,14.14};
        // Constants
        final int ROWS = 5;
        final int COLUMNS = 10;
        int[][] movieAvailability = new int [ROWS][COLUMNS];

        displayMovieDetails(movieNames, movieTypes, moviePrices);

        int index = selectMovie(movieNames);
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        // In main() method, call selectSeats() method after displaying seat availability.
        selectSeats(movieAvailability);

        // Close the scanner at the end of main() method:
        consoleScanner.close();

        // (Explicit call to end the program)
        System.exit(0);

    } // end of main

    static void displayMovieDetails(String[] mNames, String[] mTypes, double[] mPrice) {

        //%s --> String
        //%d --> integers
        //%f --> doubles floating point
        //%c --> characters
        // -  |--> Flag
        // %-10s --> Left aligned  10 spaces
        // %10s  --> Right aligned 10 spaces
        String header = String.format("\n--------------------------- MOVIE SHOWCASE --------------------------\n%-20s %-20s%-20s\n","Movie Name","Movie Type","Movie Price");
        System.out.println(header);
        for(int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d : %-16s %-16s $%-16.2f\n",(i+1),mNames[i],mTypes[i],mPrice[i]);
        }
    }

    static int selectMovie(String[] mNames){
        while(true) {
            System.out.print("\nEnter the movie name you are purchasing tickets for: ");  // Prompt
            String inputName = consoleScanner.nextLine();                               // User Answer

            for (int i = 0; i < mNames.length; i++) {
                if (inputName.equalsIgnoreCase(mNames[i])) {
                    return i;
                }
            }

            System.out.println("Movie not found! Please try again.");
        }
    }

    static void displaySelectedMovie(String mName, String mType, double mPrice) {
        System.out.printf("%n------------------------------ MOVIE SELECTION ------------------------------%n");
        System.out.printf("%-20s %-20s Movie Price%n", "Movie Selected", "Movie Type");
        System.out.printf("%-20s      %-15s %6s%.2f%n", mName, mType, "$", mPrice);
    }

    static void randomizeAvailability(int [][] movieAvailability){
        System.out.println("\n------------ RANDOMIZED SEATS -----------\n");
        Random rand = new Random();
        for(int i = 0 ; i <movieAvailability.length ; i++ ) {
            for(int j = 0 ; j < movieAvailability[i].length ; j++) {
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
        // Does not need to return because it is directly editing the memory address of the parameter array
    }

    static void displaySeatAvailability(int[][] movieAvailability){
        System.out.println("Seating Availability: [ 1 = unavailable ; 0 = available ]\n");
        System.out.println("  1  2  3  4  5  6  7  8  9  10");
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.printf("  %s%n", "-".repeat(30));

        for(int i = 0 ; i < movieAvailability.length ; i++ ) {
            System.out.printf("%c |", rowLabel[i]);
            for(int checker :  movieAvailability[i]) {
                System.out.printf("%d  ", checker);
            }
            System.out.println();
        }
    }

    // In select seats method:
    //     1. Takes movieAvailability array as a parameter.
    static void selectSeats(int[][] movieAvailability) {
        // 2. Prompt the user to enter the number of tickets they would like to purchase for the movie.
        //     a. Loop that many times, allowing a seat to be picked each time (for loop).
        System.out.print("\nEnter the number of tickets you'd like to purchase: ");           // Prompt
        int tickets = Integer.parseInt(consoleScanner.nextLine()); // # of times to loop    // User Answer

        for (int i = 1; i <= tickets; i++) {
            while(true) {
                // 3. Prompt the user to pick available seats based on the randomly generated seating chart row
                // and seat (column) values: A2, B5, C4, etc.
                System.out.print("\nPlease pick an available seat (e.g., A2,) for ticket #" + i + ": ");  // Prompt
                String seat = consoleScanner.nextLine();                                                // User Answer

                // a. Convert the row/seat number into index numbers for movieAvailability[][]
                //     i. See Unicode characters pdf.
                int row = ((int)seat.charAt(0) - 65);
                // (Use substring(1) instead of .valueOf.charAt(1), because if the user puts C10, charAt(1), would pull C1)
                int col = Integer.parseInt(seat.substring(1)) - 1;

                // debug line: verifies that seat is converted correctly; comment out when done debugging [use ctrl + /]
//                seat += "[" + row + "][" + col + "]";

                // b. If the seat picked is marked with a 1 in the array, then inform the user that another seat needs to be picked and try again.
                //     i. Use another loop – while (true)
                if (movieAvailability[row][col] == 1) {
                    System.out.println("Sorry, seat " + seat + " is already booked. Try again!");
                }
                // c. If the seat picked is marked with a 0 in the array:
                else { // movieAvailability[row][col] == 0
                    //   i. inform the user that they have successfully booked that seat
                    System.out.println("You have successfully booked seat " + seat);
                    //  ii. update the seat availability in the array
                    movieAvailability[row][col] = 1;
                    // iii. break out of the while loop
                    break;
                }
                // d. for loop should continue for however many tickets are needed...
            }
        }

        // Once all tickets have been bought, inform the user that all seats have been booked.
        System.out.println("\nAll seats are booked! Enjoy your movie!");
    }
}