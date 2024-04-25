import java.util.Stack;

public class BalancedAllBrackets {
    public String checkBalance(String string) {
        Stack<Character> parentheses = new Stack<>();   // Tracks parentheses ()
        Stack<Character> brackets = new Stack<>();         // Tracks open brackets []
        Stack<Character> curlyBrackets = new Stack<>();         // Tracks open curly brackets {}

        // Loop through the string
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            // if open parenthesis
            if (c == '(') {
                parentheses.push(c);
            }
            // else-if closed parenthesis
            else if (c == ')') {
                if (parentheses.isEmpty()) // If there are no hanging open parentheses
                    return "unbalanced; leading closed parenthesis ')'";
                else // otherwise, there are hanging open parentheses, and one of them should be removed
                    parentheses.pop();
            }

            // if open bracket
            if (c == '[') {
                brackets.push(c);
            }
            // else-if closed bracket
            else if (c == ']') {
                if (brackets.isEmpty()) // If there are no hanging open brackets
                    return "unbalanced; leading closed bracket ']'";
                else // otherwise, there are hanging open brackets, and one of them should be removed
                    brackets.pop();
            }

            // if open curly bracket
            if (c == '{') {
                curlyBrackets.push(c);
            }
            // else-if closed curly bracket
            else if (c == '}') {
                if (curlyBrackets.isEmpty()) // If there are no hanging open curly brackets
                    return "unbalanced; leading closed curly bracket '}'";
                else // otherwise, there are hanging open curly brackets, and one of them should be removed
                    curlyBrackets.pop();
            }

        }

        // If there are no hanging open nor closed characters, it's balanced
        if (parentheses.isEmpty() && brackets.isEmpty() && curlyBrackets.isEmpty())
            return "balanced";
        else
            return "unbalanced; unpaired open grouping symbol";
    }
}
