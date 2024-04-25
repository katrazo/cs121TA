package interfaces;

public class InputUtilityTest {
    public static void main(String[] args) {
        String myPrompt = "Please enter an integer.";

        System.out.println("\n-=-=- Scanner -=-=-");
        ScannerGrabber scannerGrabber = new ScannerGrabber();
        System.out.println(scannerGrabber.grabInt(myPrompt));

        System.out.println("\n-=-=- JOptionPane -=-=-");
        JOptionGrabber jOptionGrabber = new JOptionGrabber();
        System.out.println(jOptionGrabber.grabInt(myPrompt));

        scannerGrabber.close();
        System.exit(0);
    }
}
