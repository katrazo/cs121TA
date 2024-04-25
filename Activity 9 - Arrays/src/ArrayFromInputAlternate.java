import java.util.Scanner;

/**
 * Class practice of populating Arrays with User Input via a Console Scanner and for loops,
 * then printing the populated arrays as a table.
 * This alternate class uses one for loop for initialization,
 * going through each course's information entirely before moving onto the next.
 * @see ArrayFromInput
 */
public class ArrayFromInputAlternate {
    public static void main(String[] args) {
        // User Input Method: Console Scanner
        Scanner consoleScanner = new Scanner(System.in);

        // -=-=- Declare Arrays and initialize with length of 3 -=-=-
        String[] courses = new String[3];       // The name of a course
        double[] grades = new double[3];        // The % grade for each course respectively
        char[] letters = new char[3];           // The letter grade for each course respectively

        // -=-=- Initialize Arrays -=-=-
        // Each course's name, grade, and letter, then the next course's info...
        System.out.println("\n-=-=- Please enter information about the Courses: -=-=-");
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("Course %d Name: ", i + 1);   // Prompt for Course
            courses[i] = consoleScanner.nextLine();         // Answer & Initialize
            System.out.printf("Grade for course [%s]: ", courses[i]);   // Prompt for Grade
            grades[i] = Double.parseDouble(consoleScanner.nextLine());  // Answer & Initialize
            System.out.printf("Letter grade for course [%s (%.2f)]: ", courses[i], grades[i]);  // Prompt for Letter
            letters[i] = consoleScanner.nextLine().charAt(0);                                   // Answer & Initialize
        }

        // -=-=- Print Table -=-=-
        System.out.printf("%-10s %-10s %-10s%n", "Courses", "Grades", "Letters");   // Table Headers
        System.out.println("-----------------------------");                        // Bar Line
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("%-10s %-10.2f    %c%n", courses[i], grades[i], letters[i]);  // Each line of the table
        }

        // Explicit calls to end scanner and program
        consoleScanner.close();
        System.exit(0);
    }
}
