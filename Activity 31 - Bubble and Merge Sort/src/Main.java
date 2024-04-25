import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] array = sorting.getArray();

        System.out.printf("%nUnsorted array: %s%n", Arrays.toString(array));

        // Comment out one and run the other
        sorting.bubbleSortArray(array);
//        sorting.mergeSortArray(array);

        System.out.printf("Sorted array:   %s%n", Arrays.toString(array));

        System.exit(0);
    }
}
