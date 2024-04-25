import java.util.Scanner;

/**
 * When the user (0) specifies the length of four arrays and (1) fills the first one, this code:
 * (2) copies that array to the second array,
 * (3) copies the first array squared to the third array,
 * (4) copies the first array backwards to the fourth array, and
 * (*) prints them all.
 * [Terminology used in documentation follows the Activity 10 rubric in Canvas, linked below.]
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748025">Canvas Assignment</a>
 */
public class copyArray {
    public static void main(String[] args) {
        // -=-=- 0. Create 4 Arrays -=-=-
        // Ask the user to enter the number of elements for the arrays.
        Scanner consoleScanner = new Scanner(System.in);                        // User Input via console scanner
        System.out.print("Enter the number of elements for the arrays: ");      // Prompt
        // Save this value as a **constant**. [Constants' names are generally caps-locked with underscores.]
        final int NUM_ELEMENTS = Integer.parseInt(consoleScanner.nextLine());   // User Answer (final means it cannot be changed afterward.)
        // Declare 4 arrays with [a size of] the above number
        int[] array1 = new int[NUM_ELEMENTS];
        int[] array2 = new int[NUM_ELEMENTS];
        int[] array3 = new int[NUM_ELEMENTS];
        int[] array4 = new int[NUM_ELEMENTS];

        // -=-=- 1. Initialize and print array1 -=-=-
        // Loop through array 1...
        // (i = 0 because arrays start at index 0)
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            // ... and ask the user to enter each number for the array.
            System.out.print("Enter number " + (i + 1) + " for the array: ");   // Prompt
            array1[i] = Integer.parseInt(consoleScanner.nextLine());            // User Answer
        }
        // Print array1 using a for-loop
        System.out.print("\nArray 1: [ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");

        // -=-=- 2. Copy Array1's elements to Array2 and print Array2 -=-=-
        // Copy array1's elements to Array 2 using a for-loop.
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            array2[i] = array1[i];
        }
        // Print array2 using a for-loop.
        System.out.print("Array 2: [ ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("]");

        // -=-=- 3. Copy Array1’s elements squared to Array3 and print Array3 -=-=-
        // Copy array1’s elements to array3...
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            // ... squaring each number before adding it to array3.
            array3[i] = (int)Math.pow(array1[i], 2); // array1[i] to the power of 2, cast as an int
        }
        // Print array3 using a for-loop.
        System.out.print("Array 3: [ ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println("]");

        // -=-=- 4. Copy Array1’s elements in reverse order to Array4 and print Array4 -=-=-
        // Copy array1’s elements to array4 using a for loop...
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            // ... reversing the order of the elements.
            array4[(NUM_ELEMENTS-1)-i] = array1[i];    // If the array is size 4, then the highest index is 3, so (4-1)-i loops as 3-0=3, 3-1=2, 3-2=1, 3-3=0
        }
        // Print array4 using a for-loop.
        System.out.print("Array 4: [ ");
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println("]");

        // Explicit call to end the program
        System.exit(0);
    }
}