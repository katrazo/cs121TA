import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;
    // skip index 0 (makes math easier), use variable FRONT for index 1 and make it a constant
    private static final int FRONT = 1;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[this.maxSize + 1]; // Extra +1 for zero index not being used

    }

    private int getParent(int position) {
        return position / 2;
    }

    private int getLeftChild(int position) {
        return (2 * position);
    }

    private int getRightChild(int position) {
        return 2 * position + 1;
    }

    // Check if node at index position is a leaf (no children)
    private boolean isLeaf(int position) {
        // If position >= (size / 2) and < size, it will be a leaf.
        return position >= (size / 2) && position <= size;
    }

    public void insert(int element) {
        heap[++size] = element; // add element to last spot, increase size
        int current = size; // current variable set to size
        // while value of the last element is less than its parent.
        // perform "bubble up" operation
        while (heap[current] < heap[getParent(current)]) {
            swap(current, getParent(current)); // swap it with its parent
            // set current variable to value of its parent
            // (since the value has "bubbled up" to its parent's position)
            current = getParent(current);
        }
    }

    // swaps values of 2 positions
    private void swap(int firstPosition, int secondPosition) {
        int temp;
        temp = heap[firstPosition];
        heap[firstPosition] = heap[secondPosition];
        heap[secondPosition] = temp;
    }

    public int remove() {
        int popped = heap[FRONT]; // the element at index 1 is removed
        heap[FRONT] = heap[size--]; // the element at the last index is moved to the first index

        size--; // size is decremented
        // heap array is copied to new array named heap with one less element
        heap = Arrays.copyOf(heap, heap.length - 1);
        heapifyDown(FRONT); // call minHeapify method with index 1 value as argument
        return popped; // return removed element
    }

    // performs "bubble-down" operation
    private void heapifyDown(int position) {
        // if element at index 1 is not a lead
        if (!isLeaf(position)) {
            // if element at index 1 is greater than either of its children
            if (heap[position] > heap[getLeftChild(position)] || heap[position] > heap[getRightChild(position)]) {
                // if left child is smaller than the right ...
                if (heap[getLeftChild(position)] < heap[getRightChild(position)]) {
                    swap(position, getLeftChild(position)); // swap the two elements
                    heapifyDown(getLeftChild(position)); //recursively call until element has bubbled down to correct node
                } else {
                    // if right child is smaller, swap with it and bubble down
                    swap(position, getRightChild(position));
                    heapifyDown(getRightChild(position));
                }
            }
        }
    }

    public void printHeap() {
        System.out.println("Min Heap:");
        for (int i = 1; i <= size / 2; i++) {
            System.out.printf("%15s: %d%n", "PARENT", heap[i]);
            System.out.printf("LEFT CHILD: " + heap[2*i]);
            // to avoid index out of range error, since we divide by 2 in for statement
            if (2 * i + 1 <= size)
                System.out.println(" RIGHT CHILD: " + heap[2 * i + 1]);
        }
        System.out.println();
    }

    public void printAsArray() {
        System.out.println("Min heap array: ");
        for (int node : heap)
            System.out.print(node + " ");
        System.out.println();
    }
}
