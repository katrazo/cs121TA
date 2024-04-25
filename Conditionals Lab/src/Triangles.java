import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        // User Input Method: Console Scanner
        Scanner userInput = new Scanner(System.in);
        // Sides of the triangle
        int side1, side2, side3;

        // ---------------------
        // Prompt 1
        System.out.printf("%nEnter the length of the triangle's first side: ");
        // Answer 1
        // ---------------------
        side1 = Integer.parseInt(userInput.nextLine());
        // Prompt 2
        System.out.print("Enter the length of the triangle's second side: ");
        // Answer 2
        // ---------------------
        side2 = Integer.parseInt(userInput.nextLine());
        // Prompt 3
        System.out.print("Enter the length of the triangle's third side: ");
        // Answer 3
        side3 = Integer.parseInt(userInput.nextLine());
        // ---------------------

        // Deduce type of triangle
        if (side1 == side2 && side2 == side3) // if all sides are equal
            System.out.println("The triangle is equilateral.");
        else if (side1 == side2 || side2 == side3 || side3 == side1) // if any two sides are equal
            System.out.println("The triangle is isosceles.");
        else // else (no sides are equal, by deduction)
            System.out.println("The triangle is scalene.");

        // Explicit calls to end scanner and program
        userInput.close();
        System.exit(0);
    }
}