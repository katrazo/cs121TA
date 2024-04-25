import java.util.Stack;

public class BalancedBrackets {
    public String checkBalance(String string) {
        Stack<Character> stack = new Stack<>();

        // Loop through the string
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            // if open parenthesis
            if (c == '(')
                stack.push(c);
            // else-if closed parenthesis
            else if (c == ')') {
                if (stack.isEmpty()) // If there are no hanging open parentheses
                    return "unbalanced; leading closed parenthesis ')'";
                else // otherwise, there are hanging open parentheses, and one of them should be removed
                    stack.pop();
            }
        }

        // If there are no hanging open nor closed parentheses, it's balanced
        if (stack.isEmpty())
            return "balanced";
        else
            return "unbalanced; unpaired open parenthesis '('";
    }
}
