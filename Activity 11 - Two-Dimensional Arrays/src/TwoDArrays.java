/**
 * This class creates three different two-dimensional arrays to showcase different methods of initializing and printing them.
 * Documentation terminology corresponds to the guidelines for the Canvas assignment, linked below.
 * @see <a href="https://bsu.instructure.com/courses/154642/assignments/1748026">Activity 11 on Canvas</a>
 */
public class TwoDArrays {
    public static void main(String[] args) {
        // 1. Create a 2-dimensional array1 of ints, with 4 inner arrays of at least 3 elements in each inner array.
        // Form: type[][] array2D = { {}, {}, {}, {} };
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };

        /* Visualization & Tips:
         *
         *              |__ col 0 __|__ col 1 __|__ col 2 __|
         *  row 0       |     1     |     2     |     3     |
         *  row 1       |     4     |     5     |     6     |
         *  row 2       |     7     |     8     |     9     |
         *  row 3       |     10    |     11    |     12    |
         *
         * 2D arrays are accessed in row-major order. (Call the row first!)
         *  -> row 0, column 2 is called as array[0][2] (3)
         *  -> row 3, column 1 is called as array[3][1] (11)
         * (Remember that rows and columns start at index 0 like most things in Java.)
         */

        // Print the array elements using a standard for-loop.
        System.out.println("\nArray 1");
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                System.out.print(array1[row][column] + " ");
            } // end inner for loop (columns in a row)
            System.out.println();
        } // end outer for loop (rows)


        // 2. Create a 2-dimensional array2 of doubles, with 4 inner arrays of at least 3 elements in each inner array
        // Form: type[][] array2D = new Array[x][y], where there are x subarrays each with a length of y elements.
        double[][] array2 = new double[4][3];
        array2[0][0] = 1.1; array2[0][1] = 2.2; array2[0][2] = 3.3;
        array2[1][0] = 4.4; array2[1][1] = 5.5; array2[1][2] = 6.6;
        array2[2][0] = 7.7; array2[2][1] = 8.8; array2[2][2] = 9.9;
        array2[3][0] = 10.0; array2[3][1] = 11.1; array2[3][2] = 12.2;

        // Print the array elements using the enhanced for loop.
        System.out.println("\nArray 2");
        for (double[]subarray : array2) {
            for (double element : subarray) {
                System.out.print(element + " ");
            } // end inner for loop (elements in a subarray)
            System.out.println();
        } // end outer for loop (subarrays in the 2D array)


        // 3. Create a 2-dimensional array of Strings with at least 2 inner arrays of at least 3 elements using either of the above methods...
        // (You may see larger hardcoded arrays expanded like this.)
        String[][] array3 = {
                {"Ann", "Andy", "Andrea"},
                {"John", "Joan", "Joanna"}
        };

        // ... and print it to the console using either of the for loops.
        System.out.println("\nArray 3");
        // Loop through each subarray in the 2D array
        for (String[]subarray : array3) {
            // Loop through each element in the subarray
            for (String element : subarray) {
                System.out.print(element + " ");
            } // end inner for loop (elements in a subarray)
            System.out.println();
        } // end outer for loop (subarrays in the 2D array)


        // Explicit call to end the program
        System.exit(0);
    }
}