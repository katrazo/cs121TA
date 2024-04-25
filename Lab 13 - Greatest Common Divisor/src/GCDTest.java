import java.util.Scanner;

public class GCDTest {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Please input two integers.");
        System.out.print("1: ");
        int n1 = Integer.parseInt(consoleScanner.nextLine());
        System.out.print("2: ");
        int n2 = Integer.parseInt(consoleScanner.nextLine());

        System.out.printf("The GCF of %d and %d is %d. [For-Loop]%n", n1, n2, gcd.findGCDForLoop(n1, n2));
        System.out.printf("The GCF of %d and %d is %d. [While-Loop]%n", n1, n2, gcd.findGCDWhileLoop(n1, n2));
        System.out.printf("The GCF of %d and %d is %d. [Recursion]%n", n1, n2, gcd.findGCDRecursively(n1, n2));

        System.exit(0);
    }
}
