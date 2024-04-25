import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        // Relative path
        File inputFile = new File("fruits.txt");
        // Absolute path
        File inputFileAbs = new File("C:\\Users\\razoc\\OneDrive\\Desktop\\cs121TA\\Activity 22 - File Reading and Writing\\fruits.txt");

        // Putting an error in a catch condition of a try-catch block means you don't have to put in the method header that that error gets thrown
        try {
            Scanner input = new Scanner(inputFile);

            // The most simple way of reading a text file
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

            // close scanner at the end
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found.");
        }
    }
}
