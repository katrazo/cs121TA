import java.util.Scanner;

/**
 * This project:
 * (1) asks the user how many floors the hotel has,
 * (2) for each floor, asks the user how many rooms a floor has and how many are occupied,
 * (3) calculates the occupancy rate of the hotel, and
 * (4) prints overall statistics about the hotel.
 * [Terminology used in documentation is based on the Canvas Assignment sheet, linked below.]
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748028">Lab 5 on Canvas</a>
 */
public class HotelOccupancy {
    public static void main(String[] args) {
        // Declare necessary variables
        Scanner consoleScanner = new Scanner(System.in);        // User Input Method: Console Scanner
        int floors;                                             // # of floors in the hotel
        int roomsTotal = 0;                                     // # of rooms in the hotel
        int roomsOccupied = 0;                                  // # of occupied/booked rooms in the hotel
        double occupancy;                                       // % of occupied/booked rooms in the hotel

        // 1. Ask the user how many floors the hotel has
        System.out.print("Enter number of floors: ");           // Prompt
        floors = Integer.parseInt(consoleScanner.nextLine());   // User Answer

        // 2. For each floor
        for (int i = 1; i <= floors; i++) {
            // ask how many rooms are on the floor
            System.out.print("Enter number of rooms on floor " + i + ": "); // Prompt
            roomsTotal += Integer.parseInt(consoleScanner.nextLine());      // User Answer

            // ask how many of the rooms are occupied
            System.out.print("How many of floor " + i + "'s rooms are occupied: "); // Prompt
            roomsOccupied += Integer.parseInt(consoleScanner.nextLine());           // User Answer
        }

        // 3. Calculate the occupancy rate
        // occupancy rate = number of occupied rooms / total number of rooms
        occupancy = (double) roomsOccupied / roomsTotal;

        System.out.println();

        // 4. Print
        System.out.println("Floors: " + floors);                                            // The number of floors
        System.out.println("Rooms: " + roomsTotal);                                         // The number of rooms
        System.out.println("Occupied Rooms: " + roomsOccupied);                             // The number of occupied rooms
        System.out.println("Vacant Rooms: " + (roomsTotal - roomsOccupied));                // The number of vacant rooms
        System.out.println("Occupancy: " + String.format("%.2f", occupancy) + " (" + ((int)(occupancy*100)) + "%)");
            // The occupancy rate for the hotel (formatted to match the "Example output" in Canvas)
            // Alternatively, just use:
            //     System.out.println("Occupancy: " + occupancy + " (" + (int)(occupancy*100) + "%)");

        // Explicit calls to end scanner and program
        consoleScanner.close();
        System.exit(0);
    }
}