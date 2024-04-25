import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        int[] array = {3, 5, 11, 15, 23, 35, 57, 66, 67, 71};

        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(consoleScanner.nextLine());

        int found = demo.binarySearch(key, array);
        if (found == -1)
            System.out.println("Item not found.");
        else
            System.out.printf("Item found at index %d, position %d", found, found+1);
    }
}
