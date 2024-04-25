import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] array = sorting.getArray();

        System.out.printf("%nUnsorted array: %s%n", Arrays.toString(array));

        // Comment out two and run the other
//        sorting.selectionSort(array);
//        sorting.insertionSort(array);
        sorting.quickSort(array, 0, array.length-1);

        System.out.printf("Sorted array:   %s%n", Arrays.toString(array));

        System.exit(0);
    }
}
