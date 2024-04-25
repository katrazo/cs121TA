import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        // Must be a FileWriter because input to a File cannot be appended.
        FileWriter outputFile = new FileWriter("myFruits.txt", true);
        PrintWriter output = new PrintWriter(outputFile);

        String fruit;   // Name of the fruit
        String weight;  // Weight of the fruit in pounds
        String cost;    // Cost of the fruit per pound

        fruit = JOptionPane.showInputDialog("Enter the name of the fruit");
        weight = JOptionPane.showInputDialog(String.format("Enter the weight (in lbs.) of the %s", fruit));
        cost = JOptionPane.showInputDialog(String.format("Enter the cost per lb. of the %s", fruit));
        output.printf("%s %s %s%n", fruit, weight, cost);

        // At the end, close the PrintWriter; otherwise it WILL NOT SAVE.
        // You should close the FileWriter too.
        output.close();
        outputFile.close();
    }
}
