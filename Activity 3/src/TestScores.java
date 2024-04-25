import javax.swing.JOptionPane;

public class TestScores {
    public static void main(String[] args) {

        // User Input Method:
        // javax.swing.JOptionPane

        // The three scores to be averaged
        int score1, score2, score3;

        score1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the first score."));
        score2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the second score."));
        score3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the third score."));

        // 3.0 is a double so that the result is a double.
        // Otherwise, it would be truncated because the expression would only contain integers.
        double average = (score1 + score2 + score3) / 3.0;

        // Format the output string to show the average score.
        String output = String.format("Your average score is %.2f percent. Your letter grade is: ", average);

        // Determine the letter grade and append it to the output String.
        if (average >= 90)
            output += "A";
        else if (average >= 80)
            output += "B";
        else if (average >= 70)
            output += "C";
        else if (average >= 60)
            output += "D";
        else // average <= 59
            output += "F";

        // Show the output string.
        JOptionPane.showMessageDialog(null, output);
    }
}
