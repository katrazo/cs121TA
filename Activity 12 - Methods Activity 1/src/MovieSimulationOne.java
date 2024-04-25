import java.util.Scanner;

/**
 * This method asks the user for details about a certain number of movies, then calls a separate method to call/print all the details.
 * [Terminology of documentation corresponds to the Canvas assignment linked below.]
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748032">Activity 12 on Canvas</a>
 */
public class MovieSimulationOne {
    public static void main(String[] args) {
        // 1. Create arrays for...
        String[] movieNames;        // Names of movies
        String[] movieTypes;        // Format of movies (2D/3D)
        int[] movieAvailability;    // # of available seats for a movie showing
        double[] moviePrices;       // $ price per ticket for the movie

        // 2. Prompt the user to...
        Scanner consoleScanner = new Scanner(System.in);
        // a. enter in how many movie details they would like to enter
        System.out.print("Enter number of movies to provide details for: ");    // Prompt
        final int NUM_OF_MOVIES = Integer.parseInt(consoleScanner.nextLine());  // User Answer

        // (give the arrays a size equal to the number of movies)
        movieNames = new String[NUM_OF_MOVIES];
        movieTypes = new String[NUM_OF_MOVIES];
        movieAvailability = new int[NUM_OF_MOVIES];
        moviePrices = new double[NUM_OF_MOVIES];

        // b. input details for each array
        for (int i = 0; i < NUM_OF_MOVIES; i++) {
            System.out.println();
            // Movie Names
            System.out.print("Enter the name of movie " + (i+1) + ": ");    // Prompt
            movieNames[i] = consoleScanner.nextLine();                      // User Answer
            // Movie Types
            System.out.print("Enter the type of movie " + (i+1) + " (2D/3D): "); // Prompt
            movieTypes[i] = consoleScanner.nextLine();                          // User Answer
            // Movie Availability
            System.out.print("How many seats are available for movie " + (i+1) + ": "); // Prompt
            movieAvailability[i] = Integer.parseInt(consoleScanner.nextLine());         // User Answer
            // Movie Prices
            System.out.print("What is the price for a ticket to movie " + (i+1) + ": $");   // Prompt
            moviePrices[i] = Double.parseDouble(consoleScanner.nextLine());                 // User Answer
        }

        // 3. Output all movie details using the arrays in a method.
        // b. Note: This means you will pass the arrays by reference.
        System.out.println(moviesToString(movieNames, movieTypes, movieAvailability, moviePrices));

        // Explicit calls to end scanner and program
        consoleScanner.close();
        System.exit(0);

    } // end of main

    // a. Have your output be in a separate method and use printf or String.format()
    public static String moviesToString(String[] mNames, String[] mTypes, int[] mSeats, double[] mPrices) {
        String toReturn = String.format("%n----------------------------------- Movie Details -----------------------------------%n");
        toReturn += String.format("%-29s %-20s %-20s %s%n", "Movie Name", "Movie Type", "Available Seats", "Movie Price");
        for (int i = 0; i < mNames.length; i++) {
            toReturn += String.format("  Movie %d: %-20s %-20s %-20d $%.2f%n", i+1, mNames[i], mTypes[i], mSeats[i], mPrices[i]);
        }
        return toReturn;
    }
}