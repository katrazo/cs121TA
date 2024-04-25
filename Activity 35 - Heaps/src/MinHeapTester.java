public class MinHeapTester {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 7, 8, 4, 32, 16};
        // new heap object initialized with size of array
        MinHeap minHeap = new MinHeap(array.length);

        System.out.printf("Original array (size %d):%n", array.length);
        for (int num : array) {
            System.out.print(num + " ");
            minHeap.insert(num); // add each element to the array heap
        }

        System.out.println();
        minHeap.printAsArray();
        minHeap.printHeap();
        System.out.println();
        // remove minimum value
        System.out.printf("Minimum value %d is removed%n", minHeap.remove());
        minHeap.printAsArray();
    }
}
