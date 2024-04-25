import java.util.Random;
import java.util.Scanner;

/**
 * Showcases the use of methods other than main to run code.
 * [Terminology used in documentation based on the Canvas assignment linked below.]
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1752144">Project 2 on Canvas</a>
 */
public class TestScores {
    // I. main() method
    public static void main(String[] args) {
        // 1. Get a random number between 3 and 10 for the number of test scores.
        //     a. Save the random number as a final constant value SIZE.
        final int SIZE = new Random().nextInt(8) + 3;

        // 2. Create an integer array for the test scores with a length of SIZE.
        int[] testScores = new int[SIZE];
        // 3. Create an integer array for the test scores with a length of SIZE.
        char[] letterGrades = new char[SIZE];

        // 4. Print the number of test scores to be entered (see output example).
        System.out.println("Enter your " + SIZE + " test scores");

        // 5. Use a for loop to populate the test scores array by asking the user to enter test scores.
        //     a. Length of array determines number of test scores entered
        Scanner consoleScanner = new Scanner(System.in);
        for (int i = 0; i < testScores.length; i++) {
            System.out.print("Enter test " + (i+1) + " score: ");
            testScores[i] = Integer.parseInt(consoleScanner.nextLine());
        }

        // 6. Use a for loop to populate the letter grades array:
        for (int i = 0; i < letterGrades.length; i++) {
            // a. Loop through the test scores array
            // b. Each loop:
            //     i. Get a test score from the test scores array by index number
            int score = testScores[i];
            //     ii. Call the getLetterGrade() method with the test score as the parameter argument
            //     iii. The returned letter grade should be assigned to the letter grades array
            letterGrades[i] = getLetterGrade(score);
        }

        // 7. Call the printGrades() method with test scores and letter grades arrays as arguments.
        printGrades(testScores, letterGrades);
        // 8. Call the printHighestScore() method with test scores array as the argument.
        printHighestScore(testScores);
        // 9. Call the printLowestScore() method with test scores array as the argument.
        printLowestScore(testScores);
        // 10. Call the printAverageScore() method with test scores array as the argument.
        printAverageScore(testScores);

        // 11. Close scanner. (Use Scanner for this project.)
        consoleScanner.close();

        // Explicit call to end program
        System.exit(0);

    } // end of main

    // II. getLetterGrade() method
    //     1. Takes a test score as a parameter.
    public static char getLetterGrade(int score) {
        // 2. Uses if/else if/else to determine char letter grade of score
        //     a. Use 90 – 100 is A, 80 – 89 is B, etc.
        char letterGrade = '.';
        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else // score < 60
            letterGrade = 'F';

        // 3. Returns letter grade
        return letterGrade;
    }

    // III. printGrades() method
    // 1. Takes test score array and letter grade array as parameters
    public static void printGrades(int[] scores, char[] letters) {
        // 2. Uses for loop to print a table
        //     a. Column headers: Score Grade
        //     b. Column 1: test scores
        //     c. Column 2: grades
        //     d. See output for example
        System.out.printf("%-10s %s%n", "Score", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("  %-10d %c%n", scores[i], letters[i]);
        }
    }

    // IV. printHighestScore() method
    // 1. Takes test score array as parameter
    public static void printHighestScore(int[] scores) {
        // 2. Use for loop to loop through the array and find the highest score
        int highestScore = -1; // Arbitrarily lower than possible
        for (int checker : scores) {
            if (checker > highestScore)
                highestScore = checker;
        }
        // 3. Print [the] highest score (see output example)
        System.out.println("The highest score is " + highestScore);
    }

    // V. printLowestScore() method
    // 1. Takes test score array as parameter
    public static void printLowestScore(int[] scores) {
        // 2. Use for loop to loop through the array and find the lowest score
        int lowestScore = 101; // Arbitrarily higher than possible
        for (int checker : scores) {
            if (checker < lowestScore)
                lowestScore = checker;
        }
        // 3. Print [the] lowest score (see output example)
        System.out.println("The lowest score is " + lowestScore);
    }

    // VI. printAverageScore() method
    // 1. Takes test score array as parameter
    public static void printAverageScore(int[] scores) {
        // 2. Use for loop to loop through the array and find the average score
        double sum = 0;
        for (int checker : scores)
            sum += checker;
        double average = sum / scores.length;
        // 3. Print [the] average score (see output example)
        System.out.printf("Average score is %.1f", average);
    }
}