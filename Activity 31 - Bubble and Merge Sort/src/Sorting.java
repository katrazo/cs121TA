import java.util.Scanner;

public class Sorting {
    public int[] getArray() {
        Scanner consoleScanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Please enter five unsorted integers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(">> ");
            array[i-1] = Integer.parseInt(consoleScanner.nextLine());
        }

        return array;
    }

    // Returning the array is redundant because this directly modifies the array at the memory address
    public void bubbleSortArray(int[] array) {
        // -=-=- (Ascending) Bubble Sort -=-=-
        int temp;
        // Loop through the whole array once for each element in the array
        for (int i = 0; i < array.length - 1; i++) {
            // for each unsorted element. loop through and compare to next element
            // length - i - 1 because we only need to loop through unsorted elements
            for (int index = 0; index < array.length - i - 1; index++) {
                // change this > to a < to make the bubble sort descending instead.
                if (array[index] > array[index + 1]) {
                    // temporarily hold value
                    temp = array[index];
                    // swap the smaller on the right to the left
                    array[index] = array[index + 1];
                    // pull that temp that used to be the left, and put it on the right
                    array[index + 1] = temp;
                }
            }
        }
    }


    public void mergeSortArray(int[] array) {
        // -=-=- Merge Sort [Recursive] -=-=-
        // if array has 1 element, return (there's nothing to sort)
        if (array.length <= 1)
            return;

        // Initialize an array with the size of the unsorted array's left half
        int[] leftHalf = new int[array.length / 2];
        // Initialize an array with the size of the unsorted array's right half (remaining)
        int[] rightHalf = new int[array.length - leftHalf.length];

        // Assign values in the left half to the leftHalf array
        for (int i = 0; i < leftHalf.length; i++)
            leftHalf[i] = array[i];
        // Assign remaining values to the right half.
        for (int i = 0; i < rightHalf.length; i++)
            rightHalf[i] = array[leftHalf.length+i];

        // recursive call until arrays reach base case: 1 element
        mergeSortArray(leftHalf);    // recursive call: divides the left half into smaller arrays
        mergeSortArray(rightHalf);   // recursive call: divides the left half into smaller arrays

        // call merge method to merge divided arrays
        merge(leftHalf, rightHalf, array);
    }
    private void merge(int[] leftHalf, int[] rightHalf, int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        //advance left half array index or right half array index accordingly
        while ((leftIndex < leftHalf.length) && (rightIndex < rightHalf.length)) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                array[arrayIndex] = leftHalf[leftIndex];
                leftIndex++;
                arrayIndex++;
            }
            else {
                array[arrayIndex] = rightHalf[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
        }

        // copy the rest of the left half to the original array
        while (leftIndex < leftHalf.length) {
            array[arrayIndex] = leftHalf[leftIndex];
            leftIndex++;
            arrayIndex++;
        }

        // copy the rest of the right half to the original array
        while (rightIndex < rightHalf.length) {
            array[arrayIndex] = rightHalf[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }
}
