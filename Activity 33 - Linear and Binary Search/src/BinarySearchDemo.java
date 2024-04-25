public class BinarySearchDemo {
    public int binarySearch(int key, int[] array) {
        int counter = 0;
        int low = 0;
        int high = array.length -1;
        int mid = (low + high) / 2;

        while (low <= high && array[mid] != key) {
            if (array[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;

            mid = (low + high) / 2;
            System.out.println("comparison: " + ++counter);
        }

        if (low > high)
            mid = -1;
        return mid;
    }
}
