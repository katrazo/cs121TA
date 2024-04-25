import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        // User Input Method: JOptionPane
        // be sure to import javax.swing.JOptionPane

        // The correct username to log in
        String username = "TAstudent4";
        // The correct password to log in
        String password = "iLikePanc4kes";

        // The user's entered username
        String name = JOptionPane.showInputDialog("Please enter your username.");
        // The user's entered password
        String pass = JOptionPane.showInputDialog("Please enter your password.");

        // Check the user inputs against the actual credentials
        if (name.equals(username) && pass.equals(password)) // if correct credentials
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        else if (!name.equals(username) && !pass.equals(password)) // else if incorrect credentials
            JOptionPane.showMessageDialog(null, "Incorrect username and password.");
        else if (!name.equals(username)) // else if username is incorrect
            JOptionPane.showMessageDialog(null, "Incorrect username.");
        else // if (!pass.equals(password)) // else (password must be incorrect, by deduction)
            JOptionPane.showMessageDialog(null, "Incorrect password.");

        // Explicit call to end program
        System.exit(0);
    }
}