import java.util.Scanner;

/**
 * Showcases usage of methods that both do and don't return values.
 * In this example, we pull and manipulate some data points of a rectangle.
 * [Terminology used in documentation is based on the Canvas assignment, linked below.]
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748035">Lab 6 on Canvas</a>
 */
public class Rectangle {
    // Create a Scanner object outside of the main() method with a static modifier, and close the
    // scanner inside the main() method, after all the function calls: (See line 28)
    static Scanner consoleScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // declared variables
        double length;  // the length of the rectangle
        double width;   // the width of the rectangle
        double area;    // the area of the rectangle

        // function calls
        length  =  getLength();             // gets the length of a rectangle from the user
        width   =  getWidth();              // gets the width of a rectangle from the user
        area    =  getArea(length, width);  // calculates and gets area of rectangle based on length and width

        displayData(length, width, area);   // prints data

        // Explicit call(s) to close scanner (and end program)
        consoleScanner.close();
        System.exit(0);
    }


    // Methods outside main

    /**
     * asks the user to enter the rectangle’s length and
     * @return the value as a double
     */
    public static double getLength() {
        System.out.print("Enter the length of a rectangle: ");
        return Double.parseDouble(consoleScanner.nextLine());
    }

    /**
     * asks the user to enter the rectangle’s width and
     * @return the value as a double
     */
    public static double getWidth() {
        System.out.print("Enter the width of a rectangle: ");
        return Double.parseDouble(consoleScanner.nextLine());
    }

    /**
     * accepts the length and width as arguments and returns the rectangle’s area (l * w) as a double
     * @param length    the length of the rectangle
     * @param width     the width of the rectangle
     * @return          the area of the rectangle
     */
    public static double getArea(double length, double width) {
        return length * width;
    }

    /**
     * accepts the length, width, and area as arguments and displays each on a separate line with label
     * @param length    the length of the rectangle
     * @param width     the width of the rectangle
     * @param area      the area of the rectangle
     */
    public static void displayData(double length, double width, double area) {
        System.out.printf("rectangle length: %.0f%n", length);
        System.out.printf("rectangle width: %.0f%n", width);
        System.out.printf("rectangle area: %.0f", area);
    }
}