import javax.swing.*;
import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        // Can be a File or a FileWriter because no information will be appended.
        File outputFile = new File("myFruits.txt");
//        FileWriter outputFile = new FileWriter("myFruits.txt"); // throws IOException
        PrintWriter output = new PrintWriter(outputFile);       // throws FileNotFoundException

        String fruit;   // Name of the fruit
        String weight;  // Weight of the fruit in pounds
        String cost;    // Cost of the fruit per pound

        // Write a file header
        output.printf("%s %s %s%n", "fruit", "weight", "cost");
        // ask user for info for 3 fruits
        for (int i = 1; i <= 3; i++) {
            fruit = JOptionPane.showInputDialog(String.format("Enter the name of fruit %d", i));
            weight = JOptionPane.showInputDialog(String.format("Enter the weight (in lbs.) of the %s", fruit));
            cost = JOptionPane.showInputDialog(String.format("Enter the cost per lb. of the %s", fruit));
            output.printf("%s %s %s%n", fruit, weight, cost);
        }
        // At the end, close the PrintWriter; otherwise it WILL NOT SAVE.
        output.close();
        // Close the FileWriter if you used it
//        outputFile.close();
    }
}
