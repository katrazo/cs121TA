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

    public void selectionSort(int[] array) {
        int temp;
        int smallestIndex;
        int smallest;

        for (int i = 0; i < array.length; i++) {
            smallestIndex = i;
            smallest = array[i];
            for (int index = i; index < array.length; index++) {
                if (array[index] < smallest) {
                    smallestIndex = index;
                    smallest = array[index];
                }
            }
            temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

    public void insertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int index = i; index > 0; index--) {
                if (array[index] < array[index-1]) {
                    temp = array[index];
                    array[index] = array[index-1];
                    array[index-1] = temp;
                }
            }
        }
    }

    public void quickSort(int[] array, int start, int end) {
        int pivot = partition(array, start, end);
        if (start < pivot - 1)
            quickSort(array, start, pivot - 1);
        if (pivot < end)
            quickSort(array, pivot, end);
    }
    private int partition(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int temp;
        int pivot = array[(start + end) / 2];

        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;

            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }


}
