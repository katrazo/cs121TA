import java.util.Random;
import java.util.Scanner;

/**
 * Copied from the Canvas assignment and filled out thereafter.
 * [Documentation methodology based on Canvas assignment, linked below]
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748034">Activity 14 on Canvas</a>
 */
public class MovieSimulationThree {
    static Scanner consoleScanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] movieNames = {"Jumanji","Matrix","Star Wars","Oppenheimer"};
        String[] movieTypes = {"2D","3D","2D","Drama/Historical"};
        double[] moviePrices = {15.25,20.15,18.11,14.14};
        // Constants
        final int ROWS = 5;
        final int COLUMNS = 10;

        // Convert to a 2D array[][]
        int [][] movieAvailability = new int [ROWS][COLUMNS];

        displayMovieDetails(movieNames, movieTypes, moviePrices);

        // 1. In the main() method:
        //     a. Call the selectMovie() method after printing the movie details and assign its returned int value to a variable index.
        int index = selectMovie(movieNames);
        //     b. Call the displaySelectedMovie() method with the following arguments:
        //         i. The value of arrays movieNames, movieTypes, and moviePrices at index of index.
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);
        //     c. Call the randomizeAvailability() and then the displaySeatAvailability() methods with movieAvailability array as the arguments for each.
        randomizeAvailability(movieAvailability);   // Randomize seats
        displaySeatAvailability(movieAvailability); // Display seat availability

        // Explicit calls to end scanner and program
        consoleScanner.close();
        System.exit(0);

    } // end of main

    // 2. In the selectMovie() method:
    public static int selectMovie(String[] mNames){
        // a. Use a while loop to keep looping if movie not found
        while(true) {
            // i. prompt the user to enter the movie they would like to select.
            System.out.print("\nEnter the movie name you are purchasing tickets for: ");  // Prompt
            String inputName = consoleScanner.nextLine();                               // User Answer

            // ii. For loop through the movieNames array, checking if each movie in the array matches the movie selected.
            for (int i = 0; i < mNames.length; i++) {
                if (inputName.equalsIgnoreCase(mNames[i])) {
                    // 2. If movie matches, return the index of the movie (i)
                    return i;
                }
            }

            // 1. If no movie matches, print “Movie not found. Try again.” and loop to ask them to enter a movie again.
            System.out.println("Movie not found! Please try again.");
        }
    }

    // 3. In the displaySelectedMovie() method:
    public static void displaySelectedMovie(String mName, String mType, double mPrice) {
        // a. Print the selected movie’s name, type, and price
        // b. See output example
        System.out.printf("%n------------------------------ MOVIE SELECTION ------------------------------%n");
        System.out.printf("%-20s %-20s Movie Price%n", "Movie Selected", "Movie Type");
        System.out.printf("%-20s      %-15s %6s%.2f%n", mName, mType, "$", mPrice);
    }

    // 4. In the randomizeAvailability() method:
    static void randomizeAvailability(int [][] movieAvailability){
        System.out.println("\n------------ RANDOMIZED SEATS -----------\n");
        Random rand = new Random();
        // a. loop through the movieAvailability array and randomly reassign all 0 values to
        // randomly be either a 0 or a 1 (0 = empty, 1 = occupied)
        for(int i = 0 ; i <movieAvailability.length ; i++ ) {
            for(int j = 0 ; j < movieAvailability[i].length ; j++) {
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
        // Does not need to return because it is directly editing the memory address of the parameter array
    }

    // 5. In the displaySeatAvailability() method:
    static void displaySeatAvailability(int[][] movieAvailability){
        System.out.println("Seating Availability: [ 1 = unavailable ; 0 = available ]\n");
        // a. loop through the movieAvailability array and modify the previous code to simulate a theater seating arrangement.
        //     i. Columns (seats) should be numbered from 1 to 10 horizontally
        //    ii. Rows should be labeled from A to E vertically.
        //   iii. See output example.
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
}