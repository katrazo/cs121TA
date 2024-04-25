import java.util.Scanner;

/**
 * Takes in a number of students as well as how many test scores exist for each student,
 * then calculates each student's average test score.
 */
public class TestAverage {
    public static void main(String[] args) {
        // User Input method: Scanner in the Console
        Scanner consoleScanner = new Scanner(System.in);
        // These two variables control the number of times each loop is run
        int students;           // The number of students (the outer loop)
        int testsPerStudent;    // The number of test scores per student (the inner loop)

        // Initialize variables
        System.out.print("Enter number of students: ");                 // Prompt
        students = Integer.parseInt(consoleScanner.nextLine());         // User Input
        System.out.print("Enter number of tests per student: ");        // Prompt
        testsPerStudent = Integer.parseInt(consoleScanner.nextLine());  // User Input

        // Outer Loop: For each student...
        for (int currentStudent = 1; currentStudent <= students; currentStudent++) {
            // Header
            System.out.println("\nStudent number " + currentStudent);
            System.out.println("---------------------");

            /* Keep track of test scores; since we only need them to calculate the average,
             * there is no reason to track them individually. So, we only need to add them to a sum.
             */
            double sum = 0; // Initialized as double both for user freedom and for division in averaging

            // For each test score...
            for (int currentTest = 1; currentTest <= testsPerStudent; currentTest++) {
                // Add each test score to a sum
                System.out.print("Enter score " + currentTest + ": ");            // Prompt
                sum += Double.parseDouble(consoleScanner.nextLine());   // User Input
            }
            // After all test scores for a student are entered...

            // Average out the test scores based on the sum
            double average = sum / testsPerStudent;
            System.out.printf("The average for student %d is %.2f%n", currentStudent, average);
        }

        // Explicit call to end the scanner and the program
        consoleScanner.close();
        System.exit(0);
    }
}