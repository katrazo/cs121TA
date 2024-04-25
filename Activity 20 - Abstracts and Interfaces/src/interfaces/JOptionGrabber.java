package interfaces;

import javax.swing.*;

public class JOptionGrabber implements InputUtility{
    @Override
    public int grabInt(String prompt) {
        return Integer.parseInt(JOptionPane.showInputDialog(prompt));
    }
}
