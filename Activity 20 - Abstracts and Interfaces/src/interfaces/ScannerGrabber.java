package interfaces;

import java.util.Scanner;

public class ScannerGrabber implements InputUtility{
    private Scanner myScanner = new Scanner(System.in);

    @Override
    public int grabInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(myScanner.nextLine());
    }

    public void close() {
        myScanner.close();
    }
}
