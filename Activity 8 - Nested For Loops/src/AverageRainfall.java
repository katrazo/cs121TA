import java.util.Scanner;

/** [Optional]
 * Takes in a certain number of years for which to accept data for monthly rainfall for,
 * then calculates the total rainfall over the period of n years as well as
 * the average rainfall per month during that time frame.
 */
public class AverageRainfall {
    public static void main(String[] args) {
        // User Input method: Scanner in the Console
        Scanner consoleScanner = new Scanner(System.in);
        // Math for rainfall calculations
        int years;                  // The number of years for which rainfall is tracked (outer loop)
                                    // [The inner loop iterates 12 times because every year has 12 months]
        int rainfallInches = 0;     // The total rainfall throughout all given years
        double averageRainfall;     // The average rainfall per month, calculated at the end

        // Initialize years for outer loop
        System.out.print("Enter number of years: ");            // Prompt
        years = Integer.parseInt(consoleScanner.nextLine());    // User Input

        System.out.println("------------------------");

        // For each year...
        for (int currentYear = 1; currentYear <= years; currentYear++) {
            // For each of 12 months in a year...
            for (int currentMonth = 1; currentMonth <= 12; currentMonth++) {
                // Ask for rainfall each month and keep a running total
                System.out.printf("Enter inches of rainfall for year %d month %d: ", currentYear, currentMonth);    // Prompt
                rainfallInches += Integer.parseInt(consoleScanner.nextLine());                                      // User Input
            }
        }
        // After the end of the loops...

        // Calculate average rainfall per month
        averageRainfall = (double) rainfallInches / (years*12);

        // Print data
        System.out.println("\nNumber of months: " + (years*12));
        System.out.println("Total inches of rainfall: " + rainfallInches);
        System.out.printf("Average rainfall per month for %d years: %.2f", years, averageRainfall);

        // Explicit calls to end the scanner and the program
        consoleScanner.close();
        System.exit(0);
    }
}